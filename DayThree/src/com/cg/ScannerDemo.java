package com.cg;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter your name");
		 String name=sc.next();
		 System.out.println("enter your income");
		 int income=sc.nextInt();
		 System.out.println("enter your gender");
		 String gender=sc.next();
		 System.out.println("Enter your age");
		 int age=sc.nextInt();
		 
		 Person p=new Person();
		 p.setName(name);
		 p.setIncome(income);
		 p.setGender(gender);
		 p.setAge(age);
		 System.out.println("before tax calculation");
		 System.out.println(p);
		 
		 TaxCalculation calc=new TaxCalculation();
		 calc.calculateTax(p);
		 System.out.println("after tax calculation");
		 System.out.println(p);

	}

}
