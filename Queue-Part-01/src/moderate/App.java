package moderate;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		Task task1 = new Task(101, "Fix Login Bug", 5);
		Task task2 = new Task(102, "Write Unit Tests", 3);
		Task task3 = new Task(103, "Update Documentation", 1);
		Task task4 = new Task(104, "Design Database", 4);
		Task task5 = new Task(105, "Code Review", 2);

		Queue<Task> taskList = new PriorityQueue<Task>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);

		System.out.println("-------------------------");
		for (Task task : taskList)
			System.out.println(task);

		System.out.println("-------------------------");

		while (!taskList.isEmpty()) {
			System.out.println(taskList.poll());
		}

		System.out.println("++++++++++++++++++++++++++");

		Comparator<Task> byPriority = new Comparator<Task>() {
			@Override
			public int compare(Task o1, Task o2) {
				Integer i1 = Integer.valueOf(o1.getTaskPriority());
				Integer i2 = Integer.valueOf(o2.getTaskPriority());
				return -i1.compareTo(i2);
			}
		};

		PriorityQueue<Task> taskQueue = new PriorityQueue<Task>(byPriority);
		taskQueue.add(task1);
		taskQueue.add(task2);
		taskQueue.add(task3);
		taskQueue.add(task5);
		taskQueue.add(task4);

		// Need To Print
		//

		System.out.println("**************************************");
		while (!taskQueue.isEmpty()) {
			System.out.println(taskQueue.poll());
		}

	}

}
