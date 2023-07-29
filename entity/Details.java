package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Details")
public class Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_no")
	private int id_no;
	public int getId_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	
	@Column(name="name")
	private String name;
	@Column(name="fee_Paid_Info")

	private String fee_Paid_Info;
	@Column(name="attentance_percentage")
	private double attentance_percentage;
	@Column(name="GCPA_Details")
	private double GCPA_Details;
	
	   

	public Details() {
		// TODO Auto-generated constructor stub
	}
	public Details(String name,String fee_Paid_Info, double attentance_percentage, double gCPA_Details) {
		super();
		this.name=name;
		this.fee_Paid_Info = fee_Paid_Info;
		this.attentance_percentage = attentance_percentage;
		GCPA_Details = gCPA_Details;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFee_Paid_Info() {
		return fee_Paid_Info;
	}
	public void setFee_Paid_Info(String fee_Paid_Info) {
		this.fee_Paid_Info = fee_Paid_Info;
	}
	public double getAttentance_percentage() {
		return attentance_percentage;
	}
	public void setAttentance_percentage(double attentance_percentage) {
		this.attentance_percentage = attentance_percentage;
	}
	public double getGCPA_Details() {
		return GCPA_Details;
	}
	public void setGCPA_Details(double gCPA_Details) {
		GCPA_Details = gCPA_Details;
	}
	@Override
	public String toString() {
		return "Details [id_no=" + id_no + ", name=" + name + ", fee_Paid_Info=" + fee_Paid_Info
				+ ", attentance_percentage=" + attentance_percentage + ", GCPA_Details=" + GCPA_Details + "]";
	}
	
	
	

}
