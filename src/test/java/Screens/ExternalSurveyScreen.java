package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExternalSurveyScreen {

	
	public WebDriver driver;
	
	
	public ExternalSurveyScreen(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Xpaths for External Survey Screen
	
	@FindBy(xpath = "//i[@class='logo-image']")
	WebElement SAdminlogo;
	
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement SAdminlink;
	
	@FindBy(xpath = "//a[@href='/admin/utils']")
	WebElement SAdminUtil;
	
	@FindBy(xpath = "//span[normalize-space()='Add Prospect']")
	WebElement SAdminAddProspect;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement SAdminAddText;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Add']")
	WebElement SAdminAddSurvey;
	
	@FindBy(xpath = "//mat-row[15]//mat-cell[4]//button[1]//span[1]")
	WebElement SAdminStartSurvey;
	
	// Survey Questions
	
	@FindBy(xpath = "//button[contains(text(),'Reducing debt')]")
	WebElement QuestionE1;
	
	@FindBy(xpath = "//button[contains(text(),'18 - 29')]")
	WebElement QuestionE2;
	
	
	@FindBy(xpath = "//button[contains(text(),'Less than $35,000')]")
	WebElement QuestionE3;
	
	@FindBy(xpath = "//button[contains(text(),'Less than $50,000')]")
	WebElement QuestionE4;
	
	@FindBy(xpath = "//body/everyincome[1]/survey-form[1]/main[1]/div[1]/div[5]/ul[1]/li[1]/ei-field-loader[1]/ei-field[1]/div[1]/div[1]/ei-radio[1]/div[1]/button[1]")
	WebElement QuestionE5;
	
	@FindBy(xpath = "//button[contains(text(),\"Less than 1 month's income\")]")
	WebElement QuestionE6;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement QuestionE7;
	
	@FindBy(xpath = "//button[contains(text(),'Less than 630')]")
	WebElement QuestionE8;
	
	@FindBy(xpath = "//button[contains(text(),'Financial Coach/Advisor')]")
	WebElement QuestionE9;
	
	@FindBy(xpath = "//button[contains(text(),'Not confident at all')]")
	WebElement QuestionE10;
	
	@FindBy(xpath = "//button[contains(text(),'Very pessimistic')]")
	WebElement QuestionE11;
	
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement SAdminSubmit;
	
	@FindBy(xpath = "//mat-row[15]//mat-cell[5]//button[1]//span[1]")
	WebElement SAdminViewAnalytics;
	
	@FindBy(xpath = "//p[contains(text(),'Your response has been submitted. Thank you for yo')]")
	WebElement SAdminSurveycomplete;
	
	@FindBy(css = "body:nth-child(2) everyincome.dialog-anchor.index-loader:nth-child(1) survey-analytics.ng-star-inserted:nth-child(2) main:nth-child(2) > p.ng-star-inserted:nth-child(2)")
	WebElement SAdminGetAnalytics;
	
	@FindBy(xpath = "//p[@class='ng-star-inserted']")
	WebElement SASurveystartcheck;
	
	
	
	
	
	
	
	
	
	
	
	
	// Methods for the Xpaths
	
	public void SAdminlogoBtn() throws InterruptedException
	{
		SAdminlogo.click();
		Thread.sleep(3000);
	}
	
	
	public void SAdminlinkBtn() throws InterruptedException
	{
		SAdminlink.click();
		Thread.sleep(3000);
	}
	
	public void SAdminUtilBtn() throws InterruptedException
	{
		SAdminUtil.click();
		Thread.sleep(3000);
	}
	
	public void SAdminAddProspectBtn() throws InterruptedException
	{
		SAdminAddProspect.click();
		Thread.sleep(3000);
	}
	
	public void SAdminAddTextBtn()
	{
		SAdminAddText.click();
	}
	
	public void SAdminAddTextField(String PropectName) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(SAdminAddText).click().sendKeys(PropectName).perform();
		Thread.sleep(3000);
	}
	
	
	
	public void SAdminAddSurveyBtn()
	{
		SAdminAddSurvey.click();
	}
	
	
	public void SAdminStartSurveyBtn() throws InterruptedException
	{
		
		SAdminStartSurvey.click();
		Thread.sleep(6000);	
		}
	
	// Methods for Survey
	
	public void QuestionE1btn() 
	{
		QuestionE1.click();	
		
	}
		
	
	public void QuestionE2Btn() 
	{
		
		QuestionE2.click();
		
	}
	
	public void QuestionE3btn() 
	{
		QuestionE3.click();
		
	}
	
	public void QuestionE4btn() 
	{
		QuestionE4.click();
		
	}
	
	public void QuestionE5btn() 
	{
		QuestionE5.click();
		
	}
	
	public void QuestionE6btn() 
	{
		QuestionE6.click();
		
	}
	
	public void QuestionE7btn() 
	{
		QuestionE7.click();
		
	}
	
	public void QuestionE8btn() 
	{
		QuestionE8.click();
		
	}
	
	public void QuestionE9btn() 
	{
		QuestionE9.click();
		
	}
	
	public void QuestionE10btn() 
	{
		QuestionE10.click();
		
	}
	
	public void QuestionE11btn() throws InterruptedException
	{
		QuestionE11.click();
		Thread.sleep(5000);
		
	}
	
	public void SAdminSubmitBtn() throws InterruptedException
	{
		SAdminSubmit.click();
		Thread.sleep(4000);
	}
	
	
	public void SAdminViewAnalyticsBtn() throws InterruptedException
	{
		SAdminViewAnalytics.click();
		Thread.sleep(5000);
	}
	
	
	public String SAdminGetAnalytics()
	{
		
		return SAdminGetAnalytics.getText();
	}
	
	
	public String SAdminSurveycomplete()
	{
		return SAdminSurveycomplete.getText();
	}
	
	
	public String SASurveystartcheckBtn()
	{
		return SASurveystartcheck.getText();
	}
	
	
	
	
	
	
}
