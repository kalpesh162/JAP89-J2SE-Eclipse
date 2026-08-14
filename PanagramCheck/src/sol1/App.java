package sol1;

import java.util.HashMap;

public class App {
	public static boolean isPanagram(String input) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		// All Alphabets
		for (char letter : alphabets.toCharArray())
			map.put(letter, 0);

		// All Input Alphabets
		for (char letter : input.toCharArray()) {
			Integer val = map.get(letter);
			map1.put(letter, val + 1);
		}

		if (map.size() != map1.size())
			return false;

		for (char letter : alphabets.toCharArray()) {
			Integer val = map1.get(letter);
			if (val == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "thequickbrownfoxjumpsoverthelazydog";
		// String s2 = "pack my box with five dozen liquor jugs";
		// String s3 = "sphinx of black quartz, judge my vow";
		// String s4 = "how vexingly quick daft zebras jump";
		// String s5 = "the five boxing wizards jump quickly";
		// String s6 = "waltz bad nymph for quick jigs vex";
		// String s7 = "mr Jock TV quiz PhD bags few lynx";
		// String s8 = "glib jocks quiz nymph to vex dwarf";
		System.out.println("1 Step");
		System.out.println(isPanagram(s1));
		String s4 = "abcdefghijklmnopqrstuvwxy";
		System.out.println(isPanagram(s4));
		/*
		 * System.out.println(isPanagram(s2)); System.out.println(isPanagram(s3));
		 * System.out.println(isPanagram(s4)); System.out.println(isPanagram(s5));
		 * System.out.println(isPanagram(s6)); System.out.println(isPanagram(s7));
		 * System.out.println(isPanagram(s8));
		 */
	}

}
