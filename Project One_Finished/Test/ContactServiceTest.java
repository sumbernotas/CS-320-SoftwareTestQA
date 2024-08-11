/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/

package Test;

import Contact.ContactService;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;


public class ContactServiceTest {

    @Test
    public void updateFirstNameTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
        contact.updateFirstName(tempID, "Jill");
        assertTrue(contact.findContact(tempID).getFirstName().equals("Jill"));
    }

    @Test
    public void updateLastNameTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
        contact.updateLastName(tempID, "Smith");
        assertTrue(contact.findContact(tempID).getLastName().equals("Smith"));
    }

    @Test
    public void updateAddressTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
        contact.updateAddress(tempID, "45 Test Rd, City, State, 15210");
        assertTrue(contact.findContact(tempID).getAddress().equals("45 Test Rd, City, State, 15210"));
    }

    @Test
    public void updatePhoneNumberTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
        contact.updatePhoneNumber(tempID, "2255555555");
        assertTrue(contact.findContact(tempID).getPhoneNumber().equals("2255555555"));
    }
    
    @Test
    public void addContactTEST() {
    	ContactService contact = new ContactService();
    	String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
    	assertNotNull(contact.findContact(tempID));
    }
    
    @Test
	public void deleteContactTest() {
    	ContactService contact = new ContactService();
    	String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, City, State, 15210");
		contact.deleteContact(tempID);
		assertNull(contact.findContact(tempID));
	}
}

