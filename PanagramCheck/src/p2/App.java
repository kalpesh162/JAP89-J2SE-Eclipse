package p2;

public class App {

	public static boolean isPanagram(String input) {
		if (input.length() < 26)
			return false;

		char arr[] = input.toCharArray();
		boolean flag[] = new boolean[26];

		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] - 'a';
			flag[index] = true;
		}

		for (int i = 0; i < flag.length; i++)
			if (flag[i] == false)
				return false;

		return true;
	}

	public static void main(String[] args) {

		String s4 = "abcdefghijklmnopqrstuvwxy";
		String s1 = "thequickbrownfoxjumpsoverthelazydog";

		System.out.println(isPanagram(s4));
		System.out.println(isPanagram(s1));
	}

}
