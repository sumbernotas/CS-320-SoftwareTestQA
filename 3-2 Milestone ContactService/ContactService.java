/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	May 30th, 2024
 *************************/

package Contact;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactService {
    public ArrayList<Contact> contactList = new ArrayList<>();
    
    //public HashMap<String, Contact> contactListM = new HashMap<String, Contact>();

    // creates a new contact with default variables and a unique ID then adds it to the contact list while returning its unique id
    public String newContact(String firstName, String lastName, String phoneNumber, String address) {
        Contact contact = new Contact(firstName, lastName, phoneNumber, address);
        String contactID = contact.getContactID();
        contactList.add(contact);
        //contactListM.put(contactID, contact);
        return contactID;
    }


    // displays all contact information that is in the contact list
    public void displayContactList() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("\t Contact ID: " + contactList.get(i).getContactID());
			System.out.println("\t First Name: " + contactList.get(i).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(i).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(i).getPhoneNumber());
			System.out.println("\t Address: " + contactList.get(i).getAddress() + "\n");
        }
    }

    /////////
    // using the "findContact" function, these methods will search for a contact and update their information according to the argument 
    /////////
    public void updateFirstName(String contactID, String firstName) {
        findContact(contactID).setFirstName(firstName);
    }

    public void updateLastName(String contactID, String lastName) {
        findContact(contactID).setLastName(lastName);
    }

    public void updateAddress(String contactID, String address) {
        findContact(contactID).setAddress(address);
    }

    public void updatePhoneNumber(String contactID, String phoneNumber) {
        findContact(contactID).setPhoneNumber(phoneNumber);
    }

    // uses the contactID to remove the Contact object from the list
    public void deleteContact(String contactID) {
        contactList.remove(findContact(contactID));
    }

    // finds a specific contact using its ID 
    public Contact findContact(String contactID) {
        Contact contact = new Contact("DEFAULT", "DEFAULT", "DEFAULT", "DEFAULT");

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getContactID().equals(contactID)) {
                contact = contactList.get(i);
                return contact;
            }
            if (i == contactList.size() - 1) {
                System.out.println(contactID + " is not found");
                contact = null;
            }
        }
        
        return contact;
    }
    
    /*public Contact findContactMap(String contactID) {
    	return contactListM.get(contactID);
    }*/
}
