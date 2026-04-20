package com.Ecomproject.Airlines.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ExceptionField> customerhandler(CustomerNotFoundException ex) {

		ExceptionField exce = new ExceptionField();
		exce.setStatus_code(505);
		exce.setDate(LocalDateTime.now());
		exce.setMessage(ex.getMessage());
		exce.setTrace(ex.getStackTrace()[0].toString());

		return new ResponseEntity<ExceptionField>(exce, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
