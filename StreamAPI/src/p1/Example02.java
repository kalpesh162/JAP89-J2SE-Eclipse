package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example02 {

	public static void main(String[] args) {
		List<String> casualFriends = Arrays.asList("Ram", "Nitin", "Neha", "Amit", "Priya", "Rahul", "Sneha", "Vikas","Ravi","Poonam");
		
			List<String> collegeFriends = Arrays.asList(
			    "Ram", "Nitin", "Neha", "Amit","puja","poonam","Piyali"
			);

			List<String> childhoodFriends = Arrays.asList(
			    "Priya", "Rahul", "Sneha","raghav"
			);

			
			// startWithN  startsWithP  startsWithR
		
	  		List<String>statsWithN=casualFriends.stream()
										  .filter(n -> (n.startsWith("N") | n.startsWith("n")))
										  .collect(Collectors.toList());
		
			System.out.println("N  List Name  "+statsWithN);
			
			List<String>statsWithP=collegeFriends.stream()
					  							.filter(n -> (n.startsWith("P") | n.startsWith("p")))
					  							.collect(Collectors.toList());

        
		     System.out.println("P  List Name  "+statsWithP);

     		 List<String>statsWithR=childhoodFriends.stream()
												    .filter(n -> (n.startsWith("R") | n.startsWith("r")))
												    .collect(Collectors.toList());
			
			System.out.println("P  List Name  "+statsWithR);
					

			
			
	}

}
