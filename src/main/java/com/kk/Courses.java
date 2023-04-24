package com.kk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	
	@Column(name="Course_Name")
	private String courseName;
	
	@Column(name="Course_Duration")
	private String courseDuration;
	
	@ManyToOne
	private Students students;

	public Courses() {
		super();
		
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Students getStudent() {
		return students;
	}

	public void setStudent(Students student) {
		this.students = student;
	}

	
	public Courses(Long courseId, String courseName, String courseDuration, Students student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.students = student;
	}

	public Courses(String courseName, String courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", students=" + students + "]";
	}
	
	
}
