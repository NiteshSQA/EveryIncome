package Testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.ExternalSurveyScreen;
import Screens.Loginscreen;

public class ExternalSurveyTest extends BaseClass{
	
	
	public Loginscreen login;
	public ExternalSurveyScreen SAE;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login= new Loginscreen(driver);
		SAE = new ExternalSurveyScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
			
		}
	}
	@Test
	public void ExternalSurvey() throws InterruptedException
	{
		
		// Login code
		login.username(Credentials.get(0).get(1).toString());
		
		
		login.password(Credentials.get(1).get(1).toString());
		
		login.login();
		
		// Navigation to Utilities Screen
		
		SAE.SAdminlogoBtn();
		
		SAE.SAdminlinkBtn();
		
		SAE.SAdminUtilBtn();
		
				
		//Adding The Prospect
		
		SAE.SAdminAddProspectBtn();
		
		SAE.SAdminAddTextField(Credentials.get(15).get(1).toString());
		
		
		SAE.SAdminAddSurveyBtn();
		
		
		// Attempting the survey
		
		SAE.SAdminStartSurveyBtn();
		
		// Tab Switch Code
		
        Set<String> handler = driver.getWindowHandles();
		
		
		Iterator<String> it=handler.iterator();
		
		String parentid = it.next();
					
		String childid = it.next();
	
		
		driver.switchTo().window(childid);
		
		
		String surveycheck = SAE.SASurveystartcheckBtn();
		System.out.println(surveycheck);
		
		
		
		// Survey Question
		SAE.QuestionE1btn();
		
		SAE.QuestionE2Btn();
		
		SAE.QuestionE3btn();
		
		SAE.QuestionE4btn();
		
		SAE.QuestionE5btn();
		
		SAE.QuestionE6btn();
		
		SAE.QuestionE7btn();
		
		SAE.QuestionE8btn();
		
		SAE.QuestionE9btn();
		
		SAE.QuestionE10btn();
		
		SAE.QuestionE11btn();
		
		// Clicking on the Submit Button
		
		SAE.SAdminSubmitBtn();
		
		// Get Survey Result
		
	    String SurveyComplete =	SAE.SAdminSurveycomplete();
	
	    System.out.println(SurveyComplete);
	    
	    
	    
	
	   //Tab Switch Code
	
	
	   driver.close();
	
	   driver.switchTo().window(parentid);
	
	   // Survey Analytics
	
	   SAE.SAdminViewAnalyticsBtn();
	
	   Set<String> handler1 = driver.getWindowHandles();
	
	// Tab Switch code
	   Iterator<String> it1=handler1.iterator();
	   String parentid2 = it1.next();
		
		
		String childid2 = it1.next();
	
		driver.switchTo().window(childid2);
		
		
		// Get Survey Analytics
		
	    String Analytics =SAE.SAdminGetAnalytics();	
	    System.out.println(Analytics);
	    
	    
			
			
	
		
		
		
		
		
	}

}
