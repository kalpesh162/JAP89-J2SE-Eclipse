package p1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.push("AA"); // 6
		st.push("BB"); // 5
		st.push("AA"); // 4
		st.push("CC"); // 3
		st.push("AA"); // 2
		st.push("DD"); // 1

		System.out.println(st);

		System.out.println(st.peek());

		System.out.println(st.search("CC"));
		System.out.println(st.search("AA"));
		System.out.println(st.search("TT"));

		System.out.println(st.pop());
		System.out.println("After POP  " + st);

		st.add(1, "FF");

		System.out.println(st);

		System.out.println("Search FF  " + st.search("FF"));
	}

}
