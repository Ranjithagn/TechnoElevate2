package com.te.removeduplicatefromarraylist;

import java.util.ArrayList;

public class Duplicateremovefromarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new  ArrayList();
		arr.add(12);
		arr.add(33);
		arr.add(22);
		arr.add(12);
		System.out.println(arr);
		//to remove duplicates
		ArrayList<Integer> arr1 = new  ArrayList();
		for(Integer i:arr) {
			if(!arr1.contains(i)) {
				arr1.add(i);
			}
		}
			for(Integer i1:arr1) {
			System.out.println(i1);
		}
	}
	}

