package basic;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Example01 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(22, "Ravi");
		map2.put(33, "Raveena");
		map2.put(241, "Kunal");
		map2.put(121, "Suraj");
		//map2.put(11, "Ganesh");
		map2.put(41, "Ganesh");

		 // public void putAll(Map)
		
		map1.putAll(map2);

		System.out.println(map1);
		System.out.println(map2);
		
		System.out.println("------------------------------");

		
		LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(11, "Kareena");
		map3.put(21, "Ajay");
		map3.put(211, "Rahul");
		map3.put(131, "Shyam");
		map3.put(44, "Rupak");

		LinkedHashMap<Integer, String> map4 = new LinkedHashMap<>();
		map4.put(22, "Ravi");
		map4.put(33, "Raveena");
		map4.put(241, "Kunal");
		map4.put(121, "Suraj");
		//map2.put(11, "Ganesh");
		map4.put(41, "Ganesh");

		 // public void putAll(Map)
		
		map3.putAll(map4);

		System.out.println(map3);
		
	}

}
