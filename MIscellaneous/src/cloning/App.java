package cloning;

public class App {

	public static void main(String[] args) {

		Point p1 = new Point(11, 22);

		// Point p2=p1; c++
		// Point p2=p1;

		Point p2 = new Point(p1);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		Point p3 = p1;
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());

		
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
	}

}
