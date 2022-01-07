package com.te.exception;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter first number");
		Scanner scan= new Scanner (System.in);
		x=scan.nextInt();
		System.out.println("Enter the second number");
		y=scan.nextInt();
		try{
			int result=x/y;
			int []arr=new int[result];
			arr[4]=50;
			System.out.println(arr[4]);
			System.out.println(result);
		}catch(Exception e){     //RuntimeException e=new ArithmeticEception();           Exception is a parent class for run time exception
			System.out.println("enter valid number");
		}
		

		}

}
