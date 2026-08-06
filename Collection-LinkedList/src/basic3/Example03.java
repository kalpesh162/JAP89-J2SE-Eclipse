package basic3;

import java.util.LinkedList;

public class Example03 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				list.add(i);
			else
				list.addFirst(i);
		}

		System.out.println(list);

	}

}
