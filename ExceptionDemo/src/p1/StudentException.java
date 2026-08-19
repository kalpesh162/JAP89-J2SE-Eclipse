package p1;

public class StudentException extends RuntimeException {

	public StudentException() {

	}

	public StudentException(String msg) {
		super(msg);
	}

	public StudentException(Throwable e) {
		super(e);
	}

}
