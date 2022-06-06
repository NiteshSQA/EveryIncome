package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.InternalSurveyscreen;
import Screens.Loginscreen;

public class InternalsurveyCheck extends BaseClass {

	public Loginscreen login;
	public InternalSurveyscreen sadminuser;
	static List<List<Object>> Credential = null; 
	
	@BeforeTest
	public void check1() throws InterruptedException
	{
		
		login=new Loginscreen(driver);  // yaha par saare screens ko initialization karana hota
		sadminuser=new InternalSurveyscreen(driver);
		
		 
		
		try {
			Credential= readspreadsheet.readSpreadSheet("Credentials"); 
			
		} catch (Exception e) {
			
		}
		
		// Login Code
        login.username(Credential.get(0).get(1).toString());
		
		
		login.password(Credential.get(1).get(1).toString());
		
		login.login();
		
	}

	@Test
	public void checkQuestionnaire() throws InterruptedException
	{
		
		
		
		
		
		
		// Logo Click
		
		sadminuser.Sadminlogobutton();
		
		Thread.sleep(4000);
		
		sadminuser.Sadminlinkbutton();
		
		Thread.sleep(4000);
		
		sadminuser.Sadminuserlinkbutton();
		
		Thread.sleep(4000);
		
		sadminuser.Sadminuseremail(Credential.get(0).get(1).toString());
		
		sadminuser.Sadminusersearchbutton();

		
		Thread.sleep(7000);
		
		
		
	    // Code to Read the value from survey
		
	    String questionsattempted = sadminuser.noOfquestions();
		
		System.out.println("The number of questions attempted is :"+questionsattempted);
		
		String lastmodifieddate= sadminuser.lastModifiedDate();
		
      	System.out.println("The last modified date is :"+lastmodifieddate);
		
		
		String answers = sadminuser.totalAnswer();
		
		System.out.println("The attempted answers are: "+answers);
		
		Thread.sleep(3000);
		
		
				
		
		
	}
	
	
}
