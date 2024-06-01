/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	May 30th, 2024
 *************************/

package Test;

import Contact.ContactService;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ContactServiceTest {

    @Test
    public void updateFirstNameTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
        contact.updateFirstName(tempID, "Jill");
        assertTrue(contact.findContact(tempID).getFirstName().equals("Jill"));
    }

    @Test
    public void updateLastNameTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
        contact.updateLastName(tempID, "Smith");
        assertTrue(contact.findContact(tempID).getLastName().equals("Smith"));
    }

    @Test
    public void updateAddressTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
        contact.updateAddress(tempID, "450 Test Rd, Some City, State, 15210");
        assertTrue(contact.findContact(tempID).getAddress().equals("450 Test Rd, Some City, State, 15210"));
    }

    @Test
    public void updatePhoneNumberTEST() {
        ContactService contact = new ContactService();
        String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
        contact.updatePhoneNumber(tempID, "2255555555");
        assertTrue(contact.findContact(tempID).getPhoneNumber().equals("2255555555"));
    }
    
    /*@Test
    public void findContactinMap() {
    	ContactService contact = new ContactService();
    	String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
    	contact.findContactMap(tempID);
    }
    
    @Test
	public void addContactTEST() {
		ContactService contact = new ContactService();
		String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
		contact.displayContactList();
		assertNotNull(contact.findContact(tempID), "Contact was not added");
	}

    @Test
	public void deleteContactTEST() {
		ContactService contact = new ContactService();
		String tempID = contact.newContact("Jane", "Doe", "5555555555", "33 Test Rd, Some City, State, 15210");
		contact.deleteContact(tempID);
		ArrayList<Contact> contactListEMPTY = new ArrayList<Contact>();
		contact.displayContactList();
		assertEquals(contact.contactList, contactListEMPTY, "The contact was not deleted");
	}*/

    
}
