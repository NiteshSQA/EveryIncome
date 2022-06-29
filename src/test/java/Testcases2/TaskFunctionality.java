package Testcases2;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.AddGoalScreen;
import Screens.Loginscreen;
import Screens.TaskScreen;

public class TaskFunctionality extends BaseClass {

	public Loginscreen login;
	public TaskScreen  Task;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void Taskadd()
	{
		login = new Loginscreen(driver);
		Task = new TaskScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void TaskFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(63).get(1).toString());
					
					
		login.password(Credentials.get(64).get(1).toString());
					
	    login.login();
	    
	    
	
	    
	    Task.DashboardBtn();
	    
	    Thread.sleep(2000);	  
	   // Task.PanelOpenBtn();
	    
	 // Add Task A
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(74).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate1Btn();
	    
	    Task.TaskSaveBtn();
	    
	 // Add Task B
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(75).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate2Btn();
	    
	    Task.TaskSaveBtn();
	    
	 // Add Task C
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(76).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate3Btn();
	    
	    Task.TaskSaveBtn();
	    
	 // Add Task D
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(77).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate4Btn();
	    
	    Task.TaskSaveBtn();
	    
	    
	    // Add Task E
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(78).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate5Btn();
	    
	    Task.TaskSaveBtn();
	    
	    // Add Task F
	    Task.AddTaskBtn();
	    
	    Task.TaskNameTxt(Credentials.get(79).get(1).toString());
	    
	    Task.TaskCalanderBtn();
	    
	    Task.TaskDate6Btn();
	    
	    Task.TaskSaveBtn();
	    
	    //Show more Task Button
	    
	    Task.ShowMoreTaskBtn();
	    
	  
	    
	    
	}
}
