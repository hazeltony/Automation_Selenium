package ifElseStatements;

public class NestedIf {

	public static void main(String[] args) {
		
		int a= 110;
		int b=120;
		int c=90;
		
		if(c>a)
		{
			if(c>b)
			{
				System.out.println(c+" is greatest");
			}
			else
				System.out.println(b+" is greatest");
		}
		else 
			System.out.println(a+" is greatest");
	}

}
