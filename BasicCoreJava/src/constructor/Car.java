package constructor;

public class Car {

	String colour;
	String model;
	static int wheels =4;
	
	public void features()
	
	{
		System.out.println("My "+model+" have "+wheels+" wheels and is of "+colour+" color ");
	}
	
	 public Car()
	 {
	 
	 }
	public Car(String colour,String model) { //constructor
		
		this.colour = colour;
		this.model = model;
	}
}

