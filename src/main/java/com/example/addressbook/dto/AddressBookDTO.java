package com.example.addressbook.dto;

public class AddressBookDTO {
	
	public String firstName;
	public	String address;
	public	String phoneNumber;
	
	public AddressBookDTO(String firstName, String lastName, String address, String city, 
			String state, String zipcode, String phoneNumber, String email, String type) 
	{
		super();
		this.firstName = firstName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
}
