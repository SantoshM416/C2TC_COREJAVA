package com.cg.packageone;

public class TestTwo {
	public static void main(String[] args) {
		TestOne t1=new TestOne();
		
		t1.id=5;//show the error because of access modifiers private
		System.out.println(t1.id);
		t1.display();

	}

}
