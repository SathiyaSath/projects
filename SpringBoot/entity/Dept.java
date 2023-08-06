package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Dept")
public class Dept 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="dept_id")
    private int dept_id;
    @Column(name="deptname")
    @NotBlank(message = "deptname  can not be empty")
    @Size(max = 20,message = "deptname can't be more than 20 characters")
    @Size(min=5, message="deptname must be more than 5 characters")

    private String deptname;
    @Column(name="location")
    @NotBlank(message = "location can not be empty")
    @Size(max = 20,message = "location can't be more than 20 characters")
    @Size(min=5, message="location must be more than 5 characters")

    private String location;
    @OneToMany(mappedBy="dept" )
	private Set<Employee>employees;
    public Dept()
    {
        
    }
    public Dept(int dept_id, String deptname, String location) {
        super();
        this.dept_id = dept_id;
        this.deptname = deptname;
        this.location = location;
    }
    public int getDept_id() {
        return dept_id;
    }
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
    public String getDeptname() {
        return deptname;
    }
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    

}