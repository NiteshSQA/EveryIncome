	package BaseClass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Spreadsheet.ReadSpreadSheet;

public class BaseClass {

	public  WebDriver driver;
	public static ReadSpreadSheet readspreadsheet= new ReadSpreadSheet(); // spread sheet initialization
	static List<List<Object>> URL = null;  // object of list with null value
	
	
	@BeforeTest
	public void setUp() throws InterruptedException, IOException
	{
		 URL= readspreadsheet.readSpreadSheet("Login");  // sheet name reading 
		 System.out.println(URL);
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
		     driver = new ChromeDriver();
		     String url=(URL.get(0).get(1).toString());  // first is row and second is column
			
			driver.get(url);
			System.out.println(URL);
			
			
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();
			
			Thread.sleep(4000);
			
			
		
			
	}	
	
	
	
	@AfterTest
	   public void tearDown()
{
	 // driver.quit();
		  
	
}
	
}
