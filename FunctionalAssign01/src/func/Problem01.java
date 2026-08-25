package func;

import java.util.function.Function;

// Return average of digits of a number.

public class Problem01 {

	public static void main(String[] args) {

		Function<Integer, Double> avg = (num) -> {
			Double val = 0.0;
			Integer sum = 0;
			Integer cnt = 0;
			while (num > 0) {
				cnt++;
				sum += num % 10;
				num = num / 10;
			}

			val = sum / (cnt * 1.0);
			return val;
		};

		Double res = avg.apply(551);

		System.out.print(res);
	}

}
