package com.example.demoforpoc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table
public class Bankappointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="app_id")
	private int appid;
	
	@Column(name="app_name")
	@NotEmpty(message = "Please Enter Name")
	private String appname;
	
	@Column(name="address")
	@NotEmpty(message = "Please Enter Address")
	private String address;
	
	@Column(name="contact_no")
	@NotEmpty(message = "Please Enter Contact Number")
	@Pattern(regexp = "^\\d{10}$",message = "Please Enter valid Mobile Number")
	private String contactno;
	
	@Column(name="app_date")
	@NotEmpty(message = "Please Enter Date")
	
	private String appdate;
	
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAppdate() {
		return appdate;
	}
	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}

}
