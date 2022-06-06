package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginscreen  {
	
	public  WebDriver driver;
	
	
 public	Loginscreen(WebDriver driver)
 {
	 
	 this.driver = driver; 
	 PageFactory.initElements(driver, this);  // have to undertand this code
	 
	 	 
	  
 }
  

	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="kc-login")
	WebElement loginbtn;
	

	
	public void username(String username)
	{
		txtusername.sendKeys(username);
		
	}
	
	public void password(String password)
	{
		txtpassword.sendKeys(password);
		
	}
	
	public void login() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(9000);
		
	}
	
	
	
	
	
		
			
		
		
		
		
		
		
		
	}
	
	


