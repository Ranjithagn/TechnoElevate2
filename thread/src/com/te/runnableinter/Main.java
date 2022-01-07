package com.te.runnableinter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread myThread = new MyThread();
Thread currentThread = Thread.currentThread();
System.out.println("the name of the current thread is :"+currentThread.getName());
currentThread.setName("chotta beem");
System.out.println("the name of the current thread is :"+currentThread.getName());
Thread thread = new Thread(myThread);
thread.setName("chutki");
thread.start();
System.out.println("the thread id is: "+currentThread.getId());
	}

}
