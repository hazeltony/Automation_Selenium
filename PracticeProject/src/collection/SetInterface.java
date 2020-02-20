package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Daisy");
		set.add("Tony");
		set.add("Evin");
		set.add("Daisy");
		set.add("Tony");
		set.add("Evin");
		
		for(String s : set) {
			
			System.out.println(s);
		}
		
		System.out.println("*******************");
		set = new LinkedHashSet<>();
		set.add("Daisy");
		set.add("Tony");
		set.add("Evin");
		set.add("Daisy");
		set.add("Tony");
		set.add("Evin");
		
		for(String s : set) {
			
			System.out.println(s);
		}

	}

}
