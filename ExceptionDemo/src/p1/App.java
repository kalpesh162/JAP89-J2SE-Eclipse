package p1;

public class App {

	public static void main(String[] args) {

		Student s1 = new Student();
		/*
		 * try { System.out.println(s1.getName().length()); // NullPointerException
		 * 
		 * }catch (Exception e) { //throw new StudentException(); e.initCause(new
		 * StudentException("Beacuse Null name"));
		 * System.out.println("---------------------"); System.out.println(e);
		 * e.printStackTrace(); System.out.println("---------------------"); }
		 */
		try {
			System.out.println(s1.getName().length()); // NullPointerException

		} catch (Exception e) {
			throw new StudentException(e);

		}
	}

}
