package com.te.exception;
import java.io.FileNotFoundException;                //checked exception
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {
		try{
			FileReader File= new FileReader("C:\Users\Ranjitha\Desktop\ra");
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
