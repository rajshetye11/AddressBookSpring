package com.example.addressbook.dto;

public class ResponseDTO {

	public String message;
	public Object object;

	public ResponseDTO(String message, Object object) {
		super();
		this.message = message;
		this.object = object;
	}
	
}
