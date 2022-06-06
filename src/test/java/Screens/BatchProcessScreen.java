package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BatchProcessScreen {
	
	public WebDriver driver;
	
	
public BatchProcessScreen(WebDriver driver)
{
  this.driver = driver;
  PageFactory.initElements(driver, this);
}

//Xpaths for Batch Screen

@FindBy(xpath = "//i[@class='logo-image']")
WebElement Logo;

@FindBy(xpath = "//span[normalize-space()='Admin']")
WebElement AdminLink;



@FindBy(xpath = "//a[@href='/admin/utils']")
WebElement Util;


@FindBy(xpath = "//span[normalize-space()='Generate']")
WebElement GenerateBatchProcess;



@FindBy(xpath = "//span[contains(text(),'Okay')]")
WebElement Okay;


@FindBy(xpath = "//span[contains(text(),'Sponsor Details')]")
WebElement SponsorDetail;



@FindBy(xpath = "//body/everyincome[1]/admin-dashboard[1]/ei-side-bar[1]/div[2]/div[1]/admin-sponsor-members[1]/div[1]/panel[1]/div[2]/div[1]/zz-select[1]/label[1]/div[2]/select[1]")
WebElement DropdownList;


@FindBy(xpath = "//span[contains(text(),'Generate sponsor images')]")
WebElement GenerateSponsorDetailSingle;

@FindBy(xpath = "//span[contains(text(),'Okay')]")
WebElement OkayConfirm;

@FindBy(xpath = "//span[contains(text(),'PROCESSING')]")
WebElement ContainProcessing;



@FindBy(xpath = "//a[@class='ei-sidebar-item ng-star-inserted'][7]")
WebElement BatchReport;



@FindBy(xpath = "//body/everyincome[1]/admin-dashboard[1]/ei-side-bar[1]/div[2]/div[1]/batch-job-report[1]/div[1]/div[1]/zz-select[1]/label[1]/div[2]/select[1]")
WebElement DropdownList2;

@FindBy(xpath = "//span[contains(text(),'PROCESSING')]")
WebElement Processing;


@FindBy(xpath = "//button[@class='ei-button alert2']")
WebElement AlertPopup;


@FindBy(xpath = "//body/everyincome[1]/admin-dashboard[1]/ei-side-bar[1]/div[2]/div[1]/batch-job-report[1]/div[1]/div[2]/ei-table[1]/div[1]/div[2]/mat-table[1]/mat-row[1]")
WebElement SingleRecord;






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


public void UtilBtn() throws InterruptedException 
{
	Util.click();
	Thread.sleep(4000);
}


public void GenerateBatchProcessBtn() throws InterruptedException 
{
	GenerateBatchProcess.click();
	Thread.sleep(4000);
}


public void OkayBtn() throws InterruptedException 
{
	Okay.click();
	Thread.sleep(4000);
}

public void SponsorDetailBtn() throws InterruptedException 
{
	SponsorDetail.click();
	Thread.sleep(4000);
}

public void DropdownListBtn(String value) throws InterruptedException
{
	  
	  Select drp = new Select(DropdownList);
		
	  drp.selectByVisibleText(value);
	  
	  Thread.sleep(2000);
	  
}

public void DropdownList2Btn(String value) throws InterruptedException
{
	  
	  Select drp = new Select(DropdownList2);
		
	  drp.selectByVisibleText(value);
	  
	  Thread.sleep(2000);
	  
}



public void GenerateSponsorDetailSingleBtn() throws InterruptedException 
{
	GenerateSponsorDetailSingle.click();
	Thread.sleep(4000);
}

public void OkayConfirmBtn() throws InterruptedException 
{
	OkayConfirm.click();
	Thread.sleep(4000);
}

public void BatchReportBtn() throws InterruptedException 
{
	BatchReport.click();
	Thread.sleep(4000);
}





public void ProcessingBtn() throws InterruptedException 
{
	Processing.click();
	Thread.sleep(4000);
}
public void AlertPopupBtn() throws InterruptedException 
{
	AlertPopup.click();
	Thread.sleep(4000);
}

public void ContainProcessingBtn() throws InterruptedException 
{
	ContainProcessing.click();
	Thread.sleep(4000);
}

public String SingleRecordTxt()
{
	return SingleRecord.getText();
	
}









}
