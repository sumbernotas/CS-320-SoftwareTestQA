/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/
package Task;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {
	private final String taskID;
	
	private final static AtomicInteger initializeTaskID = new AtomicInteger();
	
	private final static byte NAME_LENGTH = 20;
	private final static byte DESCRIPTION_LENGTH = 50;
	
	private String taskName = "DEFAULT";
	private String taskDescription = "DEFAULT";
	
	////////////////
	// initializes and creates the Task constructor setting exceptions for name and description length. 
	// The task ID is also initialized and verified to only each 10 characters. 
	////////////////
	public Task(String taskName, String taskDescription) {
		this.taskID = String.valueOf(initializeTaskID.getAndIncrement());
		
		if (taskName == null || taskName.length() > NAME_LENGTH) {
			throw new IllegalArgumentException("Name can not be left blank and can only be " + NAME_LENGTH + " characters long.");
		} else {
			this.taskName = taskName;
		}
		
		if (taskDescription == null || taskDescription.length() > DESCRIPTION_LENGTH) {
			throw new IllegalArgumentException("Description can not be left blank and can only be " + DESCRIPTION_LENGTH + " characters long.");
		} else {
			this.taskDescription = taskDescription;
		}
	}
	
	////////////////
	// initializes getters for task class
	////////////////
	public String getTaskID() {
		return this.taskID;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public String getTaskDescription() {
		return this.taskDescription;
	}
	
	
	////////////////
	// initializes setters for task class
	////////////////
	public void setTaskName(String taskName) {
		if (taskName == null || taskName.length() > NAME_LENGTH) {
			throw new IllegalArgumentException("Name can not be left blank and can only be " + NAME_LENGTH + " characters long.");
		}
		
		this.taskName = taskName;
	}
	
	public void setTaskDescription(String taskDescription) {
		if (taskDescription == null || taskDescription.length() > DESCRIPTION_LENGTH) {
			throw new IllegalArgumentException("Description can not be left blank and can only be " + DESCRIPTION_LENGTH + " characters long.");
		}
		
		this.taskDescription = taskDescription;
	}
}
