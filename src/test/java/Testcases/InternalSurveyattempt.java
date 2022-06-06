package Testcases;

import org.testng.annotations.Test;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.InternalSurveyscreen;
import Screens.Loginscreen;

public class InternalSurveyattempt extends BaseClass{
 
	public Loginscreen login;
	public InternalSurveyscreen SAttempt;
	static List<List<Object>> Credential = null; 
	
	@BeforeTest
	public void check1() throws InterruptedException
	{
		
		login=new Loginscreen(driver);  // yaha par saare screens ko initialization karana hota
		SAttempt=new InternalSurveyscreen(driver);
		
		try {
			Credential= readspreadsheet.readSpreadSheet("Credentials"); 
			
		} catch (Exception e) {
			
			
			
		}
		
		
	}
	
	@Test
	private void surveyAttempt() throws InterruptedException {
		
		// Login code
		login.username(Credential.get(0).get(1).toString());
		
		
		login.password(Credential.get(1).get(1).toString());
		
		login.login();
		
		// Code to used only for User Role = Professional
		SAttempt.Dashboardbtn();
		
		// Click OpenQuestionaire button
		SAttempt.OpenQuestionnaireBtn();
		
		// Question attempt
		SAttempt.Question1btn();
		// Next button
		SAttempt.NextBtn();
		
		SAttempt.Question2Btn();
		SAttempt.NextBtn();
		
		SAttempt.Question3btn();
		SAttempt.NextBtn();
					
		SAttempt.Question4btn();
		SAttempt.NextBtn();
		
		SAttempt.Question5btn();
		SAttempt.NextBtn();
		
		SAttempt.Question6btn();
		SAttempt.NextBtn();
		
		SAttempt.Question7btn();
		SAttempt.NextBtn();
		
		SAttempt.Question8btn();
		SAttempt.NextBtn();
		
		SAttempt.Question9btn();
		SAttempt.NextBtn();
		
		SAttempt.Question10btn();
		SAttempt.NextBtn();
		// Back button
		SAttempt.BackBtn();
		SAttempt.NextBtn();
		
		SAttempt.Question11btn();
		
		// Finish button
		SAttempt.FinishBtn();
		
		
		
	}
	
}
