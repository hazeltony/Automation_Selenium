package variablesandDatatypes;

import fucntions.AccessModifiers;

public class TestAccessModAtProjecctLevel extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		
		obj.publicFunction();

		
		TestAccessModAtProjecctLevel obj1= new TestAccessModAtProjecctLevel();
		obj1.protectedFunction();
	}

}
