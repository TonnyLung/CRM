package com.crm.domain;

import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "employee_number")
	private String employeeNumber;
	
	private String name;
	
	private String sex;
	
	private Integer age;
	
	@Column(name = "id_class")
	private String idClass;
	
	@Column(name = "id_number")
	private String idNumber;
	
	private String telephone;
	
	@Column(name = "home_address")
	private String homeAddress;
	
	@Column(name = "working_address")
	private String workingAddress;
	
	private String email;
	
	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;
	
	@Column(name = "emergency_contact_telephone")
	private String emergencyContactTelephone;
	
	private String education;
	
	private String school;
	
	private String specialty;
	
	@Column(name = "department_id")
	private String departmentId;
	
	private String job;
	
	private String level;
	
	@Column(name = "job_state")
	private String jobState;
	
	private String description;
	
	public Employee(){}
	
	public Employee(Integer employeeId, String employeeNumber) {
		this.employeeId = employeeId;
		this.employeeNumber = employeeNumber;
	}
	
	public void employeeNumber() {
		//用日期和一个从001开始的三位数共同作为员工工号
		//如：20160624001前面8为为年月日组成后面三位为一个从001自动升号的三位数
		java.util.Date date = new java.util.Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		//获得日期前缀
		String prefix = format.format(date);
		int count = 1;
		//获得一个局部日期变量,用来与类日期变量进行比较,如果相等则什么都不做，
		//如果不等则将计数器清零,重新计数,且将局部日期变量赋值给类日期变量,用以改变日期
		//将整数类型转换成字符串类型再根据字符串长度对其进行拼接
		String scount = String.valueOf(count);
		if(scount.length() == 1) {
			scount = "00" + scount;
		} else if(scount.length() == 2) {
			scount = "0" + scount;
		}
		this.setEmployeeNumber(prefix + scount);
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String isSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getWorkingAddress() {
		return workingAddress;
	}

	public void setWorkingAddress(String workingAddress) {
		this.workingAddress = workingAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyContactPerson() {
		return emergencyContactPerson;
	}

	public void setEmergencyContactPerson(String emergencyContactPerson) {
		this.emergencyContactPerson = emergencyContactPerson;
	}

	public String getEmergencyContactTelephone() {
		return emergencyContactTelephone;
	}

	public void setEmergencyContactTelephone(String emergencyContactTelephone) {
		this.emergencyContactTelephone = emergencyContactTelephone;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getspecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getJobState() {
		return jobState;
	}

	public void setJobState(String jobState) {
		this.jobState = jobState;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
