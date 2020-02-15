package constructor;

public class User {

	public static void main(String[] args) {

             Car ford = new Car(); //ford is object ref here
             ford.colour ="White";
             ford.model = "Figo";
             //ford.wheels = 5;
             ford.features();
             
             Car Nissan = new Car();
             Nissan.colour ="Red"; //non-static variables/functions can be called using object ref
             Nissan.model = "370z";
             Car.wheels = 6; //Static variables and functions can only be called using Classname
             Nissan.features();
             
             Car Toyota = new Car();
             Toyota.colour ="Black";
             Toyota.model = "Fortuner";
             //ford.wheels = 4;
            Toyota.features();
            
            Car BMW = new Car ("White","X5");
            BMW.features();
             
             

	}

}
