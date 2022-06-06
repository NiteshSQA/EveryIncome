package Testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CustomContentScreen;
import Screens.Loginscreen;

public class CC_BusinessCheck extends BaseClass{

	
	public Loginscreen login;
	public CustomContentScreen BusinessCheck;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login= new Loginscreen(driver);
		BusinessCheck = new CustomContentScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
			
		}
	}
	
	@Test
	public void CC_BusinessCheckFunction() throws InterruptedException, AWTException
	{
		
    // Login code
	login.username(Credentials.get(6).get(1).toString());
				
				
	login.password(Credentials.get(7).get(1).toString());
				
    login.login();
    
    
    
    
    
    
    try {
    	
    	BusinessCheck.CustomContentCheckBtn();
    	BusinessCheck.CustomContentUrlBtn();
    	System.out.println("The Tab is present under Business");
    	System.out.println("Click event is working correctly");
    	
    	
		
	} catch (Exception e) {
		System.out.println("The Tab is not present under Business");
		
	}
    
    
    
}

}
