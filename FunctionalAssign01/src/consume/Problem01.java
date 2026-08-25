package consume;
import java.util.function.Consumer;
//Print whether a number is even or odd.
public class Problem01 {
	public static void main(String[] args) {
		int num = 10;
		Consumer<Integer> consumer = (n) -> {
			String msg = (n % 2 == 0) ? "Even" : "Odd";

			System.out.println(msg);
		};
		consumer.accept(num);
	}

}
