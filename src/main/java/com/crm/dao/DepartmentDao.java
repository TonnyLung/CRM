package com.crm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.domain.Department;
import com.crm.service.DepartmentService;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class DepartmentDao implements DepartmentService{
	private SessionFactory sessionFactory;
	
	//通过构造器注入依赖
	public DepartmentDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory; 
	}
	
	//获得会话
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	//添加记录
	@Override
	public void addDepartment(Department department) {
		currentSession().save(department);
	}
	
	//删除记录
	@Override
	public void deleteDepartment(Department department) {
		currentSession().delete(department);
	} 
	
	//更新记录
	@Override
	public void updateDepartment(Department department) {
		currentSession().update(department);
	}
	
	//添加或更新记录
	@Override
	public void saveOrUpdateDepartment(Department department) {
		currentSession().saveOrUpdate(department);
	}
	
	//通过部门数据库的唯一id查找
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public Department findDepartment(int departmentId) {
		return currentSession().find(Department.class, departmentId);
	}
	
	//通过部门号查找
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Department> findDepartmentByNum(String departmentNumber) {
		return currentSession().createQuery("select d from Department d where departmentNumber=?")
				.setParameter(0, departmentNumber).list();
	}
	
	//通过部门名字查找
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Department> findDepartmentByName(String name) {
		return currentSession().createQuery("select d from Department d where departmentName=?")
				.setParameter(0, name).list();
	}
	
	//查找所有记录
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Department> findAllDepartment() {
		return currentSession().createQuery("from Department").list();
	}
}
