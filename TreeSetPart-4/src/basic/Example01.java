package basic;

import java.util.TreeSet;

public class Example01 {

	public static void main(String[] args) {
		TreeSet<Integer> timeTable = new TreeSet<Integer>();
		timeTable.add(4);
		timeTable.add(14);
		timeTable.add(11);
		timeTable.add(2);
		timeTable.add(22);
		timeTable.add(6);
		timeTable.add(16);
		timeTable.add(3);

		System.out.println(timeTable);

		System.out.println(timeTable.ceiling(10));
		System.out.println(timeTable.ceiling(11));
		System.out.println(timeTable.ceiling(23));

		System.out.println("---------------------");
		System.out.println(timeTable.floor(10));
		System.out.println(timeTable.floor(6));

		System.out.println("---------------------");

		System.out.println(timeTable.higher(10));
		System.out.println(timeTable.higher(11));
		System.out.println(timeTable.higher(22));

		System.out.println("---------------------");
		System.out.println(timeTable.lower(10));
		System.out.println(timeTable.lower(6));

		System.out.println(timeTable.pollFirst());
		System.out.println(timeTable.pollLast());

		System.out.println(timeTable);

	}

}
