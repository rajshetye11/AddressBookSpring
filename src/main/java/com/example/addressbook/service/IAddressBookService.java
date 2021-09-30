package com.example.addressbook.service;

import java.util.List;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;

public interface IAddressBookService {


	List<AddressBook> getData();
	AddressBook getById(int contactid);
	AddressBook addData(AddressBookDTO addressBookDto);
	AddressBook updateData(int contactid, AddressBookDTO addressBookDto);
	void deleteData(int id);
}
