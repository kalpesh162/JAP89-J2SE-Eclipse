package basic;

import java.util.TreeSet;

public class Example04 {

	public static void main(String[] args) {
		int rooms[] = { 11, 2, 33, 22, 5 };
		boolean roomAvailibility[] = { true, false, true, false, false };

		TreeSet<Boolean> roomList = new TreeSet<Boolean>();

		for (boolean val : roomAvailibility)
			roomList.add(val);

		System.out.println(roomList);

		// LIKE 
		TreeSet<Boolean> ttk=new TreeSet<Boolean>();
		ttk.add(true);
		ttk.add(false);
		
		System.out.println(ttk);
		
		
	}

}
