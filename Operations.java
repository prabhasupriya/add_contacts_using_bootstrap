package aiml.restapi.contact_api.contact_api.demo.service;

import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import aiml.restapi.contact_api.contact_api.demo.model.Contact;
@Service
public class Operations {
	HashMap<String, Contact> contactMap = new HashMap<>();
	// 1. addContact
    public boolean addContact(Contact contact) {
    	
        if(contactMap.containsKey(contact.getMobileNumber())){
                return false;
        }
        contactMap.put(contact.getMobileNumber(), contact);
        return true;
    }

    // 2. getContactByMobile
    public Contact getContactByMobile(String number) {
        if(contactMap.containsKey(number)){
            return contactMap.get(number);
        }
        return null;
    }
    
    // 3. getAllContacts
    public List<Contact> getAllContacts(){
    	return new ArrayList<Contact>(contactMap.values());
    }
    
    // 4. getContactsByType
    public List<Contact> getContactByType(String type){
    	ArrayList<Contact> lst = new ArrayList<>();
    	for(Contact c: contactMap.values()) {
    		if(c.getType().equalsIgnoreCase(type)) {
    			lst.add(c);
    		}
    	}
    	return lst;
    }
    
    // 5. updateNameByNumber
    public Contact updateContact(String number, String name) {
        Contact c = null;
        if(contactMap.containsKey(number)){
            c = contactMap.get(number);
            c.setName(name);
        }
        return c;
    }
    
    // 6. deleteNumber
    public void deleteContact(String number) {
        if(contactMap.containsKey(number)){
            contactMap.remove(number);
            System.out.println("Deleted contact: " + number);
        }
        else{
            System.out.println("Contact not found");
        }
    }
    //7 return by name 
    public List<Contact> getcontactbyname(String name){
    	List<Contact> list1 = new ArrayList<>();
    	for(Contact c : contactMap.values()) {
    	if(c.getName().equals((name))) {
    			list1.add(c);	
    	}
    	}
    	return list1;
    	
    }
    //8 search by any key
    public List<Contact> searchcontactbykey(String s){
    	List<Contact> li = new ArrayList<>();
    	for(Contact v : contactMap.values()) {
    		if(v.getEmail().equalsIgnoreCase(s) || v.getMobileNumber().equalsIgnoreCase(s) || v.getName().equalsIgnoreCase(s) || v.getType().equalsIgnoreCase(s)) {
    			li.add(v);
    		}
    	}
    	return li;
    }
    
    
}
