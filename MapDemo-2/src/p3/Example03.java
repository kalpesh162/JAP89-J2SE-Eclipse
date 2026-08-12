package p3;

import java.util.HashMap;

public class Example03 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");

		map1.putIfAbsent(33, "Raveena");
		map1.putIfAbsent(21, "Akshay");
		System.out.println(map1);

	}

}
