package com.te.stringclass;

public class Stringclass {
	public static void main(String[]args){
		String string = new String("javalearn");
		String string1=new String("javalearn");
		System.out.println(string.length());
		System.out.println(string.startsWith("ja"));
		System.out.println(string.endsWith("va"));
		System.out.println(string.charAt(2));
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.substring(2,6));
		System.out.println(string.equals(string1));
char[] charArray = string.toCharArray();
for(int i=0;i<charArray.length;i++){
	System.out.print(charArray[i]+" ");

}
		
		
		
	}
}
