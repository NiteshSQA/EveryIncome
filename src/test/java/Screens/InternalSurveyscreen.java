package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalSurveyscreen {
	
	public  WebDriver driver;
	
	
	public InternalSurveyscreen(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath = "//i[@class='logo-image']")
	WebElement Sadminlogo;
	
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement Sadminlink;
	
	@FindBy(xpath = "//a[@href='/admin/user']")
	WebElement Sadminuserlink;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement Sadminuseremail;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	WebElement Sadminusersearch;
	
	@FindBy(xpath = "//zz-text[@label='Questions Answered']//input[@type='text']")
	WebElement Sadminnoofquestions;
	
	@FindBy(xpath = "//zz-text[@label='Last Modified']//input[@type='text']")
	WebElement Sadminlastmodify;
	

	@FindBy(xpath = "//textarea[@class='cdk-textarea-autosize']")
	WebElement Sadminanswer;
	
	
	// Xpath for internal survey attempt screen
	
	// Survey Popup
	
	@FindBy(xpath = "//span[contains(text(),'Open Questionnaire')]")
	WebElement Openquestionnaire;
	
	// Question1
	
	@FindBy(xpath = "//button[contains(text(),'Reducing debt')]")
	WebElement Question1;
	
	//Next button
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement Next;
	
	//Back button
	
	@FindBy(xpath = "//span[contains(text(),'Back')]")
	WebElement Back;
	
	//Finish Button
	@FindBy(xpath = "//span[contains(text(),'Finish')]")
	WebElement Finish;
		
	
	@FindBy(xpath = "//button[contains(text(),'18 - 29')]")
	WebElement Question2;
	
	
	@FindBy(xpath = "//button[contains(text(),'Less than $35,000')]")
	WebElement Question3;
	
	@FindBy(xpath = "//button[contains(text(),'Less than $50,000')]")
	WebElement Question4;
	
	@FindBy(xpath = "//button[contains(text(),'1')]")
	WebElement Question5;
	
	@FindBy(xpath = "//button[contains(text(),\"Less than 1 month's income\")]")
	WebElement Question6;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement Question7;
	
	@FindBy(xpath = "//button[contains(text(),'Less than 630')]")
	WebElement Question8;
	
	@FindBy(xpath = "//button[contains(text(),'Financial Coach/Advisor')]")
	WebElement Question9;
	
	@FindBy(xpath = "//button[contains(text(),'Not confident at all')]")
	WebElement Question10;
	
	@FindBy(xpath = "//button[contains(text(),'Very pessimistic')]")
	WebElement Question11;
	
	// Dashboard Screen button for Professional user
	
	@FindBy(xpath = "//a[@id='dashboardTopNav']")
	WebElement Dashboard;
	
	
	
	
	
	
	public void Sadminlogobutton()
	{
		Sadminlogo.click();
		
	}
	
	public void Sadminlinkbutton()
	{
		Sadminlink.click();
		
	}
	
	public void Sadminuserlinkbutton()
	{
		Sadminuserlink.click();
		
	}
	
	public void Sadminuseremail(String useremail)
	{
		Sadminuseremail.sendKeys(useremail);
		
	}
	
	public void Sadminusersearchbutton()
	{
		Sadminusersearch.click();
		
	}
	
	public String noOfquestions()
	{
		
		 return Sadminnoofquestions.getAttribute("value");
	}
	
	public String lastModifiedDate()
	{
		
		return Sadminlastmodify.getAttribute("value");
	}
	
	public String totalAnswer()
	{
		
		return Sadminanswer.getAttribute("value");
	}
	
	// Methods for internal survey attempt screen
	
	public void OpenQuestionnaireBtn() throws InterruptedException
	{
		Openquestionnaire.click();
		Thread.sleep(4000);
	}
	
	
	public void Question1btn() throws InterruptedException
	{
		Question1.click();	
		Thread.sleep(2000);
	}
	
	public void NextBtn() throws InterruptedException
	{
		Next.click();
		Thread.sleep(2000);
	}
	
	public void BackBtn() throws InterruptedException
	{
		Back.click();
		Thread.sleep(2000);
	}
	
	public void FinishBtn() throws InterruptedException
	{
		Finish.click();
		Thread.sleep(2000);
	}
	
	
	
	public void Question2Btn() throws InterruptedException 
	{
		
		Question2.click();
		Thread.sleep(2000);
	}
	
	public void Question3btn() throws InterruptedException
	{
		Question3.click();
		Thread.sleep(2000);
	}
	
	public void Question4btn() throws InterruptedException
	{
		Question4.click();
		Thread.sleep(2000);
	}
	
	public void Question5btn() throws InterruptedException
	{
		Question5.click();
		Thread.sleep(2000);
	}
	
	public void Question6btn() throws InterruptedException
	{
		Question6.click();
		Thread.sleep(2000);
		
	}
	
	public void Question7btn() throws InterruptedException
	{
		Question7.click();
		Thread.sleep(2000);
	}
	
	public void Question8btn() throws InterruptedException
	{
		Question8.click();
		Thread.sleep(2000);
	}
	
	public void Question9btn() throws InterruptedException
	{
		Question9.click();
		Thread.sleep(2000);
	}
	
	public void Question10btn() throws InterruptedException
	{
		Question10.click();
		Thread.sleep(2000);
	}
	
	public void Question11btn() throws InterruptedException
	{
		Question11.click();
		Thread.sleep(2000);
	}
	
	public void Dashboardbtn() throws InterruptedException
	{
		Dashboard.click();
		Thread.sleep(4000);
	}

}

