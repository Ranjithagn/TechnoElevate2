package com.assignment;


	
	import java.util.Scanner;
	public class AssignmentArray_2 {
	

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Array length");
			int n=s.nextInt();
			System.out.println("Enter array elements");
			int [] a=new int [n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			if(a.length>2){
				System.out.println(a[0]);
				System.out.println(a[1]);
			}
			else{
				System.out.println(a[0]);
			}

		}

	}
