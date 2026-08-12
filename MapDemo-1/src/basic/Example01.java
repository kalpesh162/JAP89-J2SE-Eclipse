package basic;

import java.util.HashMap;
import java.util.Map;

public class Example01 {

	public static void main(String[] args) {

		// Map is an Interface

		Map map = new HashMap();
		map.put(1, "ABCD");
		map.put('A', 33);
		map.put('A', 11);
		map.put("Hello", 11.11);
		map.put(true, 111);
		map.put(null, "...");
		map.put(22, null);

		System.out.println(map);

	}

}
