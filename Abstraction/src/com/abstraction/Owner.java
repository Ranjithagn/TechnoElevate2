package com.abstraction;

public class Owner {
public static void main(String[] args) {
	rocky rocky=new rocky(40.12,20,"hello");
	rocky.bark();
	rocky.bite();
	rocky.eat();
	rocky.poop();
	
	System.out.println("---------------");
	ginne ginne=new ginne(43,21,"fat");
	ginne.bark();
	ginne.eat();
	ginne.bite();
	ginne.poop();
	System.out.println("---------------");
	Zoey zoey=new Zoey(22,21,"cat");
	zoey.bark();
	zoey.bite();
	zoey.eat();
	zoey.poop();
	
}
}
