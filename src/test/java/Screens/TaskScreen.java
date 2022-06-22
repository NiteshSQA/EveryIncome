package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskScreen {

	
	public WebDriver driver;
	
	
	public TaskScreen(WebDriver driver)
	{
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	}
	
	
	//Xpaths for Add Task

	@FindBy(xpath = "//div[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath = "widget[id='myTasksWidget'] button[class='ei-button2 icon no-bg sm trans ng-star-inserted open']")
	WebElement PanelOpen;
	
	@FindBy(xpath = "//span[contains(text(),'Add a Task')]")
	WebElement AddTask;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement TaskName;
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement TaskCalander;
	
	
	@FindBy(xpath = "//div[normalize-space()='1']")
	WebElement TaskDate1;
	@FindBy(xpath = "//div[normalize-space()='5']")
	WebElement TaskDate2;
	@FindBy(xpath = "//div[normalize-space()='10']")
	WebElement TaskDate3;
	@FindBy(xpath = "//div[normalize-space()='15']")
	WebElement TaskDate4;
	@FindBy(xpath = "//div[normalize-space()='20']")
	WebElement TaskDate5;
	@FindBy(xpath = "//div[normalize-space()='25']")
	WebElement TaskDate6;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement TaskSave;
	
	@FindBy(xpath = "//span[normalize-space()='Show More Tasks']")
	WebElement ShowMoreTask;
	
	
	//Xpaths for Add TaskEdit Operations
	
	@FindBy(xpath = "//div[normalize-space()='29']")
	WebElement TaskDate7;
	
	@FindBy(xpath = "(//i[@class='fas fa-ellipsis-v'])[1]")
	WebElement TaskFHamburgerIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Edit Task']")
	WebElement EditTask;
	
	@FindBy(xpath = "//button[normalize-space()='Rearrange Tasks']")
	WebElement RearrangeTask;
	
	@FindBy(xpath = "(//i[@class='fas fa-arrow-down ng-star-inserted'])[1]")
	WebElement DownArrow1;
	
	@FindBy(xpath = "(//i[@class='fas fa-arrow-up ng-star-inserted'])[5]")
	WebElement UpArrow5;
	
	// Crossing and Uncrossing a Task
	
	@FindBy(xpath = "//li[1]//div[1]//i[1]")
	WebElement CrossingUncrossingTask;
	
	
	// Archive Task
	
	@FindBy(xpath = "//span[normalize-space()='Archive Task']")
	WebElement TaskArhive;
	
	@FindBy(xpath = "//button[normalize-space()='Archived']")
	WebElement Archived;
	
	@FindBy(xpath = "//span[normalize-space()='Unarchive Task']")
	WebElement Unarchive;
	
	@FindBy(xpath = "//button[normalize-space()='Due Soon']")
	WebElement DueSoon;
	
	@FindBy(xpath = "//button[normalize-space()='Newest']")
	WebElement Newest;
	
	@FindBy(xpath = "//button[normalize-space()='My Order']")
	WebElement MyOrder;
	
	@FindBy(xpath = "//span[normalize-space()='Return to list']")
	WebElement ReturnToList;
	
	@FindBy(xpath = "//span[normalize-space()='Delete Task']")
	WebElement DeleteTask;
	
	
	
	
	
	
	
	
	
	// Method for ADD Task

	public void DashboardBtn() throws InterruptedException 
	{
		Dashboard.click();
		Thread.sleep(6000);
	}
	
	public void PanelOpenBtn() throws InterruptedException 
	{
		PanelOpen.click();
		Thread.sleep(4000);
	}
	
	public void AddTaskBtn() throws InterruptedException 
	{
		Actions act2 = new Actions(driver);
		
		act2.moveToElement(AddTask).click().build().perform();
		
		Thread.sleep(2000);
		
	}
	
	 public void TaskNameTxt(String TaskNameTxt) throws InterruptedException
	  {
		  
		 TaskName.clear();
		 TaskName.sendKeys(TaskNameTxt);
		  Thread.sleep(2000);
	  }
	 
	 public void TaskCalanderBtn() throws InterruptedException 
		{
		 TaskCalander.click();
			Thread.sleep(3000);
		}
	 
	 public void TaskDate1Btn() throws InterruptedException 
		{
		 TaskDate1.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskDate2Btn() throws InterruptedException 
		{
		 TaskDate2.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskDate3Btn() throws InterruptedException 
		{
		 TaskDate3.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskDate4Btn() throws InterruptedException 
		{
		 TaskDate4.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskDate5Btn() throws InterruptedException 
		{
		 TaskDate5.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskDate6Btn() throws InterruptedException 
		{
		 TaskDate6.click();
			Thread.sleep(2000);
		}
	 
	 public void TaskSaveBtn() throws InterruptedException 
		{
		 TaskSave.click();
			Thread.sleep(3000);
		}
	 
	 
	 public void ShowMoreTaskBtn() throws InterruptedException 
		{
		 ShowMoreTask.click();
			Thread.sleep(3000);
		}
	 
	 // Methods for Task Edit
	 public void TaskDate7Btn() throws InterruptedException 
		{
		 TaskDate7.click();
			Thread.sleep(2000);
		}
	 
	 // Hamburger Menu
	 public void TaskFHamburgerIconBtn() throws InterruptedException 
		{
		 TaskFHamburgerIcon.click();
			Thread.sleep(2000);
		}
	 
	 public void EditTaskBtn() throws InterruptedException 
		{
		 EditTask.click();
			Thread.sleep(2000);
		}
	 
	 public void RearrangeTaskBtn() throws InterruptedException 
		{
		 RearrangeTask.click();
			Thread.sleep(2000);
		}
	 
	 
	 public void DownArrow1Btn() throws InterruptedException 
		{
		 DownArrow1.click();
			Thread.sleep(2000);
		}
	 
	 public void UpArrow5Btn() throws InterruptedException 
		{
		 UpArrow5.click();
			Thread.sleep(2000);
		}
	
	 public void CrossingUncrossingTaskBtn() throws InterruptedException 
		{
		 CrossingUncrossingTask.click();
			Thread.sleep(4000);
		}
	 
	 public void TaskArhiveBtn() throws InterruptedException 
		{
		 TaskArhive.click();
			Thread.sleep(3000);
		}
	 
	 public void ArchivedBtn() throws InterruptedException 
		{
		 Archived.click();
			Thread.sleep(3000);
		}
	 
	 public void UnarchiveBtn() throws InterruptedException 
		{
		 Unarchive.click();
			Thread.sleep(3000);
		}
	 
	 public void DueSoonBtn() throws InterruptedException 
		{
		 DueSoon.click();
			Thread.sleep(3000);
		}
	 public void NewestBtn() throws InterruptedException 
		{
		 Newest.click();
			Thread.sleep(3000);
		}
	 public void MyOrderBtn() throws InterruptedException 
		{
		 MyOrder.click();
			Thread.sleep(3000);
		}
	 
	 public void ReturnToListBtn() throws InterruptedException 
		{
		 ReturnToList.click();
			Thread.sleep(2000);
		}
	 
	 public void DeleteTaskBtn() throws InterruptedException 
		{
		 DeleteTask.click();
			Thread.sleep(2000);
		}
	 
	 
	 
}
