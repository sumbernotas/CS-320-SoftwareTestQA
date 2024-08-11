/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 5th, 2024
 *************************/

package Test;
import java.time.LocalDate;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import Appointment.Appointment;


public class AppointmentTest {
	
	@Test
	public void aptDescriptionLengthTEST() {
		LocalDate aptDate = LocalDate.of(2024, 7, 1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(aptDate, "Description that is too long for the required argument length amount");
		});
	}
	
	@Test
	public void aptDescriptionNullTEST() {
		LocalDate aptDate = LocalDate.of(2024, 7, 1);
		Appointment apt = new Appointment(aptDate, "Appointment description");
		apt.setAptDescription(" ");
		assertNotNull(apt.getAptDescription(), "Appointment description was null");
	} 	
	
	@Test
	public void aptIDLengthTEST() {
		LocalDate aptDate = LocalDate.of(2024, 7, 1);
		Appointment apt = new Appointment(aptDate, "Appointment description");
		String aptID = apt.getAptID();
		assertTrue(aptID.length() <= 10);
	}
	
	
	@Test
	public void dateBeforeCurrentTEST() {
		LocalDate aptDate = LocalDate.of(2020, 7, 1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(aptDate, "Appointment Description");
		});
	}

}