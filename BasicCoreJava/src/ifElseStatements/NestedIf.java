package ifElseStatements;

public class NestedIf {

	public static void main(String[] args) {
		
		int a= 500;
		int b=550;
		int c=340;
		
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println(a+" is greatest");
			}
			else
				System.out.println(c+" is greatest");
		}
		else 
		{
			if(b>=c)
			System.out.println(b+" is greatest");
		else 
			System.out.println(c+" is greatest");
		}
	}

}
