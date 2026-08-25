package p2;

@FunctionalInterface
interface SquareOperation {
	int square(int number);
}

public class App {

	public static void main(String[] args) {

		SquareOperation op1 = (int n) -> {
			return n * n;
		};
		System.out.println(op1.square(5));

		SquareOperation op2 = (n) -> (n % 2) == 0 ? n * n : n * n * n;

		System.out.println(op2.square(10));

		SquareOperation op3 = x -> x * x;
		System.out.println(op3.square(11));

		SquareOperation op4 = (n) -> {
			if (n % 2 == 0)
				return n * n;
			else
				return n * n * n;
		};

		System.out.println(op4.square(5));

	}

}
