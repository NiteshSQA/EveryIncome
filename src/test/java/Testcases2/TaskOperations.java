package Testcases2;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.Loginscreen;
import Screens.TaskScreen;

public class TaskOperations extends BaseClass {
	

		public Loginscreen login;
		public TaskScreen  TaskEdit;
		static List<List<Object>> Credentials = null;
		
		@BeforeTest
		public void TaskOperation()
		{
			login = new Loginscreen(driver);
			TaskEdit = new TaskScreen(driver);
			
			try {
				Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
			} catch (Exception e) {
				
			}
		}
		@Test
		public void TaskOperationsFunctionality() throws InterruptedException
		{
			 // Login code
			login.username(Credentials.get(63).get(1).toString());
						
						
			login.password(Credentials.get(64).get(1).toString());
						
		    login.login();
		    
		    
		    TaskEdit.DashboardBtn();
		    //Task Edit
		    
		    TaskEdit.ShowMoreTaskBtn();
		    
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.EditTaskBtn();
		    
		    TaskEdit.TaskNameTxt(Credentials.get(80).get(1).toString());
		    
		    TaskEdit.TaskCalanderBtn();
		    
		    
		    TaskEdit.TaskDate7Btn();
		    
		    TaskEdit.TaskSaveBtn();
		    
		    // Task Rearrange
		    
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.RearrangeTaskBtn();
		    
		    TaskEdit.DownArrow1Btn();
		    
		    TaskEdit.UpArrow5Btn();
		    
		    TaskEdit.ReturnToListBtn();
		    
		    // Crossing A Task
		    
		    TaskEdit.CrossingUncrossingTaskBtn();
		    
		    TaskEdit.CrossingUncrossingTaskBtn();
		    
		    // Archive and Unarchive a Task
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    // Archive Task
		    
		    
		    TaskEdit.TaskArhiveBtn();
		    
		    TaskEdit.ArchivedBtn();
		    
		    
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    // Unarchive Task
		    
		    TaskEdit.UnarchiveBtn();
		    
		    
		    TaskEdit.DueSoonBtn();
		    
		    TaskEdit.NewestBtn();
		    
		    TaskEdit.MyOrderBtn();
		    
		    //Delete Task
		    
		    //Task1
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		    
		    //Task2
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		    
		    //Task3
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		    
		    //Task4
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		    
		    //Task5
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		    
		    //Task5
		    TaskEdit.TaskFHamburgerIconBtn();
		    
		    TaskEdit.DeleteTaskBtn();
		}
		
}
