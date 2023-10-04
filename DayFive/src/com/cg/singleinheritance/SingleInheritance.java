package com.cg.singleinheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.fun();
		d.fun1();
		Animal a=new Dog();
		// a.fun(); fun() function is defined in dog(Child class) not in Animal(Parent class)
		a.fun1();

	}

}
