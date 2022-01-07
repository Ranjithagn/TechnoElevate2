package com.assignment;       //Write a method which accepts int array of any length,return true if the value 3 appears in the array exactly 3 times,and number 3's are next each other
import java.util.Scanner;

public class Array_3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array length");
		int n =sc.nextInt();
		System.out.println("enter the array elements");
		int[] a= new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==3 && a[i+1]!=3)
		{
			count++;
		}
	}
		if(count==3)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	}
