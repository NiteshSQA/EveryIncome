package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberandBusinessScreen {

	
	public WebDriver driver;
	
	
	public MemberandBusinessScreen(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Xpaths 
	@FindBy(xpath ="//span[contains(text(),'Members')]")
	WebElement Member;
	
	@FindBy(xpath ="//div[contains(text(),'Member 2 Member 2')]")
	WebElement MemberName;
	
	@FindBy(xpath ="//*[name()='rect' and contains(@width,'36')]")
	WebElement Hamburger;
	
	
	@FindBy(xpath ="//span[normalize-space()='Make Admin']")
	WebElement MakeAdmin;
	                
	@FindBy(xpath ="(//*[name()='rect' and contains(@width,'36')])[2]")
	WebElement Hamburger2;
	
	@FindBy(xpath ="//span[normalize-space()='Make Member']")
	WebElement MakeMember;
	
	
	@FindBy(xpath ="//span[normalize-space()='My Businesses']")
	WebElement MyBusiness;
	
	
	@FindBy(xpath ="//div[@title='professionalsbusiness2']")
	WebElement ProfessionalUser;
	
	@FindBy(xpath ="//div[@title='business 2 business 2']")
	WebElement ProfessionalUserDM;
	
	
	@FindBy(xpath ="//span[normalize-space()='Back to My Businesses']")
	WebElement BacktoBusiness;
	
	
	
	
	//Methods
	
	public void MemberBtn() throws InterruptedException
	{
		Member.click();
		Thread.sleep(3000);
		
	}
	
	public void MemberNameBtn() throws InterruptedException
	{
		MemberName.click();
		Thread.sleep(3000);
		
	}
	
	public void HamburgerBtn() throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		act.click(Hamburger).build().perform();
		
		Thread.sleep(6000);
	}
	
	public void MakeMemberBtn() throws InterruptedException
	{
		MakeMember.click();
		Thread.sleep(3000);
		
	}
	
	
	public void Hamburger2Btn() throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		act.click(Hamburger2).build().perform();
		
		Thread.sleep(6000);
	}
	
	
	public void MakeAdminBtn() throws InterruptedException
	{
		MakeAdmin.click();
		Thread.sleep(3000);
		
	}
	
	
	public void MyBusinessBtn() throws InterruptedException
	{
		MyBusiness.click();
		Thread.sleep(3000);
		
	}
	
	public void ProfessionalUserBtn() throws InterruptedException
	{
		ProfessionalUser.click();
		Thread.sleep(3000);
		
	}
	
	public void ProfessionalUserDMBtn() throws InterruptedException
	{
		ProfessionalUserDM.click();
		Thread.sleep(3000);
		
	}
	
	public void BacktoBusinessBtn() throws InterruptedException
	{
		BacktoBusiness.click();
		Thread.sleep(3000);
		
	}
	
	
	
}
