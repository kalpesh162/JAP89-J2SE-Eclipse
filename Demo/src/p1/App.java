package p1;

public class App {
	
	public static void main(String[] args) {
		
		String pattern="^[a-zA-Z]+$";
		String pattern1="^[a-z]+";
		
		System.out.println("Hello123".matches(pattern));
		System.out.println("Hello".matches(pattern));
	}

}
