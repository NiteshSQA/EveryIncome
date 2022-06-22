package Testcases2;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.AddGoalScreen;
import Screens.BatchProcessScreen;
import Screens.Loginscreen;

public class AddGoal extends BaseClass{
	
	public Loginscreen login;
	public AddGoalScreen  AddGoal;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void checkaddgoal()
	{
		login = new Loginscreen(driver);
		AddGoal = new AddGoalScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void AddGoalFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(63).get(1).toString());
					
					
		login.password(Credentials.get(64).get(1).toString());
					
	    login.login();
	    
	    
		// Add Goal
	    
	    // My Money Tab
	    AddGoal.MyMoneyBtn();
	    
	    // Goals Tab
	    
	    AddGoal.GoalsBtn();
	    
	    // Switching to new frame
	    
	    driver.switchTo().frame(0);
		
		Thread.sleep(8000);
	    
	    //Get Started Button
	    
	    AddGoal.GetStartedBtn();

	    // Purchases Option
	    AddGoal.PurchasesBtn();
	    
	    // New Car Button
	    AddGoal.NewCarBtn();
	  
	    
	    // Goal Name
	    AddGoal.NameYourGoalTxt(Credentials.get(65).get(1).toString());
	    
	    // Goal Amount
	    AddGoal.GoalAmountTxt(Credentials.get(66).get(1).toString());
	    
	    
	    // Radio Button
	    
	    AddGoal.DateRadioBtn();
	    
	    // Adding Date
	    
	    AddGoal.TargetDateTxt(Credentials.get(67).get(1).toString());
	    
	    // Next Button Click
	    
	    AddGoal.NextBtn();
	    
	    // Second Screen Allocate Amount Textbox
	    
	    AddGoal.AllocateAmountTxt(Credentials.get(68).get(1).toString());
	    
	    // Next Button click
	    AddGoal.NextBtn();
	    
	    
	    //Save funding
	    AddGoal.SaveFundingBtn();
	    
	    //Start Goal
	    AddGoal.StartGoalBtn();
	}
}


