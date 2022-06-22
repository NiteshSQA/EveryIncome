package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CancelPlatformScreen {

public WebDriver driver;
	
	
	public CancelPlatformScreen(WebDriver driver)
	{
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	}
	
	// Xpath for Cancel Platform
	
	@FindBy(xpath = "//span[contains(text(),'Billing')]")
	WebElement BillingTab;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel this platform')]")
	WebElement CancelPlatform;
	
	@FindBy(xpath = "//select[@class='zz-form-control-input ng-untouched ng-pristine ng-invalid']")
	WebElement Dropdown;
	
	@FindBy(xpath = "//textarea[@class='zz-form-control-input ng-untouched ng-pristine ng-valid ng-star-inserted']")
	WebElement ReasonBox;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement CheckBox;
	
	@FindBy(xpath = "//Select[@class='zz-form-control-input ng-dirty ng-valid ng-touched']")
	WebElement Dropdown1;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel my platform')]")
	WebElement CancelPlatform2;
	
	@FindBy(xpath = "//span[contains(text(),'You dont have an active subscription.')]")
	WebElement CancelCheck;
	
	@FindBy(xpath = "//div[@class='avatar']")
	WebElement Avatar;
	
	@FindBy(xpath = "//button[normalize-space()='My Profile']")
	WebElement Profile;
	
	
	
	
	
	
	
	
	// Methods for Cancel Platform
	
	public void BillingTabBtn() throws InterruptedException 
	{
		BillingTab.click();
		Thread.sleep(4000);
	}
	
	public void CancelPlatformBtn() throws InterruptedException 
	{
		CancelPlatform.click();
		Thread.sleep(5000);
	}
	
	public void DropdownBtn() throws InterruptedException 
	{
		Select drp = new Select(Dropdown);		
		drp.selectByVisibleText("Other");
		Thread.sleep(3000);
	}
	// Reason Name
	public void ReasonBoxTxt(String ReasonBoxTxt)
	  {
		ReasonBox.clear();
		ReasonBox.sendKeys(ReasonBoxTxt);
	  }
	
	public void CheckBoxBtn() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		
		 js.executeScript("arguments[0].scrollIntoView();", CheckBox);
		 Thread.sleep(2000);
		 CheckBox.click();
	
         Thread.sleep(8000);
	}
	
	public void Dropdown2Btn() throws InterruptedException 
	{
		Select drp = new Select(Dropdown);		
		drp.selectByVisibleText("Too expensive");
		Thread.sleep(3000);
	}
	
	public void AvatarBtn() throws InterruptedException 
	{
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(Avatar).click().build().perform();
		
		Thread.sleep(2000);
	}
	
	public void ProfileBtn() throws InterruptedException 
	{
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(Profile).click().build().perform();
		
		Thread.sleep(2000);
	}
	
	public void CancelCheckfunction() throws InterruptedException 
	{
		Thread.sleep(5000);
          try {
			
			driver.findElement(By.xpath("//span[contains(text(),'You dont have an active subscription.')]"));
			System.out.println("The Sponsor is removed");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The Sponsor is not removed");
		}
	}
	
	public void CancelPlatform2Btn() throws InterruptedException 
	{
		CancelPlatform2.click();
		Thread.sleep(5000);
	}
	
	
}
