package com.app;

import java.io.Serializable;
import java.time.LocalDate;

public class student implements Serializable{
	private String rollno;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private course coursename;
	private qualification qname;
	private LocalDate dob;
	private double fees;
	boolean isdocsubmitted;
	public student(String rollno, String firstname, String lastname, String email, String address, course coursename,
			qualification qname, LocalDate dob,double fees) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.coursename = coursename;
		this.qname = qname;
		this.dob = dob;
		this.fees=fees;
		this.isdocsubmitted=true;
	}
	
	
	public student(String rollno) {
		super();
		this.rollno = rollno;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public course getCoursename() {
		return coursename;
	}
	public void setCoursename(course coursename) {
		this.coursename = coursename;
	}
	public qualification getQname() {
		return qname;
	}
	public void setQname(qualification qname) {
		this.qname = qname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public boolean isIsdocsubmitted() {
		return isdocsubmitted=true;
	}


	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", address=" + address + ", coursename=" + coursename + ", qname=" + qname + ", dob=" + dob
				+ ", fees=" + fees + "]";
	}


	
	

	
	
}
