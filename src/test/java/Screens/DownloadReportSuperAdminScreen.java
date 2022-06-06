package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DownloadReportSuperAdminScreen {
	
	public WebDriver driver;
	
	
	public DownloadReportSuperAdminScreen(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Xpath for Report Screen
	@FindBy(xpath = "//i[@class='logo-image']")
	WebElement Logo;
	
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement AdminLink;
	
	@FindBy(xpath = "//span[normalize-space()='Sponsors']")
	WebElement SponsorLink;
	
	@FindBy(xpath = "//select[@class='zz-form-control-input ng-untouched ng-pristine ng-valid']")
	WebElement DropdownList1;
	
	@FindBy(xpath = "//span[normalize-space()='Download']")
	WebElement Download;
	
	@FindBy(xpath = "//span[contains(text(),'Users')]")
	WebElement Users;
	
	
	@FindBy(xpath = "//zz-select[@name='reports']//select[@class='zz-form-control-input ng-untouched ng-pristine ng-valid']")
	WebElement DropdownList2;
	
	@FindBy(xpath = "//select[@class='zz-form-control-input ng-valid ng-dirty ng-touched']")
	WebElement DropdownList3;
	

	
	
	
	// Methods
	
	public void LogoBtn() throws InterruptedException 
	{
		Logo.click();
		Thread.sleep(4000);
	}


	public void AdminLinkBtn() throws InterruptedException 
	{
		AdminLink.click();
		Thread.sleep(4000);
	}
	
	public void SponsorLinkBtn() throws InterruptedException 
	{
		SponsorLink.click();
		Thread.sleep(2000);
	}

	public void DropdownList1Btn(String value) throws InterruptedException
	{
		  
		  Select drp = new Select(DropdownList1);
			
		  drp.selectByVisibleText(value);
		  
		  Thread.sleep(2000);
		  
	}
	
	public void DownloadBtn() throws InterruptedException 
	{
		Download.click();
		Thread.sleep(4000);
	}
	
	public void UsersBtn() throws InterruptedException 
	{
		Users.click();
		Thread.sleep(4000);
	}
	
	
	public void DropdownList2Btn(String value) throws InterruptedException
	{
		  
		  Select drp = new Select(DropdownList2);
			
		  drp.selectByVisibleText(value);
		  
		  Thread.sleep(2000);
		  
	}
	
	
	public void DropdownList3Btn(String value) throws InterruptedException
	{
		  
		  Select drp = new Select(DropdownList3);
			
		  drp.selectByVisibleText(value);
		  
		  Thread.sleep(2000);
		  
	}
	
	


}
