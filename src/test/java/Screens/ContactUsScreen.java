package Screens;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsScreen {

	
public WebDriver driver;
	
	
	public ContactUsScreen(WebDriver driver)
	{
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	}
	
	
	//Xpath for Contact US Profile
	
	@FindBy(xpath = "//span[contains(text(),'Contact Profile')]")
	WebElement ContactProfile;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement Specialties;
	
	@FindBy(xpath = "//zz-text[@label='States Licensed']//input[@type='text']")
	WebElement StatesLicensed;
	
	@FindBy(xpath = "//textarea[@class='zz-form-control-input ng-untouched ng-pristine ng-valid ng-star-inserted']")
	WebElement AboutBio;
	
	@FindBy (css = ".zz-form-control-input.ng-valid.ng-star-inserted.ng-touched.ng-pristine")
	WebElement AboutBio1;
	
	
	@FindBy(xpath = "//span[contains(text(),'Save changes')]")
	WebElement SaveChanges;
	
	@FindBy(xpath = "//span[contains(text(),'Ok')]")
	WebElement Okay;
	
	@FindBy(xpath = "//b[normalize-space()='Specialties']")
	WebElement SpecialtiesCheck;
	
	@FindBy(xpath = "//b[normalize-space()='States Licensed In']")
	WebElement StatesLicensedInCheck;
	
	@FindBy(xpath = "//b[normalize-space()='About']")
	WebElement AboutCheck;
	
	
	// Check Contact Us Detail
	
	@FindBy(xpath = "//a[@id='contactUsTopNav']")
	WebElement ContactUsPanel;
	
	//Methods for Contact Profile
	
	public void ContactProfileBtn() throws InterruptedException 
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(ContactProfile).click().build().perform();
		
		Thread.sleep(3000);
	}
	
	public void SpecialtiesTxt(String SpecialtiesTxt) throws InterruptedException
	  {
		  
		Specialties.clear();
		Specialties.sendKeys(SpecialtiesTxt);
		  Thread.sleep(2000);
	  }
	
	public void StatesLicensedTxt(String StatesLicensedTxt) throws InterruptedException
	  {
		  
		StatesLicensed.clear();
		StatesLicensed.sendKeys(StatesLicensedTxt);
		  Thread.sleep(4000);
	  }
	
	public void AboutBioTxt() throws InterruptedException
	  {
		  
		AboutBio.clear();
		
		  Thread.sleep(2000);
	  }
	
	public void AboutBio1Txt(String AboutBioTxt) throws InterruptedException
	  {
		  
		
		AboutBio.sendKeys(AboutBioTxt);
		  Thread.sleep(2000);
	  }
	
	
	public void SaveChangesBtn() throws InterruptedException 
	{
		SaveChanges.click();
		Thread.sleep(4000);
	}
	
	public void OkayBtn() throws InterruptedException 
	{
		Okay.click();
		Thread.sleep(4000);
	}
	
	// Contact US Panel
	
	public void ContactUsPanelBtn() throws InterruptedException 
	{
		ContactUsPanel.click();
		Thread.sleep(4000);
	}
	
	
	public void SpecialtiesCheckMethod() throws InterruptedException 
	{
		
          try {
			
			String Specialties = SpecialtiesCheck.getText();
			
			
			if(Specialties.equals("Specialties"))
			{
				
				System.out.println("Specialties section is appearing");
			}
			
			else
			{
				System.out.println("Specialties section is not appearing correctly");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("Specialties section is not appearing");
		}
		
	}
	
	public void StatesLicensedInMethod() throws InterruptedException 
	{
             try {
			
			String StatesLicensedIn = StatesLicensedInCheck.getText();
			
			if(StatesLicensedIn.equals("States Licensed In"))
			{
				
				System.out.println("States Licensed In Text is appearing");
			}
			
			else
			{
				System.out.println("States Licensed In Text is not appearing correctly");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("States Licensed In Text is not appearing");
		}
         
       
		
	}
	
	public void AboutCheckMethod() throws InterruptedException 
	{
             try {
			
			String StatesLicensedIn = AboutCheck.getText();
			
			if(StatesLicensedIn.equals("States Licensed In"))
			{
				
				System.out.println("States Licensed In Text is appearing");
			}
			
			else
			{
				System.out.println("States Licensed In Text is not appearing correctly");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("States Licensed In Text is not appearing");
		}
         
       
		
	}
	

	/*
	public void check2()
	{
		
	
				
		
		try {
			
			boolean abc = AboutCheck.isDisplayed();
			if(abc==true)
			{
				System.out.println("I can see it");
				
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			
			
				System.out.println("I cannot");
			
				
		}
		
		
			
			
	}
	*/
	
}
