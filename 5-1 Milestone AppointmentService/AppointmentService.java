/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 3rd, 2024
 *************************/

package Appointment;

import java.time.LocalDate;
import java.util.HashMap;

public class AppointmentService {
	// initializes a hash map to store the appointments
	public HashMap<String, Appointment> aptList = new HashMap<String, Appointment>();
	
	
	// creates an appointment object and returns its aptID
	public String newAppointment(LocalDate aptDate, String aptDescription) {
		Appointment apt = new Appointment(aptDate, aptDescription);
		String aptID = apt.getAptID();
		aptList.put(aptID, apt);
		return aptID;
	}
	
	// deletes specified appointment from the appointment list (HashMap)
	public void deleteApt(String aptID) {
		aptList.remove(aptID);
	}
	
	// finds a specific appointment by its ID, if it is found then it is returned, if it is not found then null is returned
	public Appointment findApt(String aptID) {
		if (aptList.containsKey(aptID)) {
			return aptList.get(aptID);
		} else {
			return null;
		}
	}
}
