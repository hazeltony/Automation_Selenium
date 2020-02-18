package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); //Random sequence
		
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		
		for(String s:set)
		{
			System.out.println(s);
		}

		System.out.println("***************************");
		set =new LinkedHashSet<>(); //same sequence as provided
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("***************************");
		set =new TreeSet<>(); //sorted alphabetically
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		
		for(String s:set)
		{
			System.out.println(s);
		}
	}

}
