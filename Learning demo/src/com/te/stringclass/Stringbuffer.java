package com.te.stringclass;

public class Stringbuffer {

	public static void main(String[] args) {
	StringBuilder stringBuilder = new StringBuilder("helloranjitha");
	String string = stringBuilder.toString();
	System.out.println(string);
	System.out.println(stringBuilder);
	System.out.println(stringBuilder.append('e'));
	System.out.println(stringBuilder.insert(2, 'q'));
	//System.out.println(stringBuilder.setCharAt(2, 'z'));
	System.out.println(stringBuilder.reverse());

	}

}
