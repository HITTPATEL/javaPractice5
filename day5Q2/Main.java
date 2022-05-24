package com.day5Q2;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	
	   Scanner inputScanner=new Scanner(System.in);
	
	   System.out.println("Enter the ticketid:");
	   int ticketid=inputScanner.nextInt();
	   
	   System.out.println("Enter the Price:");
	   int price=inputScanner.nextInt();
	   
	   System.out.println("Enter no of tickets:");
	   int nOfBook=inputScanner.nextInt();
	   
	   System.out.println("Enter the available tickets:");
	   int availableTick=inputScanner.nextInt();
	   
	   
	   Ticket t1=new Ticket();
	   t1.setTicketid(ticketid);
	   t1.setPrice(price);
	   t1.setAvailableTickets(availableTick);
	   int total=t1.calculateTicketCost(nOfBook);
	   
	   System.out.println("Total amount:"+total);
	   System.out.println("Available ticket after booking:"+t1.getAvailableTickets());
	  
	   
	   
	   
	   
	   
}
}
