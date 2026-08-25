package cloning9;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {

		Welcome welcome1 = new Welcome("Hello!!!");

		Welcome welcome2 = (Welcome) welcome1.clone();

		System.out.println(welcome1.hashCode());
		System.out.println(welcome2.hashCode());

		System.out.println(welcome1.getGreet());
		System.out.println(welcome2.getGreet());

	}

}
