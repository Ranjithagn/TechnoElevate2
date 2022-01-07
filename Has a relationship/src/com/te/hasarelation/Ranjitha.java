package com.te.hasarelation;

public class Ranjitha {

	public static void main(String[] args) {
		
 Processor processor=new Processor("intel i11",4,2.4);
 Hardisk harDisk=new Hardisk("WD",1,"SSD");
 Operating operating=new Operating("Windows",11,64);
 Battery battery=new Battery(3000,3,"Thosibha");
 Laptop laptop = new Laptop(69999, battery, operating, harDisk, processor);
	}

	
}

