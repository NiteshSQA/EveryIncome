package Testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CustomContentScreen;
import Screens.Loginscreen;

public class CC_MemberOfAssetManagerCheck extends BaseClass{

	
	public Loginscreen login;
	public CustomContentScreen MemberOfAssestManagerCheck;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void MemberOfAssetManager()
	{
		login= new Loginscreen(driver);
		MemberOfAssestManagerCheck = new CustomContentScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
			
		}
	}
	
	@Test
	public void CC_MemberOfAssetManagerCheckFunction() throws InterruptedException, AWTException
	{
		
    // Login code
	login.username(Credentials.get(8).get(1).toString());
				
				
	login.password(Credentials.get(9).get(1).toString());
				
    login.login();
    
    
    
    
    
    
    try {
    	
    	MemberOfAssestManagerCheck.CustomContentCheckBtn();
    	MemberOfAssestManagerCheck.CustomContentUrlBtn();
    	System.out.println("The Tab is present under Member of Professional");
    	System.out.println("Click event is working correctly");
    	
    	
		
	} catch (Exception e) {
		System.out.println("The Tab is not present under Member of Professional");
		
	}
    
    
    
}
}
