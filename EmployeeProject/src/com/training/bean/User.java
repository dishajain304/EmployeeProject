package com.training.bean;

import java.util.Iterator;

public class User {
	private int empId;
	private String empName;
	private String empEmail;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	@Override
	public String toString() {
		return "\t "+empId+"\t "+empName+"\t\t "+empEmail;
	}
	public User(int empId, String empName, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}
	public User() {
		//default constructor
		
	}
}
