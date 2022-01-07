package com.assignment; //write a program to print fibonacci number upto the prograamer gives the input
import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many times fibonaci series has to be done?");
		int n=sc.nextInt();
		int first_num=0;
		int second_num=1;
		int third_num;
		System.out.print(first_num+",");
		System.out.print(second_num+",");
		for(int i=0;i<n;i++)
		{
			third_num=first_num+second_num;
			System.out.println(third_num+",");
			first_num=second_num;
			second_num=third_num;
		}

	}

}
