package aiml.restapi.contact_api.contact_api.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import java.util.ArrayList;

import aiml.restapi.contact_api.contact_api.demo.model.Contact;
import aiml.restapi.contact_api.contact_api.demo.service.Operations;
@CrossOrigin("*")
@RestController
public class ContactController {
	@Autowired
	Operations op;
	
	@PostMapping("/add/contact")
	public boolean addContact(@RequestBody Contact c) {
		return op.addContact(c); 
	}
	
	@GetMapping("/get/contact/{mobileNumber}")
	public Contact getContactByMobile(@PathVariable String mobileNumber) {
		return op.getContactByMobile(mobileNumber);
	}
	@PutMapping("/put/contact/{mobileNumber}")
	public Contact updateContact(@PathVariable String mobileNumber, @RequestBody Contact updatedContact) {
	    return op.updateContact(mobileNumber, updatedContact.getName());
	}

	@GetMapping("/get/all/contacts")
	public List<Contact> getAllContacts(){
		return  op.getAllContacts();
	}
	
	@DeleteMapping("/delete/{mobileNumber}")
	public void deleteContact(@PathVariable String mobileNumber) {
	    op.deleteContact(mobileNumber);
	}
	
	
	}
	
	
