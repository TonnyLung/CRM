package com.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "employee_number")
	private String employeeNumber;
	
	@Size(min=2, max=10, message="名字长度为1到5个文字,或2到10个英文单词")
	private String name;
	
	@NotNull(message="选择性别")
	private String sex;
	
	@Range(min=18, max=70, message="年龄在18到70岁之间")
	@NotNull(message="年龄不能为空")
	private Integer age;
	
	@Column(name = "id_class")
	private String idClass;
	
	@Column(name = "id_number")
	@NotNull(message="身份证号不能 为空")
	private String idNumber;
	
	@Size(min=11, max=11, message="请输入11位手机号码")
	private String telephone;
	
	@Column(name = "home_address")
	private String homeAddress;
	
	@Column(name = "working_address")
	@NotNull(message="现居地址不能 为空")
	private String workingAddress;
	
	@Email
	private String email;
	
	@Column(name = "emergency_contact_person")
	private String emergencyContactPerson;
	
	@Column(name = "emergency_contact_telephone")
	private String emergencyContactTelephone;
	
	private String education;
	
	private String school;
	
	private String specialty;
	
	@Column(name = "department_id")
	@NotNull(message="部门号不能 为空")
	private String departmentId;
	
	@NotNull(message="职务不能 为空")
	private String job;
	
	@NotNull(message="级别不能 为空")
	private String level;
	
	@Column(name = "job_state")
	@NotNull(message="工作状态不能 为空")
	private String jobState;
	
	
	private String description;
	
	public Employee(){}
	
	public Employee(Integer employeeId, String employeeNumber) {
		this.employeeId = employeeId;
		this.employeeNumber = employeeNumber;
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

	public String getSex() {
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

	public String getSpecialty() {
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
