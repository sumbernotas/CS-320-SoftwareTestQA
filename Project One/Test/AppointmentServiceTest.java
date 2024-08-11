/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 5th, 2024
 *************************/

package Test;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import Appointment.AppointmentService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AppointmentServiceTest {
	
	@Test
	public void addAptTEST() {
		AppointmentService apt = new AppointmentService();
		LocalDate aptDate = LocalDate.of(2024, 7, 1);
		String tempID = apt.newAppointment(aptDate, "Appointment Description");
		assertNotNull(apt.findApt(tempID));
	}
	
	@Test
	public void deleteAptTEST() {
		AppointmentService apt = new AppointmentService();
		LocalDate aptDate = LocalDate.of(2024, 7, 1);
		String tempID = apt.newAppointment(aptDate, "Appointment Description");
		apt.deleteApt(tempID);
		assertNull(apt.findApt(tempID));
	}
}

