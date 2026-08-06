package basic4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example04 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);

		System.out.println(numbers);

		ListIterator<Integer> itr = numbers.listIterator(numbers.size());
		while (itr.hasPrevious())
			System.out.print(itr.previous() + "  ");

		System.out.println();

		Iterator<Integer> itr2 = numbers.descendingIterator();

		while (itr2.hasNext())
			System.out.print(itr2.next() + "  ");

		System.out.println("\u2665");

		System.out.println("\u2661");
		
		System.out.println("Id   SONGNAME   SINGER   LIKED    TIME  ");
		
		int id=11;
		System.out.printf("%-5d",id);
		
	}

}
