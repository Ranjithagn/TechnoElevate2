package com.te.string;

public class Main {

	public static void main(String[] args) {
		String name="ranju is aa good girl"; 
		name=name.toUpperCase();
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name);
		String[] s= name.split(" ",4);    //here im given that split space
		for(String x:s)
		{
			System.out.println(x);
		}
		

	}

}
