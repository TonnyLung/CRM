package com.crm.service;

import java.util.List;
import com.crm.domain.Employee;

/**
 * @since 2017/6/19
 * @author TonnyLung
 * @version javaSE-1.8
 */
public interface EmployeeService {
	/**
	 * 将对象持久化到对应的数据库中,
	 * 单一的将一个类对象插入数据库的操作
	 * @param employee 
	 */
	public void addEmployee(Employee employee);
	
	/**
	 * 从数据库中删除相应的对象
	 * @param employee
	 */
	public void deleteEmployee(Employee employee);
	
	/**
	 * 根据id删除数据库中的对象
	 * @param id
	 */
	public void deleteEmployeeById(String employeeNumber);
	
	/**
	 * 批量删除数据库中的对象
	 * @param ids
	 */
	public void delEmployeeBatch(List<?> employeeNumbers);
	
	/**
	 * 更新数据库中的对象
	 * @param employee
	 */
	public void UpdateEmployee(Employee employee);
	
	/**
	 * 根据对象是瞬时对象还是游离对象将对象save或者update到数据库中
	 * @param employee
	 */
	public void addOrUpdateEmployee(Employee employee);
	
	/**
	 * 根据id查找数据库中的对象
	 * @param id
	 * @return
	 * 返回一个查询的对象
	 */
	public Employee findEmployee(int employeeId);
	
	/**
	 * 根据员工工号来查询员工
	 * @param employeeNumber
	 * @return
	 * 返回一个员工实体
	 */
	public List<Employee> findEmployeeByEmployeeNumber(String employeeNumber);
	
	/**
	 * 查询数据库中所有的对象
	 * @return 返回一个存储了所查找类对象的列表
	 * 通过对列表遍历就可以得到所有查找到的数据库记录
	 */
	public List<Employee> findAllEmoployee();
}
