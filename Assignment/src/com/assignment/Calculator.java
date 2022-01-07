package com.assignment;
                          //example for compile time polymorphism
public class Calculator {
public static void calculatesum(int i,int j) {
	System.out.println("calculat1:"+(i+j));
	
}
public static void calculatesum(float i,int j)
{
	System.out.println("calculat2:"+(i+j));
}
public static void calculatesum(float i,double j) {
	System.out.println("calculat3:"+(i+j));
	
}
public static void main(String[] args) {
	calculatesum(10,20);
	calculatesum(10.55f,25);
	calculatesum(10.55f,5.8889);
}

}
