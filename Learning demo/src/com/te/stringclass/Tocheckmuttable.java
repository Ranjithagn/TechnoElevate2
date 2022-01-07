package com.te.stringclass;

public class Tocheckmuttable {

	public static void main(String[] args) {
/*	String str="tellme";
	String str="tellmmme";
	System.out.println(str);               this is without using new operator doesnot allow duplicate values and string is an imutaable we 
	System.out.println(str1);             cannot change or modify  the content string object if we try to  modify we  need to create new object
	
*/
		StringBuilder string = new StringBuilder("haiiii");
		StringBuffer string1 = new StringBuffer("hello");
		System.out.println(string);
		System.out.println(string1);
	}

}
