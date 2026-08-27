package consume;
import java.util.function.Consumer;
class Triangle {
	Integer angle1;
	Integer angle2;
	Integer angle3;
	public Triangle(int i, int j, int k) {
		angle1=i;
		angle2=j;
		angle3=k;
	}
	Integer totalSum() {
		return angle1 + angle2 + angle3;
	}
	String isValidTraingel() {
		if (totalSum() == 180)
			return "Valid Traingle";
		else
			return "InValid Traingle";
	}
}
public class Problem06 {

	public static void main(String[] args) {		
		Consumer<Triangle> checkingValid=( t ) -> System.out.print(t.isValidTraingel());

		checkingValid.accept(new Triangle(60,70,60));
		
		System.out.println("----------------------------------");
		
		Consumer<int[]> triangle = (angles) -> {
			int sum = angles[0] + angles[1] + angles[2];
			if (sum == 180) {
			System.out.println("Valid Triangle");
			} else {
			System.out.println("Invalid Triangle");
			}
			};

			triangle.accept(new int[]{60, 60, 60});
	}
}
