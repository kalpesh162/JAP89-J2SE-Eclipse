package basic;

import java.util.Iterator;
import java.util.TreeSet;

public class Example01 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(12);
		ts.add(2);
		ts.add(21);
		ts.add(10);
		ts.add(13);
		
		System.out.println(ts);
		
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
