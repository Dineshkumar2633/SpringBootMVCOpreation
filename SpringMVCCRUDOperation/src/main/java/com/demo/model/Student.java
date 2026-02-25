package com.demo.model;

import java.io.Serializable; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="StudentRegister")
public class Student implements Serializable
{
	@Id
	@Column(name="Student_Id")
	@GenericGenerator(name="ref", strategy="increment")
	@GeneratedValue(generator = "ref")
    private int id;
	
	@Column(name="Student_Name")
	private String name;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Course")
	private String course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
