package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.AddGoalScreen;
import Screens.ContactUsScreen;
import Screens.Loginscreen;

public class US_21_ProfessionalUser extends BaseClass {

	
	public Loginscreen login;
	public ContactUsScreen  ContactUs;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void checkaddgoal()
	{
		login = new Loginscreen(driver);
		ContactUs = new ContactUsScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void AddContactUsDetailsFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(4).get(1).toString());
					
					
		login.password(Credentials.get(5).get(1).toString());
					
	    login.login();
	    Thread.sleep(4000);
	  
		// Contact Us Tab
	    
	    ContactUs.ContactProfileBtn();
	    Thread.sleep(4000);
	    Thread.sleep(4000);
	    
	    ContactUs.SpecialtiesTxt(Credentials.get(83).get(1).toString());
	    
	    ContactUs.StatesLicensedTxt(Credentials.get(84).get(1).toString());
	    
	//    ContactUs.AboutBioTxt();
	    
	    ContactUs.AboutBio1Txt(Credentials.get(85).get(1).toString());
	    	    
	    ContactUs.SaveChangesBtn();
	    
	    ContactUs.OkayBtn();
	}  
	
	
	@Test
	public void CheckContactUsDetailsFunctionality() throws InterruptedException
	{
		 // Login code for Direct member of Professional
		login.username(Credentials.get(10).get(1).toString());
					
					
		login.password(Credentials.get(11).get(1).toString());
					
	    login.login();
	    
	  
	    ContactUs.ContactUsPanelBtn();
	    
	    //Verification Code
	    
	    ContactUs.SpecialtiesCheckMethod();
	    
	    ContactUs.StatesLicensedInMethod();
	    
	    
	    ContactUs.AboutCheckMethod();
        
        // ContactUs.check2();
	
	}
}
