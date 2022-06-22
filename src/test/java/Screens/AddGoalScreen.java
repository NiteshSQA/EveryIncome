package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGoalScreen {

	public WebDriver driver;
	
	
public AddGoalScreen(WebDriver driver)
 {
   this.driver = driver;
   PageFactory.initElements(driver, this);

 }

  //Xpath for Goal Screen

@FindBy(xpath = "//div[normalize-space()='My Money']")
WebElement MyMoney;

@FindBy(xpath = "//div[contains(text(),'Goals')]")
WebElement Goals;

@FindBy(id = "sfgGetStarted")
WebElement GetStarted;

@FindBy(xpath = "//div[contains(text(),'Purchases')]")
WebElement Purchases;

@FindBy(xpath = "//a[@aria-label='New Car']")
WebElement NewCar;

@FindBy(xpath = "//input[@id='sfgGoalNameInput' ]")
WebElement NameYourGoal;

@FindBy(xpath = "//input[@id='sfgGoalAmountInput' ]")
WebElement GoalAmount;

 
@FindBy(xpath = "//label[@class='yodlee-radio-button-label-radio inactive-radio targetDateRadioLabel' ]")
WebElement DateRadio;

@FindBy(id = "sfgGoalTargetDateInput")
WebElement TargetDate;

@FindBy(id = "saveGoalState")
WebElement Next;

@FindBy(id = "sfgAccountsAllocationAmountId")
WebElement AllocateAmount;

 
@FindBy(xpath = "//a[@id='sfgSaveFunding']")
WebElement SaveFunding;

@FindBy(xpath = "//a[@id='saveGoalState']")
WebElement StartGoal;

// Edit Goal screen

@FindBy(xpath = "//a[@class=' goalCard']")
WebElement GoalCard;

@FindBy(xpath = "//a[@id='saveGoalState']")
WebElement EditGoal;


@FindBy(xpath = "//input[@class='y-textFieldElement  sfgEditGoalNameInput']")
WebElement GoalName;


@FindBy(xpath = "//input[@id='sfgEditGoalAmountInput']")
WebElement GoalAmountEdit;

@FindBy(xpath = "//input[@id='sfgGoalTargetDateInput']")
WebElement GoalDateEdit;

@FindBy(xpath = "//a[@class='saveGoalState button y-primary-button y-text-align-center']")
WebElement SaveGoalState;


@FindBy(xpath = "//a[@id='sfgSaveGoalEdit']")
WebElement SaveGoalEdit;

@FindBy(xpath = "//span[@id='saveBtnMedium']")
WebElement SaveMedium;
//a[@id='saveGoalState']


	

  //Methods for Goal Screen

public void MyMoneyBtn() throws InterruptedException 
{
	MyMoney.click();
	Thread.sleep(8000);
}

public void GoalsBtn() throws InterruptedException 
{
	Goals.click();
	Thread.sleep(11000);
}

public void GetStartedBtn() throws InterruptedException 
{
	GetStarted.click();
	Thread.sleep(9000);
}

public void PurchasesBtn() throws InterruptedException 
{
	Purchases.click();
	Thread.sleep(5000);
}

public void NewCarBtn() throws InterruptedException 
{
	NewCar.click();
	Thread.sleep(5000);
}


public void NameYourGoalTxt(String NameYourGoalTxt) throws InterruptedException
{
	NameYourGoal.clear();
	NameYourGoal.sendKeys(NameYourGoalTxt);
	  Thread.sleep(3000);
}

public void GoalAmountTxt(String GoalAmountTxt) throws InterruptedException
{
	GoalAmount.clear();
	GoalAmount.sendKeys(GoalAmountTxt);
	  Thread.sleep(3000);
}

public void DateRadioBtn() throws InterruptedException 
{
	DateRadio.click();
	Thread.sleep(5000);
}

public void TargetDateTxt(String TargetDateTxt) throws InterruptedException
{
	TargetDate.click();
	TargetDate.sendKeys(TargetDateTxt);
	  Thread.sleep(3000);
}

public void NextBtn() throws InterruptedException 
{
	Next.click();
	Thread.sleep(6000);
}


public void AllocateAmountTxt(String AllocateAmountTxt) throws InterruptedException
{
	
	AllocateAmount.sendKeys(AllocateAmountTxt);
	  Thread.sleep(3000);
}

public void SaveFundingBtn() throws InterruptedException 
{
	SaveFunding.click();
	Thread.sleep(3000);
}


// Used More than once
public void StartGoalBtn() throws InterruptedException 
{
	StartGoal.click();
	Thread.sleep(3000);
}

// Edit Goal Methods

public void GoalCardBtn() throws InterruptedException 
{
	GoalCard.click();
	Thread.sleep(11000);
}

public void EditGoalBtn() throws InterruptedException 
{
	EditGoal.click();
	Thread.sleep(11000);
}

public void GoalNameTxt(String GoalNameTxt) throws InterruptedException
{
	
	
	GoalName.clear();
	GoalName.sendKeys(GoalNameTxt);
	  Thread.sleep(3000);
}

public void GoalAmountEditTxt(String GoalAmountEditTxt) throws InterruptedException
{
	
	
	GoalAmountEdit.clear();
	GoalAmountEdit.sendKeys(GoalAmountEditTxt);
	  Thread.sleep(3000);
}

public void GoalDateEditTxt(String GoalDateEditTxt) throws InterruptedException
{
	
	
	GoalDateEdit.clear();
	GoalDateEdit.sendKeys(GoalDateEditTxt);
	  Thread.sleep(3000);
}

public void SaveGoalStateBtn() throws InterruptedException 
{
	SaveGoalState.click();
	Thread.sleep(4000);
}

public void SaveGoalEditBtn() throws InterruptedException 
{
	SaveGoalEdit.click();
	Thread.sleep(4000);
}

public void SaveMediumBtn() throws InterruptedException 
{
	SaveMedium.click();
	Thread.sleep(4000);
}










}
