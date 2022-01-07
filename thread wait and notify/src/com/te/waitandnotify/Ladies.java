package com.te.waitandnotify;

public class Ladies extends Thread{
UglyFancyStore fancystore;
int number;
public Ladies(UglyFancyStore fancystore, int number) {
	super();
	this.fancystore = fancystore;
	this.number = number;
}

}
