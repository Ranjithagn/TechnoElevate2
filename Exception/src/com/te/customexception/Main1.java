package com.te.customexception;

public class Main1 {
	static void age(int age) throws Invalidageexception {
		if (age < 18) {

			throw new Invalidageexception("not eligible to vote");
		} else {
			System.out.println("eligible to vote ur  18");
		}
	}

	public static void main(String[] args) {
		try {
			age(55);

		} catch (Invalidageexception e) {
			System.out.println("exception handled");
		}

	}

}
