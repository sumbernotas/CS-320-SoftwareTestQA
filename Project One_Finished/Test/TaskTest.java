/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/

package Test;
import Task.Task;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTest {
	
	@Test
	public void taskNameLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Task name that is too long for argument", "Task Description");
		});
	}
	
	@Test
	public void taskDescriptionLengthTEST() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task Name", "Description that is too long for the required argument length amount");
		});
	}
	
	@Test
	public void taskIDLengthTEST() {
		Task task = new Task("Task Name", "Task description");
		String taskID = task.getTaskID();
		assertTrue(taskID.length() <= 10);
	}
	
	@Test
	public void taskNameNullTEST() {
		Task task = new Task("Task Name", "Task Description");
		task.setTaskName(" ");
		assertNotNull(task.getTaskName(), "Task name was null");
	}
	
	@Test
	public void taskDescriptionNullTEST() {
		Task task = new Task("Task Name", "Task Description");
		task.setTaskDescription(" ");
		assertNotNull(task.getTaskDescription(), "Task description was null");
	} 
	

}

