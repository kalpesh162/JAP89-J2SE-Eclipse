package p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

// How to create Stream
public class Example01 {

	public static void main(String[] args) {
		// 1 :
		Stream<String> s1 = Stream.of("Anup", "Navin", "Ravi", "Ganesh");

		// s1 is stream Object implementation

		// 2 : Empty Stream
		Stream<Integer> numbers = Stream.empty();

		// Step 3 :

		Stream<String> s3 = Stream.<String>builder().add("A").add("B").add("C").build();

		// Stream Object by using concat
		Stream<String> stream1 = Stream.of("Anup", "Navin", "Ravi", "Ganesh");
		Stream<String> stream2 = Stream.of("Anurag", "Nayan", "Rahul", "Gauri");

		Stream<String> stream3 = Stream.concat(stream1, stream2);

		// Suppelier<Double> sup = () -> Math.random()
		// Suppelier<Double> sup = Math::random

		// Stream s1=Stream.generate(Supplier);
		// Stream s2=s1.limit(5);

		Stream<Double> num = Stream.generate(Math::random).limit(5);

		// Method Reference To Static

		// itearte()

		UnaryOperator<Integer> unary = (n) -> n + 2;

		// Stream<Integer> numbersStream=Stream.iterate(0,unary);
		Stream<Integer> numbersStream = Stream.iterate(0, (n) -> n + 2).limit(10);

		// Collection to Stream

		// VIMP
		List<Integer> values = Arrays.asList(11, 22, 33, 44, 55);
		Stream<Integer> numList = values.stream();

		// Stream<Integer> paStream=values.parallelStream();
		// Array Stream

		String[] arr = { "X", "Y", "Z" };

		Stream<String> s = Arrays.stream(arr);

	}

}
