package com.ecom.Aopllo_Hospital.Exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleFound(ResourceNotFoundException ex)
	{
		return ResponseEntity.status(404).body(
			new ErrorResponse(ex.getMessage(),404,LocalDateTime.now()));
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handelGeneral(Exception ex)
	{
		return ResponseEntity
				.status(500)
				.body(
				new ErrorResponse("Something went Wrong,",500, LocalDateTime.now()));
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> hanlderValidation(MethodArgumentNotValidException ex)
	{
		String error = ex.getBindingResult()
				.getFieldError()
				.getDefaultMessage();
		return ResponseEntity.status(400)
				.body(new ErrorResponse(error, 400, LocalDateTime.now()));
	}

}
