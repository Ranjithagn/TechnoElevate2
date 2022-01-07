package com.te.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class Company {

	    public static void main(String[] args) {
		ArrayList<Employee> arraylist=new ArrayList();                             //creating array list object
		arraylist.add(new Employee(2,"Rakshitha",200000));
		arraylist.add(new Employee(3,"Rachana",400000));
		Employee employee=new Employee(1,"Ranjitha",10000000);
		arraylist.add(new Employee(5,"praveenna",100000));
        System.out.println(arraylist.get(2));
        arraylist.add(2,employee);
		arraylist.set(2,new Employee(10,"Ruchitha",300000));
		for(Employee e: arraylist){
			System.out.println(e);
		}
		System.out.println("------------------");
		Collections.sort(arraylist,new SortBySalary());        //comparator method of compare
		for(Employee e : arraylist){
			System.out.println(e);
		}
	}

}
