package com.assignment;

public class Arrayy {
	public static void add(int...a ){
			
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}

		public static void main(String[] args) {
			add(1,3,2,4,6,7,4,7,3,9,0,3);
		}

	}
