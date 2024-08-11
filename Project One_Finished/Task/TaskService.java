/*************************
 * Name: 	Summer Bernotas
 * Course: 	CS-320 Software Testing, Automation, and Quality Assurance
 * Date: 	June 12th, 2024
 *************************/

package Task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {	
	// initializes a hash map to store tasks
	public Map<String, Task> taskList = new HashMap<String, Task>();
	
	// creates a new Task object and returns its taskID
	public String newTask(String taskName, String taskDescription) {
		Task task = new Task(taskName, taskDescription);
		String taskID = task.getTaskID();
		taskList.put(taskID, task);
		return taskID;
	}
	
	
	// updates the tasks name and throwing an exception if assigned null
	public void updateTaskName(String taskID, String taskName) {
		if (taskName == null) {
			throw new IllegalArgumentException("Task name can not be left blank");
		}
		
		findTask(taskID).setTaskName(taskName);
	}
	
	
	// updates the tasks description and throwing an exception if assigned null
	public void updateTaskDescription(String taskID, String taskDescription) {
		
		if (taskDescription == null) {
			throw new IllegalArgumentException("Description can not be left blank");
		}
		
		findTask(taskID).setTaskDescription(taskDescription);
	}
	
	// deletes the specified task from the hash map
	public void deleteTask(String taskID) {
		taskList.remove(taskID);
	}
	
	
	// finds a specific task by its ID, if the task is found it is returned, if it is not found, null is returned
	public Task findTask(String taskID) {
		return taskList.get(taskID);
	}
}
