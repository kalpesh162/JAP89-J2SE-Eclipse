package p4;

import java.util.Objects;

public class Data {
	private int num;

	public Data(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + "]";
	}

	/*
	@Override
	public int hashCode() {
		return num % 10;
	}
	*/
	
	

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		return num == other.num;
	}

}
