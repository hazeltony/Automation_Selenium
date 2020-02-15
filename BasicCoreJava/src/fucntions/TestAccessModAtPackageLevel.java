package fucntions;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) {
		

		AccessModifiers obj = new AccessModifiers();
		
		obj.publicFunction();
		obj.noAccessModFunction();
		obj.protectedFunction();
	}

}
