package oops.inheritance;

public class Smartphone extends Mobile {
	
	public void internet()
	{
		System.out.println("Internet from smartphone");
	}
	
	public void calling() //Method overriding and the overridden method will be called in the main function
	{
		System.out.println("Calling from Smartphone");
	}
	
	public Smartphone() {
		
		System.out.println("Smartphone");
	}

}
