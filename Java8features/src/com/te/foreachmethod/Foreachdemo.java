package com.te.foreachmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foreachdemo {

	public static void main(String[] args) {
		List<Integer> arrayList =Arrays.asList(1,2,3,76,545);      //instead of using add add method we use a short cut that is arrays.aslist
		for(int i=0;i<arrayList.size();i++){     //normal for loop block
			System.out.println(i);
		}
System.out.println("****for each loop****");
for(Integer integer:arrayList){
	System.out.println(integer);
}
System.out.println("Iterator");
Iterator<Integer> iterator = arrayList.iterator();
while(iterator.hasNext()){
	System.out.println(iterator.next());
}
System.out.println("*******************from for each method****************");
arrayList.forEach(System.out::println);

	}

}
