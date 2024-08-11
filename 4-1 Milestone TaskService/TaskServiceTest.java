/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	May 29th, 2024
 *************************/

package Test;

import Task.TaskService;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TaskServiceTest {
	
	@Test
	public void updateTaskNameTEST() {
		TaskService task = new TaskService();
		String tempID = task.newTask("Task Name", "Task description");
		task.updateTaskName(tempID, "New Task Name");
		assertTrue(task.findTask(tempID).getTaskName().equals("New Task Name"));
	}
	
	@Test
	public void updateTaskDescriptionTEST() {
		TaskService task = new TaskService();
		String tempID = task.newTask("Task Name", "Task description");
		task.updateTaskDescription(tempID, "New Task Description");
		assertTrue(task.findTask(tempID).getTaskDescription().equals("New Task Description"));
	}
	
	@Test
	public void addTaskTEST() {
		TaskService task = new TaskService();
		String tempID = task.newTask("Task Name", "Task description");
		assertNotNull(task.findTask(tempID));
	}
	
	@Test
	public void deleteTaskTest() {
		TaskService task = new TaskService();
		String tempID = task.newTask("Task Name", "Task Description");
		task.deleteTask(tempID);
		assertNull(task.findTask(tempID));
	}
}
