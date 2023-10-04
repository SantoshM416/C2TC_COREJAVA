package com.cg.operators;

public class Operators {
	public static void main(String[] args) {
		int a=98;
		int b=a%6; // % is module operator
		System.out.println(b); // b will store the reminder of the calculation 
		
		// Associativity property ---> execution starts from right to light BODMAS
		int c=6*5-34/2;  // in case * and / both are present execution starts from left to right
		int d=6/5-34*2;
		System.out.println(c);
		System.out.println(d);
		

}
}