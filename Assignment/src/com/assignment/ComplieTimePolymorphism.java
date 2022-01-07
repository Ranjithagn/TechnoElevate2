package com.assignment;


	public class ComplieTimePolymorphism {
		public static void calculate(int i,int  j){
			System.out.println("Calculate1:" +(i+j));
		}


	public static void calculate(float i,int j)
	{
		System.out.println("calculate2:" +(i+j) );
		
	}

	public static void calculate(float i,double j){
		System.out.println("Calulate3:" +(i+j));
		}

	public static void main(String[] args) {
		calculate(30,50);
		calculate(30.55f,85);
		calculate(30.55f,8.6674);
	}
	}