package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userid")
    private int userid;
    @Column(name="first_name")
    @NotNull(message = "first name can not be empty")
	@Size(max = 20,message = "first name can't be more than 20 characters")
	@Size(min=5, message="first name must be more than 5 characters")

    private String first_name;
    @Column(name="last_name")
    @NotNull(message = "first name can not be empty")
	@Size(max = 20,message = "last_name can't be more than 20 characters")
	@Size(min=1, message="last_name must be more than 5 characters")

    private String last_name;
    @Column(name="username")

    private String username;
    @NotNull(message = "password can not be empty")
    @Column(name="password")
    @Size(min = 5, max =20,message = "password must be between 8 to 20 characters long.")

    private String password;
    @Size(min=2, max=30)
    @NotNull(message = "address1 can not be empty")

    @Column(name="address1")

    private String address1;
    @Size(min=2, max=30)
    @NotNull(message = "address2 can not be empty")

    @Column(name="address2")

    private String address2;
    public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public User()
    {
        
    }
    public User(int userid, String first_name, String last_name, String username, String password) {
        super();
        this.userid = userid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

}