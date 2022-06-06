package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class CustomContentScreen {
	
	public WebDriver driver;
	
	
	
  public CustomContentScreen(WebDriver driver)
  {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  // Xpaths for Custom Content
  
  @FindBy(xpath = "//span[contains(text(),'Custom Content')]")
  WebElement CustomContentlink;
  
  @FindBy(xpath = "//span[contains(text(),'Add new link')]")
  WebElement CustomContentAddlink;
  
  // Image upload
  
  @FindBy(xpath = "//span[contains(text(),'Upload image')]")
  WebElement UploadImage;
  
  @FindBy(xpath = "//input[@data-placeholder='Or existing URL']")
  WebElement UploadImageUrl;
  
  @FindBy(xpath = "//span[contains(text(),'Done')]")
  WebElement Done;
  
  @FindBy(xpath = "//span[normalize-space()='Cancel']")
  WebElement Cancel;
  
  @FindBy(xpath = "//span[normalize-space()='Discard changes']")
  WebElement DiscardChnages;


  // DropDown
  

  
  @FindBy(xpath = "//select[@class='zz-form-control-input ng-untouched ng-pristine ng-invalid']")
  WebElement Drp;

  @FindBy(xpath = "//select[@class='zz-form-control-input ng-untouched ng-pristine ng-valid']")
  WebElement Drpfilled;
  
  
  @FindBy(xpath = "//input[@type='text']")
  WebElement ContentTitle;
  

  @FindBy(xpath = "//span[normalize-space()='Upload content']")
  WebElement Upload;
  

  
  @FindBy(xpath = "//i[@class='fad fa-file-upload upload-icon']")
  WebElement Uploadmiddle;


  @FindBy(xpath = "//span[normalize-space()='Upload']")
  WebElement Uploadfinal;
  

  @FindBy(xpath = "//span[contains(text(),'Publish link')]")
  WebElement PublishLink;
  
  @FindBy(xpath = "//span[normalize-space()='Publish changes']")
  WebElement PublishChnages;
  

  
  @FindBy(xpath = "//button[@class='ei-button2 icon-left ng-star-inserted']")
  WebElement PopupOkay;
  

  @FindBy(xpath = "//span[contains(text(),'Okay')]")
  WebElement Okay;
  
  @FindBy(xpath = "//zz-text[@label='Content URL']//input[@type='text']")
  WebElement ContentUrl;
  
//Xpaths for Delete Custom Content Screens
  
  @FindBy(xpath = "//li[1]//div[2]//div[1]//div[2]//button[1]")
  WebElement ContentHamburger;
  

  
  @FindBy(xpath = "//span[normalize-space()='Delete']")
  WebElement ContentDelete;
  

  
  @FindBy(xpath = "//span[contains(text(),'Delete link')]")
  WebElement ContentDeleteFinal;
  

  @FindBy(xpath = "//span[contains(text(),'Members')]")
  WebElement MemberScreen;
  
  
  // Xpaths for Edit Custom Content 
  
  
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[1]")
 WebElement CustomContent1;
 
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[2]")
 WebElement CustomContent2;
 
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[3]")
 WebElement CustomContent3;
 
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[4]")
 WebElement CustomContent4;
 
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[5]")
 WebElement CustomContent5;
 
 @FindBy(xpath = "(//button[@class='mat-menu-trigger ei-button2 icon sm trans'])[6]")
 WebElement CustomContent6;
 

 
 @FindBy(xpath = "//span[normalize-space()='Edit']")
 WebElement Edit;
		  
 
 // Xpaths for checking Custom Content

 
 @FindBy(xpath = "//h6[contains(text(),'My Pro Recommended Content')]")
 WebElement CustomContentCheck;
 

 
 @FindBy(xpath = "//span[contains(text(),'https://soundcloud.com/brahmakumaris/sukh-itne-pay')]")
 WebElement CustomContentUrl;
 
 
  // Methods
  
  public void CustomContentlinkBtn() throws InterruptedException
  {
	  CustomContentlink.click();
	  Thread.sleep(3000);
  }
  
  
  public void CustomContentAddlinkBtn() throws InterruptedException
  {
	  
	  CustomContentAddlink.click();
	  Thread.sleep(3000);
  }
  
  public void UploadImageBtn() throws InterruptedException
  {
	  UploadImage.click();
	  Thread.sleep(3000);
  }
  
  
  public void UploadImageUrlTxt(String UrlTxt) throws InterruptedException
  {
	  
	  UploadImageUrl.sendKeys(UrlTxt);
	  Thread.sleep(3000);
  }
  
  public void DoneBtn() throws InterruptedException
  {
	  Done.click();
	  Thread.sleep(3000);
  }
  
  
  
  
  public void DrpBtn(String value) throws InterruptedException
  {
	  
	  Select drp = new Select(Drp);
		
	  drp.selectByVisibleText(value);
	  
	  Thread.sleep(2000);

  }
  
  public void DrpfilledBtn(String value) throws InterruptedException
  {
	  
	  Select drp = new Select(Drpfilled);
		
	  drp.selectByVisibleText(value);
	  
	  Thread.sleep(2000);

  }
  
  
  
  
  public void ContentTitleTxt(String ContentName)
  {
	  ContentTitle.clear();
	  ContentTitle.sendKeys(ContentName);
  }
  
  public void UploadBtn() throws InterruptedException
  {
	  
	  Upload.click();
	  Thread.sleep(2000);
  }
  
  
  public void UploadmiddleBtn() throws InterruptedException
  {
	  Actions act= new Actions(driver);
	  WebElement upload_file =Uploadmiddle;
	  act.moveToElement(upload_file).click().perform();
	  Thread.sleep(5000);
  }
  
  
  
  public void UploadfinalBtn() throws InterruptedException
  {
	  
	  Uploadfinal.click();
	  Thread.sleep(8000);
  }

  public void PublishLinkBtn() throws InterruptedException
  {
	  PublishLink.click();
	  Thread.sleep(3000);
  }
  
  public void PublishChnagesBtn() throws InterruptedException
  {
	  PublishChnages.click();
	  Thread.sleep(3000);
  }
  
	
  
  public void PopupPublishBtn() throws InterruptedException
  {
	  PopupOkay.click();
	  Thread.sleep(4000);
  }
  
  
  public void OkayBtn() throws InterruptedException
  {
	  Okay.click();
	  Thread.sleep(3000);
  }
  
  
  public void ContentUrlBtn(String Url) throws InterruptedException
  {
	  ContentUrl.sendKeys(Url);
	  Thread.sleep(3000);
  }
  
  
  public void ContentHamburgerBtn() throws InterruptedException
  {
	  ContentHamburger.click();
	  Thread.sleep(3000);
  }
  
  public void ContentDeleteBtn() throws InterruptedException
  {
	  ContentDelete.click();
	  Thread.sleep(3000);
  }
  
  public void ContentDeleteFinalBtn() throws InterruptedException
  {
	  ContentDeleteFinal.click();
	  Thread.sleep(3000);
  }
  
  public void MemberScreenBtn() throws InterruptedException
  {
	  MemberScreen.click();
	  Thread.sleep(5000);
  }
  
  
  public void CustomContent1Btn() throws InterruptedException
  {
	  
	  CustomContent1.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContent2Btn() throws InterruptedException
  {
	  
	  CustomContent2.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContent3Btn() throws InterruptedException
  {
	  
	  CustomContent3.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContent4Btn() throws InterruptedException
  {
	  
	  CustomContent4.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContent5Btn() throws InterruptedException
  {
	  
	  CustomContent5.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContent6Btn() throws InterruptedException
  {
	  
	  CustomContent6.click();
	  Thread.sleep(3000);
  }
  
  public void EditBtn() throws InterruptedException
  {
	  Edit.click();
	  Thread.sleep(3000);
	  
  }
  
  public void CancelBtn() throws InterruptedException
  {
	  Cancel.click();
	  Thread.sleep(3000);
	  
   }
  
  
  public void DiscardChnagesBtn() throws InterruptedException
  {
	  DiscardChnages.click();
	  Thread.sleep(3000);
  }
  
  
  public void CustomContentCheckBtn() throws InterruptedException
  {
	  CustomContentCheck.click();
	  Thread.sleep(3000);
  }
  
  public void CustomContentUrlBtn() throws InterruptedException
  {
	  Actions act= new Actions(driver);
	  WebElement upload_file =CustomContentUrl;
	  act.moveToElement(upload_file).click().perform();
	  Thread.sleep(5000);
  }
  
  
}
