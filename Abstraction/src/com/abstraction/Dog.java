package com.abstraction;

public abstract class Dog {
	double weight;
	int nails;
	String breed;
	public Dog(double weight,int nails,String breed) {
		this.weight=weight;
		this.nails=nails;
		this.breed=breed;
		
		}
	abstract void bark();
	abstract void bite();
	abstract void eat();
	public void poop() {     //concrete method which has both declaration and implementation
		System.out.println("it is pooping");
	}
	

}
