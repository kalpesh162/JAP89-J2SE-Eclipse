package p1;

@FunctionalInterface
interface WelcomeMessage {
	void show();
}

public class App {

	public static void main(String[] args) {

		WelcomeMessage msg1 = () -> System.out.println("Namste JAVA");

		WelcomeMessage msg2 = () -> {
			System.out.println("Namste JAVA");
			System.out.println("Hello JAVA");
			System.out.println("Thank You JAVA");
		};

		msg1.show();
		msg2.show();

	}

}
