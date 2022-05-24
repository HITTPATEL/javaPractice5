package com.day5Q1;

import java.util.Scanner;

public class Main {

	public static Employee getEmployeeDetails() {
	       Scanner input=new Scanner(System.in);
		
		    System.out.println("Enter ID");
		    int id=input.nextInt();
		    input.nextLine();
		    System.out.println("Enter Name");
		    String name=input.nextLine();
		    System.out.println("Enter Salary");
		    double salary=input.nextDouble();
		 
		    Employee e1=new Employee();
		    
		    e1.setEmployeeName(name);
		    e1.setEmployeeId(id);
		    e1.setSalary(salary);
		     
			return e1;
		}
	public static int getPFpercentage(){
		   Scanner input=new Scanner(System.in);
		    System.out.println("Enter pfpercentage");
		    int pfpercentage=input.nextInt();
   	 return pfpercentage;
    }
	
	public static void main(String[] args) {
		
		
	 Employee e1=Main.getEmployeeDetails();
	  int pf=Main.getPFpercentage();
	  e1.calculateNetSalary(pf);
		 
	    System.out.println("ID :"+e1.getEmployeeId());
	    System.out.println("Name :"+e1.getEmployeeName());
	    System.out.println("Salary :" +e1.getSalary());
	    System.out.println("Net Salary "+e1.getNetSalary());
	   
	    
		
		
		
		
	}
}
