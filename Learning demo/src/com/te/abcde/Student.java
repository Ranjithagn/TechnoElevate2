package com.te.abcde;

public class Student {
int id;
int marks;
String name;
String branch;
public Student(int id, int marks, String name, String branch) {
	super();
	this.id = id;
	this.marks = marks;
	this.name = name;
	this.branch = branch;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [id=" + id + ", marks=" + marks + ", name=" + name + ", branch=" + branch + "]";
}


}
