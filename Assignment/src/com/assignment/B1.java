package com.assignment;
	public class B1 implements A1 {


		@Override
		public void test1() {
			// TODO Auto-generated method stub
			System.out.println("from test1:A1");
			
		}

		@Override
		public void test2() {
			// TODO Auto-generated method stub
			System.out.println("from test2:A1");
			
		}
		public static void main(String[] args) {
			B1 b1 = new B1();
			b1.test1();
			b1.test2();
			
		}

}
