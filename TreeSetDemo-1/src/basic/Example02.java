package basic;

import java.util.TreeSet;

public class Example02 {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(11);
		ts.add(null);  // ts.add(11);
		ts.add(1);
		ts.add(21);
		ts.add(13);
		
		System.out.println(ts);
		
	}

}
