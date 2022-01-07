package com.te.exception;

public class Finallyblock {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
			int d=a/b;
			System.out.println(d);
		}
	catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("hai ranjitha g n");
		}
	}

}
