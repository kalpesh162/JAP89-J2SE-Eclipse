package assignment1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class App {
	/*
	 * public static LinkedList<Integer> reverse(LinkedList<Integer>original){
	 * 
	 * LinkedList<Integer> res=new LinkedList<Integer>();
	 * 
	 * ListIterator<Integer> l1=original.listIterator(original.size());
	 * 
	 * while(l1.hasPrevious()) res.add(l1.previous());
	 * 
	 * return res; }
	 * 
	 */

	public static LinkedList<Integer> reverse(LinkedList<Integer> original) {
		int left = 0;
		int right = original.size() - 1;

		while (left < right) {
			// swap
			Integer temp1 = original.get(left);
			Integer temp2 = original.get(right);
			original.set(left, temp2);
			original.set(right, temp1);

			left++;
			right--;
		}

		return original;
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(new Random().nextInt(10000));
		}

		System.out.println(list);

		System.out.println(reverse(list));

	}

}
