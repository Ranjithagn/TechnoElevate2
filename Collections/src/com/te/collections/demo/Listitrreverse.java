package com.te.collections.demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listitrreverse {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(22);
		l.add(34);
		l.add(34);
		l.add(33);
		ListIterator itr= l.listIterator();
				{
			while(itr.hasNext()) {
				Object next = itr.next();
				System.out.println(next);
			}
			System.out.println(">>>>>>>>>>>>>>>");
			while(itr.hasPrevious()) {
				Object previous = itr.previous();
				System.out.println(previous);
			}
			System.out.println("++++++++++++++++");
			System.out.println(l.get(2));
		}

	}

}
