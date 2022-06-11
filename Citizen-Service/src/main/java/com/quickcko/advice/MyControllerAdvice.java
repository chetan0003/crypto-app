package com.quickcko.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.quickcko.custom.exception.EmptyInputException;


@ControllerAdvice
public class MyControllerAdvice {
	
	private Logger log = LoggerFactory.getLogger(MyControllerAdvice.class);
	
    @ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullException(NullPointerException nullPointerException)
	{
    	log.info(nullPointerException.getMessage());
    	return new ResponseEntity<String>("object should not be empty",HttpStatus.BAD_REQUEST);
	}
    
    @ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException)
	{
    	System.out.println(emptyInputException.getMessage());
    	return new ResponseEntity<String>("object should not be empty",HttpStatus.BAD_REQUEST);
	}
}

