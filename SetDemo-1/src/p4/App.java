package p4;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		Data d1 = new Data(11);
		Data d2 = new Data(12);
		Data d3 = new Data(21);
		Data d4 = new Data(13);
		Data d5 = new Data(33);
		Data d6 = new Data(111);
		Data d7 = new Data(17);

		HashSet<Data> numbers = new HashSet<Data>();
		numbers.add(d1);
		numbers.add(d2);
		numbers.add(d3);
		numbers.add(d4);
		numbers.add(d5);
		numbers.add(d6);
		numbers.add(d7);
		
		numbers.add(d1);
		numbers.add(d2);
		numbers.add(d3);
		numbers.add(d4);
		numbers.add(d5);
		numbers.add(d6);
		numbers.add(d7);


		System.out.println(numbers);
		
		System.out.println("-->"+numbers.contains(new Data(12)));
		System.out.println("-->"+numbers.remove(new Data(12)));
		
	}

}
