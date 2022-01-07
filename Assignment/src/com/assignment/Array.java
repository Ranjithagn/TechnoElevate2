package com.assignment;  //write a method to add as many as numbers the programer gives the input

public class Array {
	public static void add(int...x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+",");
		}
	}
public static void main(String[] args) {
	add(1,2,3,4,5,6,7);
}
}
