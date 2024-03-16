package com.sb.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sb.model.ErrorResponse;

@ControllerAdvice
public class ExceptionHandlerUtil {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> studentExceptionHandler(StudentNotFoundException e){
		ErrorResponse errRes = new ErrorResponse();
		errRes.setErrMessage(e.getErrMessage());
		errRes.setErrCode(HttpStatus.NOT_FOUND.toString()); // errCode we have taken in, 
		//String thats why we used toString() if we do not used toString() it will give an, 
		//error.
		errRes.setDate(new Date());
		
		return new ResponseEntity<ErrorResponse>(errRes , HttpStatus.NOT_FOUND);
		
	}

}
