package basic;

import java.util.TreeSet;

public class Example01 {
	
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet();
		treeSet.add(11);  // Integer
		treeSet.add("11"); // String
		treeSet.add(11.11); // Double
		treeSet.add('1');  // Character
		treeSet.add(false); // Boolean
		
		System.out.println(treeSet);
	}

}
