package com.cg.packageone;

public class TestOne {
	private int id;
	private void display() {
		System.out.println("access modifiers");
	}

	public static void main(String[] args) {
		TestOne t1=new TestOne();
		t1.id=5;
		System.out.println(t1.id);
		t1.display();
		

	}

}
