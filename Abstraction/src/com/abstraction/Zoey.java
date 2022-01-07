package com.abstraction;

public class Zoey extends Dog {
	public Zoey(double weight,int nails,String breed){
		super(weight,nails,breed);
	}
	void bark(){
		System.out.println("Bow Bow");
	}
	void bite(){
		System.out.println("No biting process");
	}
void eat(){
	System.out.println("curd rice with egg");
}
}
