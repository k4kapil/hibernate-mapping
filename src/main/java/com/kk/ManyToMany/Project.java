package com.kk.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

	@Id	
	@Column(name="Project_ID")
	private Long projectId;
	
	@Column(name="Project_Name")
	private String projectName;
	
	@ManyToMany(mappedBy="project")
	private List<Employee> emp;
	
	
	public Project() {
		super();	
	}
	public Project(Long projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
}
