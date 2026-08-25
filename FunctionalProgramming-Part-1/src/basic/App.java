package basic;

public class App {

	public static void main(String[] args) {

		Addable add1 = new Addable() {
			@Override
			public void doAdd(int a, int b) {
				System.out.println(a + b);
			}
		};

		add1.doAdd(11, 22);

		System.out.println("--------------------------");
		// Lambda expression
		// Functional INterface
		Addable add2 = (int a, int b) -> System.out.println(a + b);
		//Addable add3 = (int a, int b, int c) -> System.out.println(a + b + c);

		add2.doAdd(22, 44);

	}

}
