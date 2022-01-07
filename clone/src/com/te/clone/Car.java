package com.te.clone;

import java.util.Scanner;
 import java.lang.CloneNotSupportedException;

public class Car {
	String modelname;
	int price;
	String colorname;
	

	public void display(){
		System.out.println("modelname="+this.modelname+"price"+this.price+"colorname"+this.colorname);
	}


	public Car(String modelname, int price, String colorname) {
		super();
		this.modelname = modelname;
		this.price = price;
		this.colorname = colorname;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the modelname:");
		String next = sc.next();
		System.out.println("Enter the price:");
		int nextInt = sc.nextInt();
		System.out.println("Enter the colorname:");
		String next2 = sc.next();
		
		Car ob=new Car("bmw", 10000, "white");
		Car[]arr=new Car[10];
		for(int i=0; i<arr.length; i++){
			try{
				arr[i]=(Car)ob.clone();
			}catch(CloneNotSupportedException e){
				System.out.println(e);
			}
		}
/*for(int i=0;i<arr.length;i++){
	arr[i].display();
*/}
	}


