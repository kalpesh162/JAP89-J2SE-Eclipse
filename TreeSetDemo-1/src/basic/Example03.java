package basic;

import java.util.TreeSet;

public class Example03 {
	
	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(null);
		
		System.out.println(ts);
		
		System.out.println("------------------");
		TreeSet<Integer>ts1=new TreeSet<Integer>();
		ts1.add(11);
		ts1.add(1);
		ts1.add(21);
		ts1.add(12);
		ts1.add(11);
		ts1.add(null);
		
		System.out.println(ts1);
		
	}

}
