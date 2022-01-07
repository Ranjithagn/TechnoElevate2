package com.te.runnable;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("the name of the current thread is :"+Thread.currentThread().getName());
		System.out.println("the thread id is : "+Thread.currentThread().getId());
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
		System.out.println(i);
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e){}
	}

}
}

