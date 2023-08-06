package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eId")
	private int eId;
	@NotNull(message = "Employee name can not be empty")
	@Size(max = 20,message = "Employee name can't be more than 20 characters")
	@Size(min=5, message="Employee name must be more than 5 characters")
	@Column(name="ename")

	private String ename;
	@NotBlank(message = "jobrole  can not be empty")
	@Size(max = 20,message = "jobrole can't be more than 20 characters")
	@Size(min=6, message="jobrole must be more than 5 characters")
	@Column(name="jobrole")
	private String jobrole;
	@NotNull(message = "Salary can not be null")
	@Max(value=100000, message ="Salary should not be greater than 10000" )
	@Min(value=10000, message="Salary must be greater than 1000")
	@Column(name="salary")

	private Double salary;
	@Column(name="exp")
	@NotNull(message = "exp can not be empty")
	
	private int exp;
	@Column(name="hiredate")
	@CreationTimestamp

	private Date hiredate;
	@Column(name="imagepath")

	private String imagepath;
	@Column(name="qualification")
	@NotBlank(message = "qualification  can not be empty")
	@Size(max = 20,message = "qualification can't be more than 20 characters")
	@Size(min=3, message="qualification must be more than 6 characters")
	private String qualification;
	

	@Column(name="dept_id")
	private int dept_id;
	@ManyToOne(targetEntity=Dept.class,fetch=FetchType.EAGER)
	@JoinColumn(name="dept_id",insertable = false,updatable = false)
	private Dept dept;
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Employee()
	{
		
	}
	public Employee(int eId, String ename, String jobrole, double salary, int exp, Date hiredate, String imagepath,
			String qualification,int dept_id) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.jobrole = jobrole;
		this.salary = salary;
		this.exp = exp;
		this.hiredate = hiredate;
		this.imagepath = imagepath;
		this.qualification = qualification;
		this.dept_id=dept_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	

}    