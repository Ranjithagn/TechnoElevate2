package com.te.abcd;

public class P72 {
	int a;
	public void test()
	{
		System.out.println(100);
	}
	public P72(int a)
	{
		this.a=a;
		this.test();
		
	}
	public static void main(String[] args) {
	P72 ob1=new P72(100);
	P72 ob2=new P72(200);
	}

}
