/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/
package Test;
import Contact.Contact;

import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;


public class ContactTest {
    
	@Test
	public void firstNameLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("JaneJaneJane", "Doe", "5555555555", "33 St, City, State, Zip");
    	});
	}
	
	@Test
	public void lastNameLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("Jane", "DoeDoeDoeDoe", "5555555555", "33 St, City, State, Zip");
    	});
	}
	
	@Test
	public void phoneNumberLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("Jane", "Doe", "555555555555", "33 St, City, State, Zip");
    	});
	}
	
	@Test
	public void addressLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("Jane", "Doe", "5555555555", "33 Street name, some city, some state, Zip").getAddress();
    	});
	}
	
	
	@Test
	public void firstNameNullTEST() {
		Contact contact = new Contact("Jane", "Doe", "5555555555", "33 St, City, State, Zip");
		contact.setFirstName(" ");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}

	@Test
	public void lastNameNullTEST() {
		Contact contact = new Contact("Jane", "Doe", "5555555555", "33 St, City, State, Zip");
		contact.setLastName(" ");
		assertNotNull(contact.getLastName(), "LastName was null");
	}

	@Test
	public void addressNullTEST() {
		Contact contact = new Contact("Jane", "Doe", "5555555555", "33 St, City, State, Zip");
		contact.setAddress(" ");
		assertNotNull(contact.getAddress(), "Address was null");
	}

	@Test
	public void phoneNumberNullTEST() {
		Contact contact = new Contact("Jane", "Doe", "5555555555", "33 St, City, State, Zip");
		contact.setPhoneNumber(" ");
		assertNotNull(contact.getPhoneNumber(), "Phone number was null");
	}
}
