package Testcases;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.Loginscreen;
import Screens.MymemberandConfigureScreen;

public class US_22_Configure_Business extends BaseClass {

	public Loginscreen login;
	public MymemberandConfigureScreen Configure;
	static List<List<Object>> Credentials = null;
	
	
	@BeforeTest
	public void check1()
	{
		login = new Loginscreen(driver);
		Configure = new MymemberandConfigureScreen(driver);
		
		try {
			
			Credentials = readspreadsheet.readSpreadSheet("Credentials");
			
		} catch (Exception e) {
			
		}
		
	}
	
	@Test
	public void US_22_Configure_BusinessFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(6).get(1).toString());
					
					
		login.password(Credentials.get(7).get(1).toString());
					
	    login.login();
	    
	    // Profile Navigation
	    
	    Configure.AvatarBtn();
	    
	    Configure.BusinessnameBtn();
	    
	    // Configure Tab
	    
	    Configure.ConfigureBtn();
	    
	    Configure.ImageLogoBtn();
	    
	    // Image Popup
	    
	    Configure.ImageUrlTxt(Credentials.get(45).get(1).toString());
	    
	    
	    Configure.DoneBtn();
	    
	    // Primary Color Change
	    Configure.PrimaryColorBtn();
	    
	    Configure.PrimaryColorInputTxt(Credentials.get(46).get(1).toString());
	    
	    
	    Configure.MymemberBtn();
	    
	    // Accent Color Change
	    Configure.AccentColorBtn();
	    
	    Configure.AccentColorInputTxt(Credentials.get(47).get(1).toString());
	    
	    
	    
	    Configure.SaveBtn();
	    
	    
	    Configure.OkayBtn();
	    
	    
	    
	    
	    
		
		
	}
}
