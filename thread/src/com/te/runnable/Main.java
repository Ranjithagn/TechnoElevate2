package com.te.runnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
Thread thread = new Thread(myThread);
thread.start();
System.out.println("Program is running");
	}

}
