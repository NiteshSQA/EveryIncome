package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionScreen {

	
public WebDriver driver;
	
	
	public TransactionScreen(WebDriver driver)
	{
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	}
	
	
	// Xpath for Deposit Tab
	@FindBy(xpath = "//div[normalize-space()='My Money']")
	WebElement MyMoney;
	
	@FindBy(xpath = "//div[contains(text(),'Transactions')]")
	WebElement TransactionTab;
	
	@FindBy(id = "add-manual-transaction-btn")
	WebElement AddTransaction;
	
	@FindBy(id = "amount-field")
	WebElement Amount;
	
	
	@FindBy(id = "description-field")
	WebElement Description;
	
	@FindBy(xpath = "//a[@id='genericDropdown_3']")
	WebElement Dropdown;
	
	
	
	
	//Method for Deposit Tab
	public void MyMoneyBtn() throws InterruptedException 
	{
		MyMoney.click();
		Thread.sleep(8000);
	}
	
	public void TransactionTabBtn() throws InterruptedException 
	{
		TransactionTab.click();
		Thread.sleep(4000);
	}
	
	
	public void AmountTxt(String AmountTxt) throws InterruptedException
	{
		
		Amount.sendKeys(AmountTxt);
		 
	}
	public void DescriptionTxt(String DescriptionTxt) throws InterruptedException
	{
		
		Description.sendKeys(DescriptionTxt);
		Thread.sleep(7000);
		 
	}


	
}
