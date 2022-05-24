package com.kh.thread;

public class Factory {
	
	public synchronized void methodA() {
		System.out.println("A called...");
		notify();
		try {
			wait(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public synchronized void methodB() {
		System.out.println("B called...");
		notify();
		try {
			wait(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}