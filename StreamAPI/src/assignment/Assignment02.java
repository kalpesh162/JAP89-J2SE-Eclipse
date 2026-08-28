package assignment;

import java.util.Arrays;
import java.util.List;

/*
Add prefix to names

Convert:
["Ram", "Shyam"] → ["Mr. Ram", "Mr. Shyam"]
*/
public class Assignment02 {
	
	public static void main(String[] args) {
	
		List<String> friends=Arrays.asList(
			    "Ram", "Nitin", "Neha", "Amit"
				);
		
		friends.stream()
			   .map(n-> "Mr. ".concat(n))
			   .forEach(System.out::println);

		
		
		
		
	}

}
