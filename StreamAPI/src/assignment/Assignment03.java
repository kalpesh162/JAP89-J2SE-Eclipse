package assignment;

import java.util.Arrays;
import java.util.List;
/*
Convert number to string
[1, 2, 3] → ["1", "2", "3"]
*/
public class Assignment03 {

		public static void main(String[] args) {
			
				List<Integer> numbers=Arrays.asList(1,2,3,4,5,56,6);
				// map used for transformation 
				// Here Integer --> String
				
				numbers.stream()
					   .map(n->String.valueOf(n))
					   .forEach(System.out::println);
				
				
				numbers.stream()
				       .map(String::valueOf)
				       .forEach(System.out::println);
				
				
				
				
				
			
		}

}
