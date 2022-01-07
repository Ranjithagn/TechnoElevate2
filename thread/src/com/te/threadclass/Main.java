package com.te.threadclass;
public class Main {

	public static void main(String[] args) {
		Demo demo = new Demo();
		Demo2 demo2 = new Demo2();
		System.out.println("The main thread priority:"+Thread.currentThread().getPriority());
		demo2.setPriority(10);
		demo.setPriority(1);
		demo.start();
		demo2.start();
		for(int i=11;i<20;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

