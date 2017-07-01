package com.crm.service;

import java.util.List;
import com.crm.domain.Department;

/**
 * 部门相关数据的增删查改
 * @author TonnyLung
 * @version jdk 1.8
 * @since 20170626
 */
public interface DepartmentService {
	/**
	 * 添加部门记录
	 * @param department
	 */
	public void addDepartment(Department department);
	
	/**
	 * 删除记录
	 * @param department
	 */
	public void deleteDepartment(Department department);
	
	/**
	 * 更新记录
	 * @param department
	 */
	public void updateDepartment(Department department);
	
	/**
	 * 添加或者更新记录
	 * @param department
	 */
	public void saveOrUpdateDepartment(Department department);
	
	/**
	 * 通过部门数据库的唯一id查找
	 * @param departmentId
	 * @return
	 * 返回一个装有所有查找到的记录的列表容器
	 */
	public Department findDepartment(int departmentId);
	
	/**
	 * 通过部门号查找
	 * @param departmentNumber
	 * @return
	 * 返回一个装有所有查找到的记录的列表容器
	 */
	public List<Department> findDepartmentByNum(String departmentNumber);
	
	/**
	 * 通过部门名字查找
	 * @param name
	 * @return
	 * 返回一个装有所有查找到的记录的列表容器
	 */
	public List<Department> findDepartmentByName(String name);
	
	/**
	 * 查找所有记录
	 * @return
	 * 返回一个装有所有查找到的记录的列表容器
	 */
	public List<Department> findAllDepartment();
}
