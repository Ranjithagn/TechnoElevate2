package com.assignment;


	import java.util.Scanner;
	public class AssignmentArray_4 {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Array length");
			int n=s.nextInt();
			System.out.println("Enter array elements");
			int [] a=new int [n];
			for(int i=0;i<a.length;i++){
				a[i]=s.nextInt();
			}
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]==3 && a[i+1]!=3){
					count++;
				}
			}
			if(count==3){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}

	}

