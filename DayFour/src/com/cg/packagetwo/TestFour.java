package com.cg.packagetwo;
import com.cg.packageone.TestOne;
public class TestFour {
	public static void main(String[] args) {
		TestOne t1=new TestOne();
		t1.id=5;//show the error not visible it is problem with access modifier
		System.out.println(t1.id);//show the error not visible it is problem with access modifier
		t1.display();

	}

}
