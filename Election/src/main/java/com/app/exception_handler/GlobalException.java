package com.app.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.APIResponce;

@RestController
public class GlobalException {

	public ResponseEntity<?> exceptionHandle(Exception e){
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new APIResponce("invalid input",null));
		
	}
}
