package stringClass;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str="your account Number is 1234 ";
		String str2="your account number is 1234";
		
				
			//Function 1
				System.out.println(str.charAt(5)); //return the character at the defined index and string count starts with 0
				
		   //Function 2
				System.out.println(str.length()); //returns the length of the string
				
		  //Function 3
				System.out.println(str.toUpperCase());//returns the content to uppercase
				
		  //Funtion4
				System.out.println(str.toLowerCase());//returns the content to lowercase
				
		  //Function 5
				System.out.println(str.equals(str2)); //compares two strings
				
		  //Function 6
				System.out.println(str.equalsIgnoreCase(str2)); //compares and ignore the upper/lowercase
				
		  //Function 7
			 System.out.println(str.replace("1234", "5678")); //replace any value in string
			 
	     //Function 8
			 System.out.println(str.substring(23)); //return the values from the index till the end
			 
		 //Function 9 
			 System.out.println(str.substring(23, 27)); //returns the values inside the defined the index
			 
		 //Function 10
			 System.out.println(str); //returns the string
			 System.out.println(str.trim()); //returns the string by removing the white spaces from front and end
			 System.out.println(str.replace(" ", "")); //replaces the white spaces in between the string
			 
	     //Funtion 11
			 String[] arr= str.split(" "); //splits the string with the defined character
			 for (String s:arr)
			 {
				 System.out.println(s);
			 
			 }
			/* for (int i=0;i<arr.length;i++)
			 {
				 System.out.println(arr[i]);
			 } */
			 
		 //Funtion 12
			 System.out.println(str.contains("1234")); //returns true/false if it contains the character defined
	}

}
