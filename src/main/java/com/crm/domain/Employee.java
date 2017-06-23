package com.crm.domain;

import java.sql.Date;

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
	private Integer EmployeeId;
	
	@Column(name = "empolyee_number")
	private String employeeNumber;
	
	private boolean sex;
	
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
	
	private String specially;
	
	@Column(name = "department_id")
	private String departmentId;
	
	private String job;
	
	private String level;
	
	@Column(name = "job_state")
	private String jobState;
	
	private String description;
	
	@Column(name = "create_time")
	private Date createTime;

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
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

	public String getSpecially() {
		return specially;
	}

	public void setSpecially(String specially) {
		this.specially = specially;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
