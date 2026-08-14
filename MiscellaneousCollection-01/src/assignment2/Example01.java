package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example01 {
	
	public static void main(String[] args) {
		
		List<Set<String>>orders=new ArrayList<>();

		Set<String>customer1=new HashSet<String>();
		customer1.add("Laptop");
		customer1.add("Phone");
		customer1.add("Tablet");
		
		Set<String>customer2=new HashSet<String>();
		customer2.add("Camera");
		customer2.add("Laptop");
		customer2.add("HeadPhones");
		
		Set<String>customer3=new HashSet<String>();
		customer3.add("Camera");
		customer3.add("Phone");
		customer3.add("Shoes");
		
		orders.add(customer1);
		orders.add(customer2);
		orders.add(customer3);
		
		int i=1;
		for(Set<String> customer:orders) {
			  System.out.println("Customer  "+i++);
			  for(String items:customer)
				  System.out.println(items);
		}
		
	}

}
