package com.te.mockproblemarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mock {

	public static void main(String[] args) {
		try{
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(11);
		arrayList.add(18);
		arrayList.add(19);
		arrayList.add(110);
		System.out.println(arrayList);
		Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
		unmodifiableCollection.add(3);
		unmodifiableCollection.add(33);
		
	}catch(Exception e)
		{
		System.out.println(e);
		}
}
}
