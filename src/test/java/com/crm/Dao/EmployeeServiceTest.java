package com.crm.Dao;

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
	
	public void findEmployeeByName(String name, EmployeeService es) {
		List<Employee> list = es.findEmployeeByName(name);
		for(Employee e : list) {
			System.out.println(e.getName() + " : " + e.getEmployeeId() + " : " + 
					e.getEmployeeNumber() + " : " + e.getAge() + " : " + e.getTelephone());
		}
	}
	
	public void findMaxEmployeeId(EmployeeService es) {
		List<Employee> list = es.findMaxId();
		for(Employee e : list) {
			System.out.println(e.getEmployeeId() + " : " + e.getEmployeeNumber());
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("classpath:employee-jdbc.xml");
		EmployeeService es = (EmployeeService)context.getBean("employeeDao");
		Employee e = new Employee();
		EmployeeServiceTest est = new EmployeeServiceTest();
		est.addEmployeeTest(e, es);
		/*int employeeId = 2;
		est.findEmployeeById(employeeId, es);
		String employeeNumber = "20170629002";
		est.findEmployeeByNumber(employeeNumber, es);
		
		String name ="刘德华";
		est.findEmployeeByName(name, es);*/
		/*est.findMaxEmployeeId(es);*/
	}
}
