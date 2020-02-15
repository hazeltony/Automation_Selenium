package fucntions;

public class NonStaticFunctions {

	public static void main(String[] args) {
		
		NonStaticFunctions ref = new NonStaticFunctions(); //calling nonstaticfunctions
		
		int sum = ref.sum(10, 20);
		System.out.println(sum);
	}

	public int sum (int a , int b)
	
	{
		return a+b;
	}
	
}
