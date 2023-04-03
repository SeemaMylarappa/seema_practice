package com.example.demoforpoc.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BankExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> exceptionMeth(MethodArgumentNotValidException metNotValidException){
		Map<String, String> respons=new HashMap<>();
		List<ObjectError> res = metNotValidException.getBindingResult().getAllErrors();
		for (ObjectError error : res) {
		String fieldname=((FieldError)error).getField();
		String defString=  error.getDefaultMessage();
		respons.put(fieldname, defString);
		}
		return new ResponseEntity<Map<String,String>>(respons,HttpStatus.BAD_REQUEST);
	}

}
