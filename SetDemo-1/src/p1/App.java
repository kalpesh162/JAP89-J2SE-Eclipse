package p1;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		// unique

		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);

		System.out.println(numbers);

		System.out.println("--------------------");

		HashSet<Integer> counters = new HashSet<Integer>();
		counters.add(2);
		counters.add(12);
		counters.add(20);
		counters.add(6);
		counters.add(4);

		System.out.println(counters);

		System.out.println("-------------------------");
		HashSet<Integer> table = new HashSet<Integer>();

		table.add(1);
		table.add(2);
		table.add(3);
		table.add(4);
		table.add(5);
		// HashSet dont provide gurantee insertion Order
		System.out.println(table);

	}

}
