package com.Chat.app.chat_Application.Exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiError> handleNotFound(ResourceNotFoundException ex) {

		ApiError error = new ApiError();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setError("NOT FOUND");
		error.setMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ApiError> handleBadRequest(BadRequestException ex) {

		ApiError error = new ApiError();

		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setError("BAD REQUEST");
		error.setMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<ApiError> handleUnauthorized(UnauthorizedException ex) {

		ApiError error = new ApiError();

		error.setStatus(HttpStatus.UNAUTHORIZED.value());
		error.setError("UNAUTHORIZED");
		error.setMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> handleGlobal(Exception ex) {

		ApiError error = new ApiError();

		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setError("INTERNAL SERVER ERROR");
		error.setMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}