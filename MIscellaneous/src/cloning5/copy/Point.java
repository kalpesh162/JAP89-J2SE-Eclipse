package cloning5.copy;

import java.util.Arrays;

public class Point implements Cloneable {
	int arr[] = new int[2];

	public Point() {
		arr[0] = 0;
		arr[1] = 0;
	}

	public Point(int x, int y) {
		arr[0] = x;
		arr[1] = y;
	}

	@Override
	public String toString() {
		return "Point [arr=" + Arrays.toString(arr) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Point cloned = (Point) super.clone(); // arr 100

		cloned.arr = new int[2]; // memory

		// intialize
		cloned.arr[0] = this.arr[0];
		cloned.arr[1] = this.arr[1];

		return cloned;
	}

	
}
