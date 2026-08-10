package p1;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo01 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(11);
		list.add(11);
		list.add(21);
		list.add(22);
		list.add(1);

		HashSet<Integer> uniIntegers = new HashSet<Integer>(list);

		System.out.println(uniIntegers);

		ArrayList<Integer> retList = new ArrayList<Integer>(uniIntegers);

	}

}
