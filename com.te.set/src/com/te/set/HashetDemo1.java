package com.te.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashetDemo1 {
	public static void main(String[] args) {
		HashSet<Integer>hashet=new HashSet<>();
		hashet.add(10);
		hashet.add(30);
		hashet.add(20);
		hashet.add(10);
		
		Iterator iterator = hashet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
