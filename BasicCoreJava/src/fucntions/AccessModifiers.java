package fucntions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		  obj.publicFunction();
		  obj.privateFunction();
		  obj.noAccessModFunction();
		  obj.protectedFunction();
	}

	public void publicFunction() {
  
	}

	private void privateFunction() {

	}

	void noAccessModFunction() {

	}

	protected void protectedFunction() {

	}
}
