package com.te.exception;

public class Manikanth {
	public void happen() throws Blocked{
		System.out.println("Hello ,kutti");
		throw new Blocked("your not eligible to be my soulmate kutti.");
	}

	public static void main(String[] args) {
		Manikanth manikanth=new Manikanth();
		try{
			manikanth.happen();
		}catch (Blocked e){
			System.out.println(e.message);
		}
	}

}
