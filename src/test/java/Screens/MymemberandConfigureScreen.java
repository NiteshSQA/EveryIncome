package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MymemberandConfigureScreen {
	
	public WebDriver driver;
	
	
	public MymemberandConfigureScreen(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Xpath for Configure Screen
	
	
	
	@FindBy(xpath ="//span[contains(text(),'Configure')]")
	WebElement Configure;
	
	@FindBy(xpath ="//div[@class='logo-wrap']")
	WebElement ImageLogo;
	
	
	@FindBy(xpath ="//input[@data-placeholder='Or existing URL']")
	WebElement ImageUrl;
	
	@FindBy(xpath ="//span[normalize-space()='Done']")
	WebElement Done;
	
	
	@FindBy(xpath ="//div[@class='color-container primary']")
	WebElement PrimaryColor;
	
	@FindBy(xpath ="//div[@class='hex-text ng-star-inserted']//input")
	WebElement PrimaryColorInput;
	
	
	
	@FindBy(xpath ="//zz-text[@label='Company Name']//input[@type='text']")
	WebElement Mymember;
	
	@FindBy(xpath ="//div[@class='color-container accent']")
	WebElement AccentColor;
	
	@FindBy(xpath ="//div[@class='color-picker open']//div[@class='hex-text ng-star-inserted']//input")
	WebElement AccentColorInput;
	
	@FindBy(xpath ="//span[contains(text(),'Save')]")
	WebElement Save;
	
	@FindBy(xpath ="//span[contains(text(),'Ok')]")
	WebElement Okay;
	
	
	@FindBy(xpath ="//div[@class='avatar']")
	WebElement Avatar;
	
	@FindBy(xpath ="//button[normalize-space()='professionalsbusiness2']")
	WebElement Businessname;
	
	
	// Xpath for Member Tab
	
	@FindBy(xpath ="//span[contains(text(),'Members')]")
	WebElement Member;
	
	
	
	@FindBy(xpath ="//input[@class='zz-form-control-input ng-untouched ng-pristine ng-invalid ng-star-inserted']")
	WebElement FirstInputBox;
	
	@FindBy(xpath ="//span[normalize-space()='Preview invitation']")
	WebElement PreviewInvitation;
	
	
	
	
	@FindBy(xpath ="//input[@class='zz-form-control-input ng-untouched ng-pristine ng-valid ng-star-inserted']")
	WebElement PreviewInvitationPopup;
	
	
	
	@FindBy(xpath ="//span[contains(text(),'Send preview')]")
	WebElement SendPreviewPopup;
	
	@FindBy(xpath ="//span[contains(text(),'Okay')]")
	WebElement OkayPreview;
	
	@FindBy(xpath ="//span[normalize-space()='Send invitation']")
	WebElement SendPreview;
	

	
	
	@FindBy(xpath ="//button[@class='ei-button2 icon-left primary ng-star-inserted']")
	WebElement SendPreviewConfirm;
	
	
	@FindBy(xpath ="//input[@class='zz-form-control-input ng-untouched ng-pristine ng-valid ng-star-inserted']")
	WebElement Secondinputbox;
	
	
	@FindBy(xpath ="//span[normalize-space()='Add another email address']")
	WebElement AddNewTextbox;
	
	
	
	
	
	
	
	
	
	
	
	// Methods for Configure Screen
	public void ConfigureBtn() throws InterruptedException
	{
		Configure.click();
		Thread.sleep(3000);
		
	}
	
	public void ImageLogoBtn() throws InterruptedException
	{
		ImageLogo.click();
		Thread.sleep(3000);
		
	}
	
	public void ImageUrlTxt(String Url) throws InterruptedException
	{
		ImageUrl.sendKeys(Url);
		Thread.sleep(3000);
		
	}
	
	public void DoneBtn() throws InterruptedException
	{
		Done.click();
		Thread.sleep(3000);
		
	}
	
	public void PrimaryColorBtn()
	{
		PrimaryColor.click();
		
		
	}
	
	public void PrimaryColorInputTxt(String PColor)
	{
		PrimaryColorInput.clear();
		PrimaryColorInput.sendKeys(PColor);
		
	}
	
	public void MymemberBtn()
	{
		Mymember.click();
				
	}
	
	public void AccentColorBtn()
	{
		AccentColor.click();
		
		
	}
	
	public void AccentColorInputTxt(String AColor)
	{
		AccentColorInput.clear();
		AccentColorInput.sendKeys(AColor);
		
	}
	
	public void SaveBtn() throws InterruptedException
	{
		Save.click();
		Thread.sleep(9000);
		
		
	}
	
	public void OkayBtn()
	{
		Okay.click();
		
		
	}
	
	public void AvatarBtn() throws InterruptedException
	{
		Avatar.click();
		Thread.sleep(2000);
		
	}
	
	public void BusinessnameBtn() throws InterruptedException
	{
		Businessname.click();
		Thread.sleep(6000);
	}
	
	
	// Methods for Member Tab
	
	public void MemberBtn() throws InterruptedException
	{
		Member.click();
		Thread.sleep(3000);
		
	}
	
	public void FirstInputBoxTxt(String FInputBox) throws InterruptedException
	{
		FirstInputBox.clear();
		FirstInputBox.sendKeys(FInputBox);
		Thread.sleep(3000);
	}
	
	
	
	public void PreviewInvitationBtn() throws InterruptedException
	{
		PreviewInvitation.click();
		Thread.sleep(3000);
		
	}
	
	
	public void PreviewInvitationPopupTxt(String PreviewInvitationPopupTxt) throws InterruptedException
	{
		PreviewInvitationPopup.clear();
		PreviewInvitationPopup.sendKeys(PreviewInvitationPopupTxt);
		Thread.sleep(3000);
	}
	
	public void SendPreviewPopupBtn() throws InterruptedException
	{
		SendPreviewPopup.click();
		Thread.sleep(5000);
		
	}
	
	public void OkayPreviewBtn() throws InterruptedException
	{
		OkayPreview.click();
		Thread.sleep(3000);
		
	}
	
	public void SendPreviewBtn() throws InterruptedException
	{
		SendPreview.click();
		Thread.sleep(3000);
		
	}
	
	
	public void SendPreviewConfirmBtn() throws InterruptedException
	{
		SendPreviewConfirm.click();
		Thread.sleep(3000);
		
	}
	
	public void SecondinputboxTxt(String SInputBox) throws InterruptedException
	{
		Secondinputbox.clear();
		Secondinputbox.sendKeys(SInputBox);
		Thread.sleep(3000);
		
	}
	
	
	public void AddNewTextboxBtn() throws InterruptedException
	{
		AddNewTextbox.click();
		Thread.sleep(3000);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
