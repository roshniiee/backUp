package com.cg.ImportedOrder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrderExceptionHandler {
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<String> handleException(Exception exception) {
		return new ResponseEntity<String>(" Please Enter an valid one : " + exception.getMessage(),
				HttpStatus.CONFLICT);

	}

}
