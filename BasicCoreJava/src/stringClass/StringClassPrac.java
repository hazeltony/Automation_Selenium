package stringClass;

public class StringClassPrac {

	public static void main(String[] args) { //count no  of  n -letter in the word
		 
		String str= "Anand";
	
       int t=0;
       
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)== 'n')
    	   {
    		   t++;
    	   }
       }
		System.out.println("number of n = "+t);
		
	}
	

}
