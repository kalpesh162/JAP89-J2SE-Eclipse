package p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example03 {
	
	public static Predicate<String> checkIfStartWith(String letter){
		

		return name -> name.startsWith(letter);
		
	}
	
	public static void main(String[] args) {
		
		List<String> casualFriends = Arrays.asList("Ram", "Nitin", "Neha", "Amit", "Priya", "Rahul", "Sneha", "Vikas","Ravi","Poonam");
		
		List<String> collegeFriends = Arrays.asList(
		    "Ram", "Nitin", "Neha", "Amit","puja","poonam","Piyali"
		);

		List<String> childhoodFriends = Arrays.asList(
		    "Priya", "Rahul", "Sneha","raghav"
		);
		
		
		System.out.println("------------------------");
		
		casualFriends.stream()
					 .filter(checkIfStartWith("N"))
					 .forEach(System.out::println);
		
		casualFriends.stream()
					 .filter(checkIfStartWith("P"))
					 .forEach(System.out::println);
					
		casualFriends.stream()
					 .filter(checkIfStartWith("R"))
					 .forEach(System.out::println);
		
		
		System.out.println("------------------------");
		
		
		long countN=casualFriends.stream()
		 .filter(checkIfStartWith("N"))
		 .count();

		System.out.println(countN);
	}

}
