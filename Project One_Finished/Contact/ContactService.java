/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/

package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // initializes a hash map to store the contacts
    public Map<String, Contact> contactList = new HashMap<String, Contact>();

    // creates a new contact with default variables and a unique ID then adds it to the contact list while returning its unique id
    public String newContact(String firstName, String lastName, String phoneNumber, String address) {
        Contact contact = new Contact(firstName, lastName, phoneNumber, address);
        String contactID = contact.getContactID();
        contactList.put(contactID, contact);
        return contactID;
    }

    /////////
    // using the "findContact" function, these methods will search for a contact and update their information according to the argument and checking for null input
    /////////
    public void updateFirstName(String contactID, String firstName) {
    	if (firstName == null) {
			throw new IllegalArgumentException("First name can not be left blank");
		}
    	
        findContact(contactID).setFirstName(firstName);
    }

    public void updateLastName(String contactID, String lastName) {
    	if (lastName == null) {
			throw new IllegalArgumentException("Last name can not be left blank");
		}
    	
        findContact(contactID).setLastName(lastName);
    }

    public void updateAddress(String contactID, String address) {
    	if (address == null) {
			throw new IllegalArgumentException("Address can not be left blank");
		}
    	
        findContact(contactID).setAddress(address);
    }

    public void updatePhoneNumber(String contactID, String phoneNumber) {
    	if (phoneNumber == null) {
			throw new IllegalArgumentException("Phone number can not be left blank");
		}
    	
        findContact(contactID).setPhoneNumber(phoneNumber);
    }

    // uses the contactID to remove the Contact object from the list
    public void deleteContact(String contactID) {
        contactList.remove(contactID);
    }

    // finds a specific contact using its ID 
    public Contact findContact(String contactID) {
        return contactList.get(contactID);
    }
 
}
