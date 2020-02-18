package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Hazel");
		map.put(2,"Akshay");
		map.put(3, "Anuja");
		
		System.out.println(map.get(2));
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("Hazel", "Tony");
		
		
		

	}

}
