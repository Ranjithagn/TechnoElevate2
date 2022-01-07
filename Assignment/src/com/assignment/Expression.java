package com.assignment;
import java.util.*;
public class Expression {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose A");
		 double a=sc.nextInt();
		
		System.out.println("Choose B");
	 double b=sc.nextInt();
	
	System.out.println("choose C");
	double c=sc.nextInt();
	
	double d =(a+Math.pow(2, 0)*b);

	System.out.print(d+",");

	
	for(int i=1;i<c;i++) {                  //c is how many expresions we need 
		d =d + (Math.pow(2, i)*b);
		System.out.print(d+",");
	}
	}
}
	
	


