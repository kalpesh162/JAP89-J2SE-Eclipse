package p1;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return Double.valueOf(o1.getMarks()).compareTo(Double.valueOf(o2.getMarks()));
	}

}
