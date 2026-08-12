package p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example01 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(11, "Kareena");
		map1.put(21, "Ajay");
		map1.put(211, "Rahul");
		map1.put(131, "Shyam");
		map1.put(44, "Rupak");

		// Only Keys

		Set<Integer> keys = map1.keySet();

		// Iterator
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();

		// foreach Loop <--->forEach Method

		for (Integer val : keys)
			System.out.print(val + "  ");

		System.out.println();

		// Collection values()

		Collection<String> allNames = map1.values();

		for (String name : allNames)
			System.out.print(name + "  ");
		
		System.out.println();
		
		System.out.println("-------------------------");
		
		//{211=Rahul, 131=Shyam, 21=Ajay, 11=Kareena, 44=Rupak}
		// K=V  Entry
		System.out.println(map1);
		
		Set entries=map1.entrySet();
		
		Iterator itr1=entries.iterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		
		
		
		
		
		
		

	}

}
