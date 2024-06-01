/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	May 30th, 2024
 *************************/


package Contact;

import java.util.concurrent.atomic.AtomicInteger;

public class Contact {
    private final String contactID;
    
    private final static AtomicInteger initializeContactID  = new AtomicInteger();
    private final static byte FIRST_NAME_LENGTH = 10;
    private final static byte LAST_NAME_LENGTH = 10;
    private final static byte ADDRESS_LENGTH = 30;
    private final static byte PHONE_NUMBER_LENGTH = 10;

    private String firstName = "DEFAULT";
    private String lastName = "DEFAULT";
    private String phoneNumber = "DEFAULT";
    private String address = "DEFAULT";
    
    /////////
    // initializes and creates contactID upon creation of a contact object
    /////////
    public Contact(String firstName, String lastName, String phoneNumber, String address) {
    	this.contactID = String.valueOf(initializeContactID.getAndIncrement());
    	
        /*initializeContactID = UUID.randomUUID().toString();
        contactID = initializeContactID.substring(0,10);*/
        
        if (firstName == null || firstName.length() > FIRST_NAME_LENGTH) {
            throw new IllegalArgumentException("First name can not be left blank.");
        }
        else {
        	this.firstName = firstName;
        }
        
        if (lastName == null || lastName.length() > LAST_NAME_LENGTH) {
            throw new IllegalArgumentException("Last name can not be left blank.");
        }
        else {
        	this.lastName = lastName;
        }
        
        if (address == null || address.length() > ADDRESS_LENGTH) {
            throw new IllegalArgumentException("Address can not be left blank and can only be " + ADDRESS_LENGTH + " characters long.");
        }
        else {
        	this.address = address;
        }
        
        if (phoneNumber == null || phoneNumber.length() > PHONE_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Phone number can not be left blank and can only be " + PHONE_NUMBER_LENGTH + " characters long.");
        }
        else {
        	this.phoneNumber = phoneNumber;
        }
    }

    /////////
    // initializes getters for class
    /////////
    public String getContactID() {
        return this.contactID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    /////////
    // initializes setters for class, while also catching incorrect arguments 
    /////////
    public void setFirstName (String firstName) {
        if (firstName == null || firstName.length() > FIRST_NAME_LENGTH) {
            throw new IllegalArgumentException("First name can not be left blank and can only be " + FIRST_NAME_LENGTH + " characters long.");
        }
        
        this.firstName = firstName;
        
    }

    public void setLastName (String lastName) {
    	if (lastName == null || lastName.length() > LAST_NAME_LENGTH) {
            throw new IllegalArgumentException("Last name can not be left blank and can only be " + LAST_NAME_LENGTH + " characters long.");
        }
        
        this.lastName = lastName;
    }

    public void setAddress (String address) {
    	if (address == null || address.length() > ADDRESS_LENGTH) {
            throw new IllegalArgumentException("Address can not be left blank and can only be " + ADDRESS_LENGTH + " characters long.");
        }
        
        this.address = address;
    }

    public void setPhoneNumber (String phoneNumber) {
    	if (phoneNumber == null || phoneNumber.length() > PHONE_NUMBER_LENGTH) {
            throw new IllegalArgumentException("Phone number can not be left blank and can only be " + PHONE_NUMBER_LENGTH + " characters long.");
        }
    	
    	this.phoneNumber = phoneNumber;
    }
  }