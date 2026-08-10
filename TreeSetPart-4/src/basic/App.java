package basic;

import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		TreeSet<Integer> number = new TreeSet<Integer>();
		number.add(4);
		number.add(5);
		number.add(2);
		number.add(1);
		number.add(6);
		System.out.println(number);

		System.out.println("first " + number.first());
		System.out.println("first " + number.last());

		System.out.println("HeadSet" + number.headSet(2)); // <E
		System.out.println("HeadSet" + number.headSet(4));
		System.out.println("HeadSet" + number.headSet(44));

		System.out.println("HeadSet" + number.tailSet(4)); // <=

		System.out.println("subset" + number.subSet(2, 6)); // star= <end

	}

}
