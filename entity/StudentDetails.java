package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_no")
	
	private int id_no;
	
	@Column(name="name")
	private String name;
	
	@Column(name="Department")
	private String Department;
	
	@Column(name="year")
	private int year;
	
	@Column(name="blood_group")
	private String blood_group;
	@Column(name="Address")
	
	private String Address;
	 @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_no")
	private Details details;
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDetails(String name, String department, int year, String blood_group, String address) {
		super();
		
		this.name = name;
		Department = department;
		this.year = year;
		this.blood_group = blood_group;
		Address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Details getDetails()
	{
		return details;
	}
	public void setDetails(Details details)
	{
		this.details=details;
	}

	@Override
	public String toString() {
		return "StudentDetails [id_no=" + id_no + ", name=" + name + ", Department=" + Department + ", year=" + year
				+ ", blood_group=" + blood_group + ", Address=" + Address + ", details=" + details + "]";
	}

}
