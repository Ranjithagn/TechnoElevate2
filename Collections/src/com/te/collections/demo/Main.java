package com.te.collections.demo;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		MyArrayList list=new MyArrayList(2);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		list.remove(2);
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//System.out.println(list.get(4));
		//System.out.println(list);
		
	}

}
