package com.te.exception;

public class Alltypeofexception {

	public static void main(String[] args) {
		//String str2="123qw";          //numberformatexception
		//int i=Integer.parseInt(str);
		//System.out.println(i);
		//String str1="123ab";
		//int i2=Integer.parseInt(str1);
		//System.out.println(i2);
		String str1= null;
		System.out.println(str1.length());//nullpointerexception
		int a=10;
		int b=0;
		int c=a/b;           //arithmetic exception
		System.out.println(c);
		String str3="haiii";
		System.out.println(str3.charAt(22));//stringindexoutofboundexception
		int[]arr={12,22,33,32};
		System.out.println(arr[5]);//arrayindexoutofboundexception
		
		

	}

}
