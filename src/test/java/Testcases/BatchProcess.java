package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.BatchProcessScreen;
import Screens.Loginscreen;
import Spreadsheet.ReadSpreadSheet;

public class BatchProcess extends BaseClass {

	public Loginscreen login;
	public BatchProcessScreen  BatchProcess;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login = new Loginscreen(driver);
	
		BatchProcess = new BatchProcessScreen(driver);
	try {
		Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
	} catch (Exception e) {
		
	}
	
	}
	
	@Test
	public void BatchProcessFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(0).get(1).toString());
					
					
		login.password(Credentials.get(1).get(1).toString());
					
	    login.login();
	    
	    
	    BatchProcess.LogoBtn();
	    
	    BatchProcess.AdminLinkBtn();
	   
	    BatchProcess.UtilBtn();
	    
	    BatchProcess.GenerateBatchProcessBtn();
	    
	    BatchProcess.OkayBtn();
	    
	    BatchProcess.SponsorDetailBtn();
	    
	    BatchProcess.DropdownListBtn(Credentials.get(41).get(1).toString());
	    
	    BatchProcess.GenerateSponsorDetailSingleBtn();
	    
	    BatchProcess.OkayConfirmBtn();
	   
	    BatchProcess.BatchReportBtn();
	    
	    BatchProcess.DropdownList2Btn(Credentials.get(42).get(1).toString());
	    
	    try {
	    	
	    	BatchProcess.ContainProcessingBtn();
	    	
	    	System.out.println("It's in progress");
	    	
	    	BatchProcess.AlertPopupBtn();
	    	    		    	
	    	
		} catch (Exception e) {
			System.out.println("Not in-progress");
		}
	    
	    
	    
	    BatchProcess.DropdownList2Btn(Credentials.get(43).get(1).toString());
	    
	    String SingleSponsorData = BatchProcess.SingleRecordTxt();
	    
	    System.out.println(SingleSponsorData);
	}
	
}
