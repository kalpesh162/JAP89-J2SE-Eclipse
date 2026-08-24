package cloning2;

//public class java.lang.Object {
// protected Object clone() throws CloneNotSupportedException
//}

class Point {
	private int x;
	private int y;

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	//

}

public class App {

	public static void main(String[] args) {

		Point p1 = new Point(10, 20);
		
		//System.out.println(p1.cl/);

	}

}
