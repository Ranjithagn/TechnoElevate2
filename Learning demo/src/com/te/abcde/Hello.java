package com.te.abcde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.AbstractDocument.BranchElement;

public class Hello {

	public static void main(String[] args) {
		List<Student> list=Arrays.asList(new Student(1, 12, "ranju", "technoe"),
				new Student(2, 44, "ajay", "mentor"),
				new Student(3, 33, "dharshana", "tester"),
				new Student(5, 55, "sushmitha", "technoe"));
		
	boolean anyMatch = list.stream().anyMatch(st->st.getId()>1);
	System.out.println(anyMatch);
	
	System.out.println("*****************");
	
	list.stream().max(Comparator.comparing(Student::getBranch)).ifPresent(System.out::println);
	System.out.println("***********************");
	list.stream().min(Comparator.comparing(Student::getBranch)).ifPresent(System.out::println);
	System.out.println("********************************************************");
	List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	collect.forEach(System.out::println);
	System.out.println("****************************************************************************");
	Map<String, List<Student>> collect2 = list.stream().collect(Collectors.groupingBy(Student::getBranch));
	
	collect2.forEach((branch,Stu)->{
		System.out.println(branch);
		Stu.forEach(System.out::println);
	});
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	List<Student> collect3 = list.stream().filter(St->St.getId()>2).collect(Collectors.toList());
	collect3.forEach(System.out::println);
	}

}
