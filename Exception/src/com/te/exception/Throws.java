package com.te.exception;

public class Throws {
	public void hai() throws Exception {
		System.out.println("no");
		throw new Exception();
	}

	public static void main(String[] args) {
		System.out.println("who has done?");
	Throw td=new Throw();
	try {
	td.hai();
	}catch(Exception e){
		System.out.println("Exception occured");
	}
	}
}

