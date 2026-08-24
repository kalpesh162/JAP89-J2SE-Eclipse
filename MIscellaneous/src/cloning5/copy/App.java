package cloning5.copy;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {

		Point p1 = new Point(11, 22);
		System.out.println(p1);

		Point p2 = (Point) p1.clone();
		System.out.println(p2);
		System.out.println("---------------------------------");
		p1.arr[0] = 101;
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("=================================");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
