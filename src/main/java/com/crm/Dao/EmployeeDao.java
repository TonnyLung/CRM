package com.crm.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.domain.Employee;

@Repository
@Transactional(propagation=Propagation.SUPPORTS)
public class EmployeeDao {
	private SessionFactory sessionFactory;
	
	//注入会话工厂对象
	@Autowired
	public EmployeeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//通过会话工厂获得一个会话
	Session session = sessionFactory.getCurrentSession();
	
	//将对象持久化到对应的数据库中
	public void addEmployee(Employee employee) {
		session.save(employee);
	}
	
	//从数据库中删除相应的对象
	public void deleteEmployee(Employee employee) {
		session.delete(employee);
	}
	
	//根据id删除数据库中的对象
	public void deleteEmployeeById(int id) {
		session.createQuery("delete from Employee e where e.employeeNumber=? ")
				.setParameter(0, id).executeUpdate();
	}
	
	//批量删除数据库中的对象
	public void delEmployeeBatch(List<?> ids) {
		session.createQuery("delete from Employee e where employeeId in (:ids)")
				.setParameterList("ids", ids).executeUpdate();	
	}
	
	//更新数据库中的对象
	public void UpdateEmployee(Employee employee) {
		session.update(employee);
	}
	
	//根据对象是瞬时对象还是游离对象将对象save或者update到数据库中
	public void addOrUpdateEmployee(Employee employee) {
		session.saveOrUpdate(employee);
	}
	
	//根据id查找数据库中的对象
	public Employee findEmployee(int id) {
		return session.get(Employee.class, id);
	}
	
	//查询数据库中所有的对象
	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmoployee() {
		return session.createQuery("from Employee").list();
	}
}
