package basic;

import java.util.HashMap;

public class Example03 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(11, "Kareena");
		map.put(21, "Ajay");
		map.put(211, "Rahul");
		map.put(131, "Shyam");
		map.put(44, "Rupak");
		
		System.out.println(map.remove(131));
		// public V remove(K)
		System.out.println(map.remove(13));
		// public boolean remove(K,V)
		System.out.println(map.remove(21,"Ajay"));
		
		System.out.println(map);
		
		/*
		map.put(11, null);
		map.put(11, "");
		*/
	}

}
