package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;;

public class Example01 {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Sachin", "Navin", "Ravi", "Raju", "Alex", "Hima");

		List<String> upperNameList=new ArrayList<String>();
		
		for(String name:friends)
			upperNameList.add(name.toUpperCase());
		

		System.out.println(friends);
		System.out.println(upperNameList);
		
		System.out.println("--------------------------");
		
		Function<String, String> capital=(name) -> name.toUpperCase();
		
		Function<String, String> capital1=String::toUpperCase;

				// map(Function<T,R>)
		friends.stream()
			   .map(capital)
			   .forEach((n) -> System.out.println(n));
		
		System.out.println("-----------------");
		
		friends.stream()
		       .map(String::toUpperCase)
		       .forEach(System.out::println);
		
		System.out.println("-------------------------------");
	
		
		friends.stream()
		       .map(String::length)
		       .forEach(System.out::println);
		
		
		System.out.println("-------------------------");
		// collect(Collector)  Collectors
		// Collectors.toList()
		 List<String> result=friends.stream()
		 	    .map(String::toUpperCase)
		 	    .collect(Collectors.toList());
		 
		 System.out.println("--------------------------");
		
		 List<String> result1=friends.stream()
				 					 .map(String::toUpperCase)
				 					 .collect(toList());
			
		 
		
		
	}

}
