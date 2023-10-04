package com.cg.hierarchical;

public class Heirarchical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Basaveshwar Engineering College","EEE");
		System.out.println(s);
		Employee e=new Employee(70000,"software Developer");
		System.out.println(e);
		s.setGender("Male");
		s.setPersonname("Santosh");
        System.out.println(s);
        System.out.println(e);
	}

}
