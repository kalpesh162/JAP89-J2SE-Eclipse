package p1;

import java.lang.reflect.InvocationTargetException;

public class App {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		// Class forName(String)
		Class c1 = Class.forName("p1.Point");
		Point point1 = (Point) c1.newInstance();

		System.out.println(point1.getX());
		System.out.println(point1.getY());

		System.out.println("---------------------------");

		Class c2 = Class.forName("p1.Point");
		Point point2 = (Point) c2.getDeclaredConstructor().newInstance();

		System.out.println(point2.getX());
		System.out.println(point2.getY());

	}

}
