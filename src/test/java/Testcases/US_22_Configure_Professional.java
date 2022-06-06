package Testcases;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.Loginscreen;
import Screens.MymemberandConfigureScreen;

public class US_22_Configure_Professional extends BaseClass {

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
	public void US_22_Configure_ProfessionalFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(4).get(1).toString());
					
					
		login.password(Credentials.get(5).get(1).toString());
					
	    login.login();
	    
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
