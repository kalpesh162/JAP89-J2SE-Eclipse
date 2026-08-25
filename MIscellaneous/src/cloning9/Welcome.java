package cloning9;

import java.util.ArrayList;

public class Welcome implements Cloneable {
	private String greet;

	public Welcome() {
		// TODO Auto-generated constructor stub
	}

	public Welcome(String greet) {
		super();
		this.greet = greet;
	}

	@Override
	public String toString() {
		return "Welcome [greet=" + greet + "]";
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

	return null;

	}

}
