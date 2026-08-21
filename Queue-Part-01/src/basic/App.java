package basic;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) {

		// Create Queue

		Queue queue = new PriorityQueue();
		queue.add(11);
		queue.add("11");
		queue.add(11.11);
		queue.add(true);
		queue.add('A');
		queue.add(null);

		System.out.println(queue);

	}

}
