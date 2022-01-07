package com.te.irctcapp;

public class IrctcApp {

	public static void main(String[] args) {
		TicketBook  ticketBook=new TicketBook();

		Passenger vamsi = new Passenger(ticketBook, 10, "vamsi");
		Passenger bhushan = new Passenger(ticketBook, 5, "bhushan");
		Passenger siddhu = new Passenger(ticketBook, 15, "siddhu");
		vamsi.start();
		bhushan.start();
		siddhu.start();

	}

}
