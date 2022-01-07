package com.assignment;

public class P1 implements Interfacei1 {                //assignment question achieve abstraction using interface
public void test1()
{
	System.out.println("from test1 of p1");
}
public void test2()
{
	System.out.println("from test2 of p1");
}
public static void main(String[] args) {
	P1 ob1 =new P1();
	ob1.test1();
	ob1.test2();
}
}
