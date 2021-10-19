package com.training.bean;
import java.util.Scanner;
public class UserServices {
	static Scanner sc=new Scanner(System.in);
	static UserImpl usr=new UserImpl();
	
	public static void main(String[] args)
	{
		int choice;
		
		do {
			System.out.println("\n1.Add new Employee");
			System.out.println("2.Display all Records");
			System.out.println("3.Display Record by Id");
			System.out.println("4.Delete record by id");
			System.out.println("5.Search record by id");
			System.out.println("0.Exit\n");
			System.out.println("Enter your choice");
		    choice=sc.nextInt();
		switch(choice)
		{
		case 1: usr.addEmployee();
		        break;
		case 2: System.out.println("\t Id \t Name \t\t Email");
			    usr.displayAllEmployees();
		        break;
		case 3: usr.displayEmployee();
                break;
		case 4: usr.delEmployee();
		        break;
		case 5: usr.searchEmployee();
                break; 
		case 0:
			    System.out.println("Application terminated");
			    break;
		default:
				System.out.println("Invalid choice......");		}
		}while(choice!=0);
	}

}
