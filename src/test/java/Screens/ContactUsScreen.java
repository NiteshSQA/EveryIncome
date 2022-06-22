package Screens;

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
	
	
	@FindBy(xpath = "//zz-text[@label='Specialties']//div[@class='ng-star-inserted']")
	WebElement Specialties;
	
	@FindBy(xpath = "//zz-text[@label='States Licensed']//input[@type='text']")
	WebElement StatesLicensed;
	
	@FindBy(xpath = "//body/everyincome[1]/sponsor-management[1]/ei-side-bar[1]/div[2]/sponsor-profile-mgr[1]/div[1]/panel[1]/div[2]/div[1]/form[1]/div[5]/zz-text[3]/label[1]/textarea[1]")
	WebElement AboutBio;
	
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
		  Thread.sleep(2000);
	  }
	
	public void AboutBioTxt(String AboutBioTxt) throws InterruptedException
	  {
		  
		AboutBio.clear();
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
	
	
	
}
