package com.training.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UserImpl {
	
	static private User user;
	static Scanner sc=new Scanner(System.in);
    static ArrayList arrayList=new ArrayList();
    
	public static void addEmployee()
	{
	System.out.println("Enter Employee Id");
	int empId=sc.nextInt();
	System.out.println("Enter Employee Name");
	String empName=sc.next();
	System.out.println("Enter Employee email");
	String empEmail=sc.next();
	user=new User(empId,empName,empEmail);
	arrayList.add(user);
	}
	
	public static void displayAllEmployees()
	{
	if(arrayList.isEmpty()) {
	System.out.println("No Employees in list");
	}
	else {
	ListIterator itr = arrayList.listIterator();
	while(itr.hasNext()) {
	System.out.println((User)itr.next());
	}
	}
	}
	
	public static void searchEmployee() {
		System.out.println("Enter id");
		int id=sc.nextInt();
		ListIterator itr = arrayList.listIterator();
		
		while(itr.hasNext()) {
			if(((User) itr.next()).getEmpId()==id) {
				System.out.println("Id "+id+" present in database");
			}else {
				System.out.println("Invalid Id");
			}
		}
	}
	
	public User getEmployee(int empid) {
		User temp=null;
		boolean status=false;
		Iterator <User> itr=arrayList.iterator();
		while(itr.hasNext()) {
			temp=itr.next();
			if(temp.getEmpId()==empid) {
				status=true;
				return temp;
			}
		}
		if(status==false)
			temp=null;
		return null;
	}
	
	public void delEmployee(){
		System.out.println("Enter id: ");
		int empid=sc.nextInt();
		User temp=null;
		temp=getEmployee(empid);
		if(temp==null) {
			System.err.println(empid+" not found");
		}else {
			arrayList.remove(temp);
			System.out.println("record deleted");
		}
	}
	
	public void displayEmployee(){
		System.out.println("Enter id: ");
		int empid=sc.nextInt();
		User temp=null;
		temp=getEmployee(empid);
		if(temp==null) {
			System.err.println(empid+" not found");
		}else {
			System.out.println(temp);
		}
	}

}


