package com.kk.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="Employee_ID")
	private Long empId;
	
	@Column(name="Employee_Name")
	private String empName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ManyToMany")
	private List<Project> project;
	
	public Employee() {
		super();
		
	}
	public Employee(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
		
	
}
