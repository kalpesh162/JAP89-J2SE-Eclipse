package cloning3;

public class Point implements Cloneable {
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

	public static void main(String[] args) {

		Point p1 = new Point(11, 22);
		Point p2 = null;
		try {
			p2 = (Point) p1.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		p1.x = 101;
		p1.y = 111;
		System.out.println(p1);
		System.out.println(p2);

	}

}
