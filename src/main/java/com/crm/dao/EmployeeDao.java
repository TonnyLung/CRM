package com.crm.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.domain.Employee;
import com.crm.service.EmployeeService;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class EmployeeDao implements EmployeeService{
	private SessionFactory sessionFactory;
	
	//注入会话工厂对象
	@Autowired
	public EmployeeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	//将对象持久化到对应的数据库中
	@Override
	public void addEmployee(Employee employee) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String prefix = format.format(date);
		Session session = currentSession();
		List<Employee> list = findMaxId();
		for(Employee e : list) {
			String currentLastEmployeeNumber = e.getEmployeeNumber();
			System.out.println(currentLastEmployeeNumber);	
			String theDateNumber = currentLastEmployeeNumber.substring(0,8);
			System.out.println(theDateNumber);
			if(currentLastEmployeeNumber == null || !theDateNumber.equals(prefix)) {
				employee.setEmployeeNumber(prefix + "001");
			} else {
				long temp = Long.parseLong(currentLastEmployeeNumber) + 1;
				employee.setEmployeeNumber("" + temp);
			}
		}
		session.save(employee);
	}
	
	//从数据库中删除相应的对象
	@Override
	public void deleteEmployee(Employee employee) {
		currentSession().delete(employee);
	}
	
	//根据id删除数据库中的对象
	@Override
	public void deleteEmployeeById(String employeeNumber) {
		currentSession().createQuery("delete from Employee e where e.employeeNumber=? ")
				.setParameter(0, employeeNumber).executeUpdate();
	}
	
	//批量删除数据库中的对象
	@Override
	public void delEmployeeBatch(List<?> employeeNumbers) {
		currentSession().createQuery("delete from Employee e where employeeId in (:employeeNumbers)")
				.setParameterList("employeeIds", employeeNumbers).executeUpdate();	
	}
	
	//更新数据库中的对象
	@Override
	public void updateEmployee(Employee employee) {
		currentSession().update(employee);
	}
	
	//根据对象是瞬时对象还是游离对象将对象save或者update到数据库中
	@Override
	public void addOrUpdateEmployee(Employee employee) {
		currentSession().saveOrUpdate(employee);
	}
	
	//根据id查找数据库中的对象
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public Employee findEmployee(int employeeId) {
		return currentSession().get(Employee.class, employeeId);
	}
	//根据员工号来查询员工
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public List<Employee> findEmployeeByEmployeeNumber(String employeeNumber) {
		return currentSession()
				.createQuery("select e from Employee e where e.employeeNumber=?")
				.setParameter(0, employeeNumber).list();
	}
	
	//查询数据库中所有的对象
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public List<Employee> findAllEmployee() {
		return currentSession().createQuery("from Employee").list();
	}
	
	//根据员工名字查找员工
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public List<Employee> findEmployeeByName(String name) {
		return currentSession().createQuery("select e from Employee e where name=?")
					.setParameter(0, name).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findMaxId() {
		return currentSession().createQuery
				("select new Employee(max(e.employeeId), max(e.employeeNumber)) from Employee e").list();
	}
}
