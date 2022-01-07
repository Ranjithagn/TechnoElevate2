package com.te.irctcapp;

public class TicketBook {
int tickets=20;
public void bookTickets(int noOfTickets,String name){
	System.out.println("Login Succesfull");
	System.out.println("welcome to IRCTC");
	System.out.println("Hello "+name);
	synchronized (this) {
		if(tickets<noOfTickets){
			System.out.println("Tickets are not available");
			System.out.println("*********************");
		}else{
			System.out.println(noOfTickets+"Tickets are booked");
			tickets-=noOfTickets;
			System.out.println("Number of tickets left:"+tickets);
			System.out.println("*********************");
		}
	}
	System.out.println("thank you");
}

}
