package com.example.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;

@Service
public class AddressBookService implements IAddressBookService{


	public List<AddressBook> list = new ArrayList<AddressBook>();
	
	@Override
	public List<AddressBook> getData() {

		return list;
	}

	@Override
	public AddressBook getById(int id) {
		return list.get(id - 1);
	}

	@Override
	public AddressBook addData(AddressBookDTO addressBookDto) {
		int id= list.size();
		id=+1;
		AddressBook ad= new AddressBook(id,addressBookDto);
		list.add(ad);
		return ad;
	}

	@Override
	public AddressBook updateData(int contactid, AddressBookDTO addressBookDto) {
		AddressBook ad= list.get(contactid-1);
		ad.setAddress(addressBookDto.getAddress());
		ad.setFirstName(addressBookDto.getFirstName());
		ad.setPhoneNumber(addressBookDto.getPhoneNumber());
		list.set(contactid-1, ad);
		return ad;
	}

	@Override
	public void deleteData(int id) {

		list.remove(id-1);
	}


}
