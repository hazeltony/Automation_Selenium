package exceptionHandling;

public class ExceptionType1 { //Unchecked exception - Compiler wont check- it happens at runtime
	
	static ExceptionType1 ref; //creating an object

	public static void main(String[] args) { 
		
		
		//Exception 1
		System.out.println(10/2); //Arithmetic EX :/ by zero
		
		//Exception 2
		String name = "Anand";
		System.out.println(name.charAt(0)); //StringIndexOutOfBoundsException: String index out of range: 10
		
		//Exception 3
		
		ref.sum(10, 20); // ref is not intialiased with any object -- Null pointer exception
		
		}
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
