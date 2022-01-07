package com.te.exception;

public class Stackoverflow {              //stack over flow
	public static void m1(){
		System.out.println("From m1");
		m1();
	}

	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}

}
