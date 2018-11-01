package com.example.contoller_advice;


import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@RestControllerAdvice
//@Order(value = Ordered.HIGHEST_PRECEDENCE)
@RestController
@RequestMapping(value = {"/"})
public class BController {

//	@ExceptionHandler({HttpMediaTypeNotSupportedException.class})
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ResponseBody
//	public ResponseEntity<String> processException(HttpMediaTypeNotSupportedException exception) {
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//				.body("error, class B");
//	}

	@PostMapping(value = {"b"}, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getResponse(@Valid @RequestBody User user) throws Exception {
		return "Hello world! class B";
	}
}