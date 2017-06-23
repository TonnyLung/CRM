package com.crm.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private Integer departmentId;
	
	@Column(name = "department_number")
	private String departmentNumber;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "department_telephone")
	private String departmentTelephone;
	
	@Column(name = "department_description")
	private String departmentDescription;
	
	@Column(name = "dept_create_time")
	private Date deptCreateTime;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentTelephone() {
		return departmentTelephone;
	}

	public void setDepartmentTelephone(String departmentTelephone) {
		this.departmentTelephone = departmentTelephone;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public Date getDeptCreateTime() {
		return deptCreateTime;
	}

	public void setDeptCreateTime(Date deptCreateTime) {
		this.deptCreateTime = deptCreateTime;
	}
	
	
}
