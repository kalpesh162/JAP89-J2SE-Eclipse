package p4;

import java.util.HashMap;

//replace(K key, V value)	  
//replace(K key, V oldValue, V newValue)	  
public class Example05 {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");
		// String replace(K , V)
		// V replace(K , V)
		System.out.println("Replace Return  " + map1.replace(211, "Ravi"));

		System.out.println(map1);

		System.out.println("replace with 3 parametrs " + map1.replace(44, "Rupak", "RRR"));
		System.out.println(map1);

	}

}
