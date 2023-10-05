package com.cg.multithreading;

public class ThreadExampleOne extends Thread {
	public void run() {
		for(int r=0;r<10;r++) {
			System.out.println("hi");
		}
	}

}
