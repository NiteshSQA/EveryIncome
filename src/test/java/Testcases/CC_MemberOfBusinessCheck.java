package Testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CustomContentScreen;
import Screens.Loginscreen;

public class CC_MemberOfBusinessCheck extends BaseClass{
	
	public Loginscreen login;
	public CustomContentScreen MemberOfBusinessCheck;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void MemberOfBusiness()
	{
		login= new Loginscreen(driver);
		MemberOfBusinessCheck = new CustomContentScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
			
		}
	}
	
	@Test
	public void CC_MemberOfBusinessCheckFunction() throws InterruptedException, AWTException
	{
		
    // Login code
	login.username(Credentials.get(12).get(1).toString());
				
				
	login.password(Credentials.get(13).get(1).toString());
				
    login.login();
    
    
    
    
    
    
    try {
    	
    	MemberOfBusinessCheck.CustomContentCheckBtn();
    	MemberOfBusinessCheck.CustomContentUrlBtn();
    	System.out.println("The Tab is present under Member of Business");
    	System.out.println("Click event is working correctly");
    	
    	
		
	} catch (Exception e) {
		System.out.println("The Tab is not present under Member of Business");
		
	}
    
    
    
}

}
