package ifElseStatements;

public class IfElseStatements {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>b)
		{
System.out.println(a+ " is greater than "+b);
	}
		else {
			System.out.println(a+ " is not greater than "+b);
		}
		System.out.println(a+b); //add numbers
System.out.println(a+""+b); //to print 1020

System.out.println(a+""+b+"Temp");  //to print 1020Temp
System.out.println(a+"Temp"+b); //to print 10Temp20
System.out.println("Temp"+b+""+a); //to print Temp2010
System.out.println("Temp" +(a+b));  //to print Temp30
	}
}
