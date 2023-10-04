package com.cg.assosiation;

public class Assosiaton {

	public static void main(String[] args) {
		Address b=new Address(1,"XYZ","BAGALKOT",587116,"KARNATAKA");
		// Person s=new Person("Santosh",b);
		//OR//
		
		Person p= new Person("Santosh",new Address(1,"XYZ","BAGALKOT",587116,"KARNATAKA"));
		
		    b.setNo(1);
	        b.setCity("bgk");
	        b.setPincode(587116);
	        b.setState("kar");
	        b.setStreet("double road");
	               
        p.display();
       // System.out.println(a);

	}
}
