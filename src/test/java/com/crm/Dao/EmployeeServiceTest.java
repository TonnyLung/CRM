package com.crm.Dao;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.domain.Employee;
import com.crm.service.EmployeeService;

public class EmployeeServiceTest {
	public void addEmployeeTest(Employee e, EmployeeService es) {
		e.setName("刘德华");
		e.setAge(58);
		e.setSex("男");
		e.setIdClass("身份证");
		e.setIdNumber("362421196509315628");
		e.setTelephone("13819647008");
		e.setHomeAddress("香港中路");
		e.setWorkingAddress("香港中环");
		e.setEmail("liudehua@163.com");
		e.setEmergencyContactPerson("刘祖英");
		e.setEmergencyContactTelephone("15115687008");
		e.setEducation("本科");
		e.setSchool("香港大学");
		e.setSpecialty("表演专业");
		e.setDepartmentId("102");
		e.setJob("设计工程师");
		e.setLevel("L0");
		e.setJobState("实习");
		e.setDescription("快乐");
		e.setCreateTime(new Date(0));
		es.addEmployee(e);
	}
	
	public void findEmployeeById(int employeeId, EmployeeService es) {
		Employee e = es.findEmployee(employeeId);
		System.out.println(e.getName() + " : " + e.getEmployeeId() + " : " + 
				e.getEmployeeNumber() + " : " + e.getAge() + " : " + e.getTelephone());
	}
	
	public void findEmployeeByNumber(String employeeNumber, EmployeeService es) {
		List<Employee> list = es.findEmployeeByEmployeeNumber(employeeNumber);
		for (Employee e : list) {
			System.out.println(e.getName() + " : " + e.getEmployeeId() + " : " + 
					e.getEmployeeNumber() + " : " + e.getAge() + " : " + e.getTelephone());
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("classpath:employee-servlet.xml");
		EmployeeService es = (EmployeeService)context.getBean("employeeDao");
		/*Employee e = new Employee();*/
		EmployeeServiceTest est = new EmployeeServiceTest();
		/*est.addEmployeeTest(e, es);*/
		int employeeId = 2;
		est.findEmployeeById(employeeId, es);
		
		String employeeNumber = "20170624002";
		est.findEmployeeByNumber(employeeNumber, es);
	}
}
