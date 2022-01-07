package com.assignment;          //assignment question-write a method which accepts int array of any length,return a new array of its first 2 elements .if the array is smaller than length2,use whatever elements are present
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern the array length");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a.length>2)
		{
			System.out.print(a[0]+",");
			System.out.print(a[1]);
		}
		else {
			System.out.println(a[0]);
		}
	}
	

}
