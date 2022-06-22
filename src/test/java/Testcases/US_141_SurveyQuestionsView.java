package Testcases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.BatchProcessScreen;
import Screens.Loginscreen;
import Screens.MemberandBusinessScreen;

public class US_141_SurveyQuestionsView extends BaseClass {

	private static final int[] WebElement = null;
	public Loginscreen login;
	public MemberandBusinessScreen  Surveyview;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login = new Loginscreen(driver);
	
		Surveyview = new MemberandBusinessScreen(driver);
	try {
		Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
	} catch (Exception e) {
		
	}
	
	}
	
	@Test
	public void US_141_SurveyQuestionsViewFunctionality() throws InterruptedException
	{
		// Login code
				login.username(Credentials.get(4).get(1).toString());
							
							
				login.password(Credentials.get(5).get(1).toString());
							
			    login.login();
			    
                // Member Tab
			    
	  
			   
			    Surveyview.MemberBtn();
			    
			    // Selecting the member to view Details
			    Surveyview.MemberNameBtn();
			      
			    WebElement a = driver.findElement(By.xpath("//body[1]/everyincome[1]/sponsor-management[1]/ei-side-bar[1]/div[2]/sponsor-member-details[1]/panel[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/ei-field-loader[1]/ei-field[1]/div[1]/div[1]/ei-checkbox[1]/div[1]"));
			       
			 
			    // Changing the Role of the Member to Admin
			    Surveyview.HamburgerBtn();
			    
			    
			    Surveyview.MakeAdminBtn();
			    
			    // Changing the Role of the Admin to Member
			    Surveyview.Hamburger2Btn();
			    			    		    
			    Surveyview.MakeMemberBtn();
			    			    
			    Surveyview.MyBusinessBtn();
			    
			    //Navigating to My business Tab
			    Surveyview.ProfessionalUserBtn();
			    
			    //Clicking on the Business
			    Surveyview.ProfessionalUserDMBtn();
			    
			    // Clicking on the DirectMember of the Business
			    Surveyview.BacktoBusinessBtn();
	}
}
