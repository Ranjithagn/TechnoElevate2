package com.te.hasarelation;

public class Hardisk {
	String brand;
	int size;
	String type;
	public Hardisk(String brand, int size, String type) {
		super();
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Hardisk [brand=" + brand + ", size=" + size + ", type=" + type + "]";
	}
	

}
