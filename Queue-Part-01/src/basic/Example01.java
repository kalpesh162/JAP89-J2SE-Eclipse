package basic;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example01 {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(11);
		queue.offer(22);
		queue.add(1);
		queue.add(21);

		System.out.println(queue);

		System.out.println("----------------------------------");
		Iterator<Integer> iterator = queue.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		// If you need ordered traversal, consider using Arrays.sort(pq.toArray())

		System.out.println("element    " + queue.element());
		System.out.println("peek    " + queue.peek());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll()); // queue.remove
		}

		System.out.println("++++++++++++++++++");
		System.out.println(queue);
		
		//System.out.println(queue.element());
		//System.out.println(queue.peek());
		
		//System.out.println(queue.remove());
		//System.out.println(queue.poll());
		
		
		
	}

}
