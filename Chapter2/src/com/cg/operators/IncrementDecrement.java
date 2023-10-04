package com.cg.operators;
import java.util.Scanner;
public class IncrementDecrement {

	public static void main(String[] args) {
//		int i = 10;
//		int j=20;
//		System.out.println(i++); // first prints value then increments it 10 post increment
//		System.out.println(i);// after increment it is 11
//		System.out.println(++j); //first increments then prints pre increment
//		System.out.println(j);// This is similar with negative operation
		// Practice problem 1
		
		char a = 'A';
		a = (char)(a+8);
		System.out.println(a);
		a = (char)(a-8);
		System.out.println(a);
		
		// Practice problem 2
		Scanner A= new Scanner(System.in);
		System.out.println("Enter your number");
		int num= A.nextInt();
		System.out.println(num>15);
	}

}
