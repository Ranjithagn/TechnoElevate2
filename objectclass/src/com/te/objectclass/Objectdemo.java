package com.te.objectclass;


public class Objectdemo {
	int id;


public Objectdemo(int id)
{
	this.id=id;
	
}

@Override
public int hashCode(){
	return id;
}

@Override
public String toString() {
	return "hai";
}
public static void main(String[] args) {
	Objectdemo d=new Objectdemo(2);
	System.out.println(d);
	System.out.println(d.hashCode());
}
}

