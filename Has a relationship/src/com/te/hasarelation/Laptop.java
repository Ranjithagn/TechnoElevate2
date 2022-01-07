package com.te.hasarelation;

public class Laptop {
	double cost;
	private Battery battery;
	private Operating os;
	private Hardisk hardDisk;
	private Processor processor;

	public Laptop(double cost, Battery battery, Operating os, Hardisk hardDisk, Processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.hardDisk = hardDisk;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + "]";
	}
	
	}

