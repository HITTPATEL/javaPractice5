package com.day5Q3;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails() {
		Scanner inputScanner=new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int id=inputScanner.nextInt();
		
		System.out.println("Enter account type:");
		String typeString=inputScanner.next();
		
		System.out.println("Enter Balance:");
		int balance=inputScanner.nextInt();
		
		Account a1=new Account();
		
		if(balance>0) {
			a1.setAccountId(id);
			a1.setAccountType(typeString);
			a1.setBalance(balance);
			
		}
		else {
			while(balance<=0) {
				System.out.println("Balance should be positive");
				System.out.println("Enter Balance:");
				 balance=inputScanner.nextInt();
			
			}
		}
		
		return a1;
	}
	
	
	public int getWithdrawAmount() {
		
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Enter withdraw amount ");
		int withAmount=inputScanner.nextInt();
	   while(withAmount<=0) {
		   System.out.println("Amount should be positive");
		   System.out.println("Enter withdraw amount ");
			withAmount=inputScanner.nextInt();
	   }
	   return withAmount;
	}
	public static void main(String[] args) {
		 AccountDetails a1=new AccountDetails();
		 int withdraw=a1.getWithdrawAmount();
		 
	     Account hittu=a1.getAccountDetails();
	     
	    hittu.withdraw(withdraw);
	  
		
		
		
	}

}
