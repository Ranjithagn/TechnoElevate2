package com.te.waitandnotify;

public class MyStore {

	public static void main(String[] args) {
		UglyFancyStore uglyFancyStore = new UglyFancyStore();
		Ladies yashodha = new Ladies(uglyFancyStore, 6);
		Ladies rachitha = new Ladies(uglyFancyStore, 10);
		Ladies dharshana = new Ladies(uglyFancyStore, 4);
		yashodha.start();
		rachitha.start();
		dharshana.start();
				
		// TODO Auto-generated method stub

	}

}
