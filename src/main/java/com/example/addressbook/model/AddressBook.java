package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;

public class AddressBook {

	int id;
	String firstName;
	String address;
	String phoneNumber;
	public AddressBook(int id, AddressBookDTO  address) 
	{
		super();
		this.firstName =address.firstName;
		this.address =address.address;
		this.phoneNumber =address. phoneNumber;
	}
}
