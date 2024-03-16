package com.sb.exceptions;

public class StudentNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	String errMessage;
	
	public StudentNotFoundException(String message) {
		super();
		this.errMessage=message;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	
}
