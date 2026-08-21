package moderate;

public class Task implements Comparable<Task> {
	private int taskId;
	private String taskName;
	private int taskPriority;

	public Task() {

	}

	public Task(int taskId, String taskName, int taskPriority) {

		this.taskId = taskId;
		this.taskName = taskName;
		if (taskPriority > 5 || taskPriority < 1)
			throw new IllegalArgumentException("Argument is not legal  " + taskPriority);

		this.taskPriority = taskPriority;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(int taskPriority) {
		if (taskPriority > 5 || taskPriority < 1)
			throw new IllegalArgumentException("Argument is not legal  " + taskPriority);

		this.taskPriority = taskPriority;
	}

	@Override
	public String toString() {
		return String.format("%-3d  %-20s  %2d ", taskId, taskName, taskPriority);
	}

	@Override
	public int compareTo(Task other) {

		return -Integer.valueOf(this.taskPriority).compareTo(Integer.valueOf(other.taskPriority));
	}

}
