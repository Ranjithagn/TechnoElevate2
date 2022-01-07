package com.te.methodreference;

public class Myclass {
public int addition(int i,int j){
	return i+j;
}
public static int sum(int i,int j){
	return i+j;
}
	public static void main(String[] args) {
	/*Myclass myclass = new Myclass();   //for non static method first create an object
	Test test=new Myclass()::addition;               //this is a method refernce::
	*/
	Test test=Myclass::sum;                 //this is for static method no need to craete object
	System.out.println(test.add(12, 20));

	}

}
