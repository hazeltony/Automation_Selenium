package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {
//can use  the reference of the parent class for the object of child class
	public static void main(String[] args) {
		
		Telephone phone  = new Mobile(); //reference of parent for the object of child
		phone.calling();
		phone = new Telephone();
		phone.calling();
		phone = new Smartphone();
		phone.calling();
	}

}
