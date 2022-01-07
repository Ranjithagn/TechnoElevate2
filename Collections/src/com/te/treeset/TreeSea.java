package com.te.treeset;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;
public class TreeSea {
	public static void main(String[] args) {
	TreeSet<Integer> t	=new TreeSet<Integer>();
	t.add(10);
	t.add(30);
	t.add(-2);
	t.add(5);
	for(Object obj:t){
		System.out.println(obj);
	}
	ArrayList<Integer> list = new ArrayList<>(t);
	ListIterator<Integer> listIterator = list.listIterator(list.size());
    while(listIterator.hasPrevious()){
    	System.out.println(listIterator.previous());
    }
	}

}
