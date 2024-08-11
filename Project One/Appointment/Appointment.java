/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/

package Appointment;

import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDate;

public class Appointment {
	private final String aptID;
	
	private final static AtomicInteger initializeAptID = new AtomicInteger();
	
	private final static byte DESCRIPTION_LENGTH = 50;
	
	private String aptDescription = "DEFAULT";
	
	private LocalDate aptDate;
		
	////////////////
	// initializes and creates the Appointment constructor setting exceptions for date and the description length. 
	// The appointment ID is also initialized and verified to only each having 10 characters. 
	////////////////
	public Appointment(LocalDate aptDate, String aptDescription) {
		this.aptID = String.valueOf(initializeAptID.getAndIncrement());
		
		if (aptDate == null || aptDate.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Date cannot be before today.");
		} else {
			this.aptDate = aptDate;
		}
		
		if (aptDescription == null || aptDescription.length() > DESCRIPTION_LENGTH) {
			throw new IllegalArgumentException("Description can not be left blank and can only be " + DESCRIPTION_LENGTH + " characters long");
		} else {
			this.aptDescription = aptDescription;
		}
	}
	
	////////////////
	// initializes getters for Appointment class
	////////////////
	public String getAptID() {
		return this.aptID;
	}
	
	public String getAptDescription() {
		return this.aptDescription;
	}
	
	public LocalDate getAptDate() {
		return this.aptDate;
	}
	
	
	////////////////
	// initializes setters for Appointment class
	////////////////
	public void setAptDescription(String aptDescription) {
		if (aptDescription == null || aptDescription.length() > DESCRIPTION_LENGTH) {
			throw new IllegalArgumentException("Description can not be left blank and can only be " + DESCRIPTION_LENGTH + " characters long");
		}
		
		this.aptDescription = aptDescription;
	}
	
	public void setAptDate(LocalDate aptDate) {
		if (aptDate == null || aptDate.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Date cannot be before today.");
		} 
		
		this.aptDate = aptDate;
	}
}

