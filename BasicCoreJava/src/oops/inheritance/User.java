package oops.inheritance;

public class User {

	public static void main(String[] args) {


		Telephone phone = new Telephone();
		phone.calling(); //object creation
		
	 Mobile mob = new Mobile();
	 mob.calling();
	 mob.texting();
	 
	 Smartphone smart = new Smartphone();
	 smart.calling();
	 smart.texting();
	 smart.internet();

	}

}
