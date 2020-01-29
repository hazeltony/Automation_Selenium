package arrays;

public class ArrayClass1 {

	public static void main(String[] args) {

		String[] str = new String[10]; //syntax

		str[0] = "Hazel";
		str[1] = "Shashank";
		str[2] = "Shubangi";
		str[3] = "Tigil";
		str[4] = "Abhishek";
		str[5] = "Gaurav";
		str[6] = "Sushil";
		str[7] = "Sumit";
		str[8] = "Komal";
		str[9] = "Ankita";

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(str[i]); }
		 */

		for (String s:str) //s= variable name str = variable name (enhanced forloop or foreach loop)
		{
			
	            System.out.println(s);
		}
	}
}
