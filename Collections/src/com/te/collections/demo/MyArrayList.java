package com.te.collections.demo;


import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
Object[] array;
int position;

public MyArrayList(int size) {
	array=new Object[ size];
}
public void add(Object obj) {
	if(position>=array.length) {
		increasecapacity();
	}
	array[position]=obj;
	position++;
}
private void increasecapacity() {
 Object[] temp=new Object[((array.length*3)/2)+1];
 for(int i=0;i<array.length;i++) {
	temp[i]=array[i];
}
array=temp;
}
public Object get(int index) {
	return array[index];
}
public void remove(int index) {
	for(int i=index;i<position;i++) {
		array[i]=array[i+1];
	}
	position--;
}
@Override
public String toString() {
	String s="["+array[0];
		for(int i=1;i<position;i++) {
			s+=","+array[i];
	}
	
	s+="]";
	return s;
}
public Iterator iterator() {
	return new MyItr();
}
class MyItr implements Iterator {
	int index;

@Override
public boolean hasNext() {
	// TODO Auto-generated method stub
	return (index<position)?true:false;
}

@Override
public Object next() {
	// TODO Auto-generated method stub
	return array[index++];
}
}
}

