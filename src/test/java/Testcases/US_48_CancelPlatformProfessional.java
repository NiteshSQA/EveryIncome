package Testcases;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CancelPlatformScreen;
import Screens.Loginscreen;
import Screens.TaskScreen;

public class US_48_CancelPlatformProfessional extends BaseClass{

	public Loginscreen login;
	public CancelPlatformScreen  Cancel;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void checkaddgoal()
	{
		login = new Loginscreen(driver);
		Cancel = new CancelPlatformScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
		}
	}
	
	@Test(priority = 1)
	public void CancelPlatformProfessionalFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(90).get(1).toString());
					
					
		login.password(Credentials.get(91).get(1).toString());
					
	    login.login();
	    
	    Cancel.BillingTabBtn();
	    
	    Cancel.CancelPlatformBtn();
	    
	    Cancel.DropdownBtn();
	    
	    Cancel.ReasonBoxTxt(Credentials.get(90).get(1).toString());
	
	    Cancel.CheckBoxBtn();
	    
	  //  Cancel.Dropdown2Btn();
	    
	    Cancel.CancelPlatform2Btn();
	    
	    Cancel.CancelCheckfunction();
	 
	}    
	 
	
	@Test(priority = 2)
	public void CancelPlatformBusinessFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(92).get(1).toString());
					
					
		login.password(Credentials.get(93).get(1).toString());
					
	    login.login();
	    
	    // Profile Tab
	    
	    Cancel.AvatarBtn();
	    
	    Cancel.ProfileBtn();
	    
	
	    
	    Cancel.CancelPlatformBtn();
	    
	    Cancel.DropdownBtn();
	    
	    Cancel.ReasonBoxTxt(Credentials.get(90).get(1).toString());
	
	    Cancel.CheckBoxBtn();
	    
	  //  Cancel.Dropdown2Btn();
	    
	    Cancel.CancelPlatform2Btn();
	    
	    Cancel.CancelCheckfunction();
	    
	}    
	
	
	@Test(priority = 1)
	public void CancelPlatformAssestManagerFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(88).get(1).toString());
					
					
		login.password(Credentials.get(89).get(1).toString());
					
	    login.login();
	    
	    // Profile Tab
	    
	    Cancel.AvatarBtn();
	    
	    Cancel.ProfileBtn();
	    
	    Cancel.BillingTabBtn();
	    
	    Cancel.CancelPlatformBtn();
	    
	    Cancel.DropdownBtn();
	    
	    Cancel.ReasonBoxTxt(Credentials.get(90).get(1).toString());
	
	    Cancel.CheckBoxBtn();
	    
	  //  Cancel.Dropdown2Btn();
	    
	    Cancel.CancelPlatform2Btn();
	    
	    Cancel.CancelCheckfunction();
	    
	}    
	
}
