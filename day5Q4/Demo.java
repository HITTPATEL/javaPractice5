package com.day5Q4;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class Demo {
      public static void main(String[] args) {
    	  System.out.println("==============================");
		  Scanner inputScanner=new Scanner(System.in);
		  
		  System.out.println("Student Object count");
		  int student=inputScanner.nextInt();
		  
		  Student [] students= new Student[student];
		  Scanner inputScanner2=new Scanner(System.in);
		  for(int i=0; i<students.length; i++) {
			  Student s= new Student();
		      
		      
		      System.out.println("Enter Roll no. :");
		      int roll=inputScanner2.nextInt();
		      
		      inputScanner2.nextLine();
		      System.out.println("Enter Name :");
		      String name=inputScanner2.nextLine();
		      
		
		      System.out.println("Enter Address :");
		      String address=inputScanner2.nextLine();
		      
		      System.out.println("Enter Marks :");
		      int marks=inputScanner2.nextInt();
		      
		      s.setAddress(address);
		      s.setMarks(marks);
		      s.setName(name);
		      s.setRoll(roll);
		      System.out.println("================================");
		      System.out.println("Name of Student : "+s.getName());
		      System.out.println("Roll no. : "+ s.getRoll());
		      System.out.println("Marks : "+ s.getMarks());
		      System.out.println("Address : "+ s.getAddress());
		      System.out.println("================================");
		      students[i]=s;
		  }
		  
		  //To find average of the marks :-
		  int sum=0;
		  int average=0;
		  for(Student item :students) {
			   sum+=item.getMarks();
		  }
		  average=sum/students.length;
		  System.out.println("Average of student marks is : " + average);
		  
	}
}
