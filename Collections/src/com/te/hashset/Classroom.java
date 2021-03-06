package com.te.hashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
	public static void main(String[] args) {

		Student student = new Student(1, "sushmitha", 100);
		Student student2 = new Student(2, "mamatha", 99);
		Student student3 = new Student(3, "abhi", 98);
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(new Student(6, "vishal", 60));
		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------");
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);

		Collections.sort(arrayList, new SortByName());

		Iterator<Student> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
