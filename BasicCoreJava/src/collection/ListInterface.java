package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		
		
		/*
		 * Object[] arr =new Object[3]; // we can store different datatypes in same array using Object array
		 * 
		 * arr[0]= "Hazel"; arr[1]= true; arr[2]= 26;
		 */
		 
		// List is an interface so Object cannot be created and reference can be created using its classes
		//Arraylist, linkedlists nd vector and the implementation of list
		 
		List<String> list = new ArrayList<>(); //default size of list =10 and it increases the size as the data is provided
		list.add("Hazel");
		list.add("Akshay");
		list.add("Anuja");
		
		for(String s: list)
		{
			System.out.println(s);
			
		}
		
		list = new LinkedList<>(); 
		list.add("Hazel");
		list.add("Akshay");
		list.add("Anuja");
		
		for(String s: list)
		{
			System.out.println(s);
			
		}
		
		list = new Vector<>(); 
		list.add("Hazel");
		list.add("Akshay");
		list.add("Anuja");
		
		for(String s: list)
		{
			System.out.println(s);
			
		}
	}
	

}
