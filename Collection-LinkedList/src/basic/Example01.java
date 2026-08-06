package basic;

import java.util.LinkedList;

public class Example01 {

	public static void main(String[] args) {

		LinkedList<String> friends = new LinkedList<String>();
		friends.add("Rahul");
		friends.add("Kunal");
		friends.offer("Tushar");

		friends.push("Yogesh"); // addAtFirst

		System.out.println(friends);
		friends.addFirst("Rohit");
		friends.offerFirst("Kareena");

		System.out.println(friends);

		//System.out.println(friends.remove());
		System.out.println(friends.pop());	
		friends.clear();

		// System.out.println(friends.remove()); ///java.util.NoSuchElementException

		//System.out.println(friends.poll());

	}

}
