package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;

public class AddressBook {

	int id;
	String firstName;
	String address;
	String phoneNumber;
	public AddressBook(int id, AddressBookDTO  address) {
		super();
		this.firstName =address.firstName;
		this.address =address.address;
		this.phoneNumber =address. phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
