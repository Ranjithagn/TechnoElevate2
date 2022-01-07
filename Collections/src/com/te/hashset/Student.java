package com.te.hashset;

public class Student {
int RollNo;
String name;
int Marks;
public Student(int rollNo, String name, int marks) {
	super();
	RollNo = rollNo;
	this.name = name;
	Marks = marks;
}
@Override
public String toString() {
	return "Student [RollNo=" + RollNo + ", name=" + name + ", Marks=" + Marks + "]";
}

}
