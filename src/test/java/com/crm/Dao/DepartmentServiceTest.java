package com.crm.Dao;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.domain.Department;
import com.crm.service.DepartmentService;

public class DepartmentServiceTest {
	public void add(Department department, DepartmentService ds) {
		department.setDepartmentNumber("001");
		department.setDepartmentName("销售部");
		department.setDepartmentTelephone("13879681184");
		department.setDepartmentDescription("业绩");
		ds.addDepartment(department);
	}
	
	public void findDept(int departmentId, DepartmentService ds) {
		Department dept = ds.findDepartment(departmentId);
		System.out.println(dept.getDepartmentNumber() + " : " + dept.getDepartmentName()
					+ " : " + dept.getDepartmentTelephone());
	}
	
	public void findAllDept(DepartmentService ds) {
		List<Department> ldept = ds.findAllDepartment();
		for(Department dept : ldept) {
			System.out.println(dept.getDepartmentNumber() + " : " + dept.getDepartmentName()
			+ " : " + dept.getDepartmentTelephone());
		}
	}
	
	public void findDeptByName(String name, DepartmentService ds) {
		List<Department> ldept = ds.findDepartmentByName(name);
		for(Department dept : ldept) {
			System.out.println(dept.getDepartmentNumber() + " : " + dept.getDepartmentName()
			+ " : " + dept.getDepartmentTelephone());
		}
	}
	
	public void findDeptByDeptNum(String deptNum, DepartmentService ds) {
		List<Department> ldept = ds.findDepartmentByNum(deptNum);
		for(Department dept : ldept) {
			System.out.println(dept.getDepartmentNumber() + " : " + dept.getDepartmentName()
			+ " : " + dept.getDepartmentTelephone());
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("classpath:employee-jdbc.xml");
		DepartmentService ds = (DepartmentService)context.getBean("departmentDao");
		/*Department dept = new Department();*/
		DepartmentServiceTest dst = new DepartmentServiceTest();
		/*dst.add(dept, ds);*/
		dst.findAllDept(ds);
		dst.findDept(1, ds);
		dst.findDeptByName("销售部", ds);
		dst.findDeptByDeptNum("001", ds);
	}
}
