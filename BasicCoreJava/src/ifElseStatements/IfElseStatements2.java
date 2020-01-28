package ifElseStatements;

public class IfElseStatements2 {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
		if (a>b) {
			
			System.out.println(a+"is greater than "+b);
		}
		else if(a==b) {
			
			System.out.println(a+ "is equal to" +b);
		}
		else 
			System.out.println(b+" is greater than "+a);
	}

}
