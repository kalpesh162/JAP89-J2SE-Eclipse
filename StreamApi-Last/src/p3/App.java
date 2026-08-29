package p3;

import java.util.HashMap;

public class App {
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(101, "Rahul");
		hashMap.put(102, "Priya");
		hashMap.put(103, "Amit");
		hashMap.put(104, "Sneha");
		hashMap.put(105, "Rohan");
		
		
		hashMap.entrySet()
			   .stream()
			   .forEach(System.out::println);
		
		System.out.println("-------------------");
		
		hashMap.keySet()
			   .stream()
			   .forEach(System.out::println);
		
		System.out.println("----------------------");
		
		hashMap.values()
			   .stream()
			   .forEach(System.out::println);
		
		
		
		
		
		
		
		

		
		
	}

}
