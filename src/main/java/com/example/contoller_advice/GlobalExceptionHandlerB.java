package com.example.contoller_advice;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = BController.class)
//@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandlerB {

	@ExceptionHandler({HttpMediaTypeNotSupportedException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<String> processException(HttpMediaTypeNotSupportedException exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("error, class B");
	}

	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<String> processException2(MethodArgumentNotValidException exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("error, class B");
	}

	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<String> processException2(Exception exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("error, class B");
	}
}