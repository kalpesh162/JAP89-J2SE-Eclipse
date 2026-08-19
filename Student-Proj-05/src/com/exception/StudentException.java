package com.exception;

public class StudentException extends RuntimeException {

	public StudentException() {
	
	}

	public StudentException(String msg) {
		super(msg);
	}
	
	public StudentException(String msg,Throwable cause) {
		super(msg);
	}


}
