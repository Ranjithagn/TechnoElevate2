package com.te.exception;

public class Throw {
	public void hai(){
		System.out.println("no");
		throw new ArrayIndexOutOfBoundsException();
	}

	public static void main(String[] args) {
		System.out.println("who has done?");
	Throw td=new Throw();
	td.hai();

	}

}
