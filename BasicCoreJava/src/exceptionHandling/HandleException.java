package exceptionHandling;

public class HandleException {

	public static void main(String[] args) {

		try { // put any possible exceptions in try block
			
			//Exception 1
			System.out.println(10/2); 
			
			//Exception 2
			String name = "Anand";
			System.out.println(name.charAt(0));
			
			//ExceptionType1.ref.sum(10, 20); //null pointer exception
			
		}catch(ArithmeticException e)
		{
			System.out.println("Recovery 1"); //if there were exceptions, it will be catched in catch block & the error message will be printed in output
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Recovery 2");
		}
		catch(Exception e)
		{
			System.out.println("Recovery 3");
		}finally {
			
		System.out.println("Finally");
		}
		}
		
	}

