package predicate;

import java.time.Year;
import java.util.function.Predicate;

// Check if a year is a leap year.
// boolean test(T t)
public class App {

	public static void main(String[] args) {

		Predicate<Integer> isLeapYear = year -> year % 400 == 0 ? true
				: year % 100 != 0 && year % 4 == 0 ? true : false;

		
		System.out.println(isLeapYear.test(1989));
		System.out.println(isLeapYear.test(1984));
	}

}
