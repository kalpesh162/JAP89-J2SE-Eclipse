package basic;

import java.util.HashMap;

public class Example02 {

	public static void main(String[] args) {

		//
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println(map.put(11, "Kareena"));
		System.out.println(map.put(11, "Kajol"));
		System.out.println(map.put(11, "Kiara"));

		map.put(21, "Ajay");
		map.put(211, "Rahul");
		map.put(131, "Shyam");
		map.put(44, "Rupak");

		System.out.println(map);

		System.out.println("contains Key    " + map.containsKey(21));
		System.out.println("containsValue   " + map.containsValue("Rahul"));

		System.out.println("--->  " + map.get(131));
		System.out.println("--->  " + map.get(10));

		System.out.println(map.getOrDefault(10, ""));

		System.out.println(map.size());
		map.clear();
		System.out.println(map);

	}

}
