package Testcases;

import org.testng.annotations.Test;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CustomContentScreen;
import Screens.Loginscreen;

public class CustomContentDelete extends BaseClass {
	
	
	public Loginscreen login;
	public CustomContentScreen CustomContentDelete;
	static List<List<Object>> Credentials = null;
	
	
	@BeforeTest
	public void check1()
	{
		login = new Loginscreen(driver);
		CustomContentDelete = new CustomContentScreen(driver);
		
		try {
			
			Credentials = readspreadsheet.readSpreadSheet("Credentials");
			
		} catch (Exception e) {
			
		}
		
	}
	
	@Test
	public void CustomContentDeleteProcess() throws InterruptedException 
	{
		
		// Login code
		login.username(Credentials.get(4).get(1).toString());
					
					
		login.password(Credentials.get(5).get(1).toString());
					
	    login.login();
		
	 // Navigating to Custom Content Screen
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
	    // Content 1
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
      // Content 2
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
       // Content 3
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
	    
         //Content 4
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
         //Content 5
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
         
         //Content 6
	    
	    CustomContentDelete.ContentHamburgerBtn();
	    
	    CustomContentDelete.ContentDeleteBtn();
	    
	    CustomContentDelete.ContentDeleteFinalBtn();
	    
	    CustomContentDelete.MemberScreenBtn();
	    
	    CustomContentDelete.CustomContentlinkBtn();
	    
	    
	     
	    
		
	}
}
