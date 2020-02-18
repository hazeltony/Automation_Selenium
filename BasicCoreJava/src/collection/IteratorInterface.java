package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInterface {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");
		set.add("Hazel");
		set.add("Akshay");
		set.add("Anuja");

		for (String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())

		{
			System.out.println(it.next());
		}
	}

}
