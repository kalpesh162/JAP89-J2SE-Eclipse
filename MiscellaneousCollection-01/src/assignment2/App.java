package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// List<Set<String>>

public class App {

	public static void main(String[] args) {

		Set<String> movies1 = new HashSet<String>();
		movies1.add("Kuch Kuch Hota Hai");
		movies1.add("Pathan");
		movies1.add("Swadesh");

		Set<String> movies2 = new HashSet<String>();
		movies2.add("Ghatak");
		movies2.add("Border");
		movies2.add("Indian");

		Set<String> movies3 = new HashSet<String>();
		movies3.add("Golmal");
		movies3.add("Drushyam");
		movies3.add("Singham");

		Set<String> movies4 = new HashSet<String>();
		movies4.add("Golmal");
		movies4.add("Drushyam");
		movies4.add("Singham");

		List<Set<String>> moviesList = new ArrayList<Set<String>>();
		moviesList.add(movies1);
		moviesList.add(movies2);
		moviesList.add(movies3);
		moviesList.add(movies4);

		for (int i = 0; i < moviesList.size(); i++) {
			System.out.println("***** ACTORS *******");
			Set<String> set = moviesList.get(i);
			System.out.println(set);

		}

	}

}
