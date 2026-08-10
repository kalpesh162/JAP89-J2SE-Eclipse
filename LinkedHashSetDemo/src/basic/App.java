package basic;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);
		numbers.add(21);
		numbers.add(1);
		numbers.add(21); // Integer.valueOf(21).hashcode()
		numbers.add(null);
		numbers.add(null);

		System.out.println(numbers);
		
		
		for(Integer arr :numbers)
			System.out.println(arr);
		System.out.println("-------------------");
		Iterator<Integer> itr=numbers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		for(Integer arr : numbers) {
			  if(arr!=null && arr.equals(Integer.valueOf(21))) {
				  System.out.println("Find ");
			  }
		}
		
			System.out.println("+++++++++++++++++++++");
		System.out.println(numbers.contains(Integer.valueOf(11)));
		
	}

}
