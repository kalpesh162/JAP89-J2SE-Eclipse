package p5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example06 {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");
		
		/*
		Set entries = map1.entrySet();

		Iterator itr = entries.iterator();

		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + "  " +entry.getValue());
		}

		*/
		
		Set<Map.Entry<Integer, String>> entries=map1.entrySet();
		
		Iterator<Map.Entry<Integer, String>>itr=entries.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey() +"    "+entry.getValue());
		}
		
		System.out.println("--------------------------------------");
		// for 
		
		for(Map.Entry<Integer, String>entry:entries)
			System.out.println(entry.getKey() +"  "+entry.getValue());
		
				
		
		
		
	}

}
