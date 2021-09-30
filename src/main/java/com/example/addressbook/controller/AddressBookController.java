package com.example.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressBook;
import com.example.addressbook.service.IAddressBookService;

@RestController
public class AddressBookController {

	@Autowired
	IAddressBookService service;

	@PostMapping("/adddata")
	public ResponseEntity<ResponseDTO> add(@RequestBody AddressBookDTO add) {
		AddressBook ad;
		ad = service.addData(add);
		ResponseDTO res = new ResponseDTO("Added", ad);
		return new ResponseEntity<ResponseDTO>(res, HttpStatus.OK);
	}

	@GetMapping("/getid/{id}")
	public ResponseEntity<ResponseDTO> getId(@RequestParam(value = "id") int id) {
		AddressBook ad;
		ad = service.getById(id);
		ResponseDTO res = new ResponseDTO("Added", ad);
		return new ResponseEntity<ResponseDTO>(res, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<ResponseDTO> getId() {
		List<AddressBook> ad;
		ad = service.getData();
		ResponseDTO res = new ResponseDTO("Added", ad);
		return new ResponseEntity<ResponseDTO>(res, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> update(@RequestParam(value = "id") int id, AddressBookDTO aDto) {
		AddressBook ad;
		ad = service.updateData(id, aDto);
		ResponseDTO res = new ResponseDTO("Updated", ad);
		return new ResponseEntity<ResponseDTO>(res, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDTO> deleteId(@RequestParam(value = "id") int id) {
		AddressBook ad = null;
		service.deleteData(id);
		ResponseDTO res = new ResponseDTO("Deleted", ad);
		return new ResponseEntity<ResponseDTO>(res, HttpStatus.OK);
	}

}
