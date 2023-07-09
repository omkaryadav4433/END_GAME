package com.app.DTO;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class APIResponce {
	
	private String msg;
	private LocalDateTime timestamp;
	public APIResponce(String msg, LocalDateTime timestamp) {
		super();
		this.msg = msg;
		this.timestamp = LocalDateTime.now();
	}
	
	
	

}
