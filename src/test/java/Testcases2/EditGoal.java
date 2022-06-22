package Testcases2;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.AddGoalScreen;
import Screens.Loginscreen;

public class EditGoal extends BaseClass {

	
	public Loginscreen login;
	public AddGoalScreen  EditGoal;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void checkEditGoal()
	{
		login = new Loginscreen(driver);
		EditGoal = new AddGoalScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void EditGoalFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(63).get(1).toString());
					
					
		login.password(Credentials.get(64).get(1).toString());
					
	    login.login();
	    
 
	    
		// Edit Goal
	    
	    // My Money Tab
	    EditGoal.MyMoneyBtn();
	    
	    // Goals Tab
	    
	    EditGoal.GoalsBtn();
	    
	    // Switching to new frame
	    
	    driver.switchTo().frame(0);
		
		Thread.sleep(8000);
		
		// Old Created Goal Card click
	    
		EditGoal.GoalCardBtn();
		
		// Edit Goal Button
		
		EditGoal.EditGoalBtn();
		
		// Goal Name
		EditGoal.GoalNameTxt(Credentials.get(69).get(1).toString());
		
		// Goal Amount
		EditGoal.GoalAmountEditTxt(Credentials.get(70).get(1).toString());
		
		// Goal Date
		EditGoal.GoalDateEditTxt(Credentials.get(71).get(1).toString());
		
		EditGoal.SaveGoalStateBtn();
		
		EditGoal.SaveGoalEditBtn();
		
		
		EditGoal.SaveGoalEditBtn();
		
		
		EditGoal.StartGoalBtn();
	/*	driver.findElement(By.xpath("//a[@class='saveGoalState button y-primary-button y-text-align-center']")).click();
		Thread.sleep(4000);
		
	driver.findElement(By.xpath("//a[@id='sfgSaveGoalEdit']")).click();
	
	
Thread.sleep(3000);

driver.findElement(By.xpath("//span[@id='saveBtnMedium']")).click();	

Thread.sleep(3000);

driver.findElement(By.xpath("//a[@id='saveGoalState']")).click();	
*/
}
	
}
