package loops;

public class NestedLoop {

	public static void main(String[] args) {
	
		/*
		 * System.out.println("A");     print in next line 
		 * System.out.print("A"+" ");   print and the cursor will be in the same line
		 */
		
		for(int r=1;r<=10;r++) 
		
		{
			for(int c=1;c<=5; c++)
				
			{
				System.out.print(c+" ");
			}
			
			System.out.println();
		}
		
	}

}
