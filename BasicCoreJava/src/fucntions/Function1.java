package fucntions;

public class Function1 {

	public static void main(String[] args) {

		//Function1.sum();
		
		/*
		 * int add1 =sum(10,20); int add2 =sum(10,30); int add3 =sum(10,40);
		 * 
		 * System.out.println(add1+add2+add3);
		 */
		//String x= getName("Hazel", 25);
		
		//System.out.println(x);
		int total = getMarks(70,80,89,88,68);
		System.out.println(total/100*100);
	}


	public static void sum() {

		int a = 10;
		int b = 20;

		System.out.println(a + b);
	}
	
	public static int sum(int a , int b) {
		
		return a+b;
		
	}
	
	public static String getName(String name)
	{
		return "Your name is "+name;
	}
	
	public static String getName(String name, int age)
	{
		return "Your name is "+name+" and your age is "+age;
	}
	public static int getMarks(int m, int p, int c, int com, int e) {
		 return m+p+c+com+e;
		 
	}
}
