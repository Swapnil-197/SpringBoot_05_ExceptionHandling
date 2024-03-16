package com.sb.model;

import java.util.Date;

public class ErrorResponse {

	String errMessage;
	String errCode;
	Date date;
	
	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String errMessage, String errCode, Date date) {
		super();
		this.errMessage = errMessage;
		this.errCode = errCode;
		this.date = date;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
