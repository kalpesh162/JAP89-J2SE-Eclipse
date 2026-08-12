package p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example02 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");

		System.out.println(map1);

		LinkedHashMap<Integer, String> linkHashMap = new LinkedHashMap<Integer, String>(map1);

		System.out.println(linkHashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map1);
		// TreeMap<Integer, String> treeMap = new TreeMap<>(map1);

		System.out.println(treeMap);

	}

}
