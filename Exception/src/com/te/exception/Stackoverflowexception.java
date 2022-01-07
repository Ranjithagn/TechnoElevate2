package com.te.exception;

public class Stackoverflowexception {

	public static void main(String[] args) {
		System.out.println(123);
		main(null);     //stackoverflowexception

	}

}
