package supplier;

import java.util.function.Supplier;

//Create a Supplier<String> that returns your name.
public class Problem02 {

	public static void main(String[] args) {

		Supplier<String> name = () -> "Kalpesh".toUpperCase();

		Supplier<String> name1 = () -> {
			return "Kalpesh".toUpperCase();
		};

		System.out.println(name.get());
		System.out.println(name1.get());

	}

}
