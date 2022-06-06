package Testcases;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.DownloadReportSuperAdminScreen;
import Screens.Loginscreen;

public class US_142_ReportDownload extends BaseClass{

	public Loginscreen login;
	public DownloadReportSuperAdminScreen Download;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login = new Loginscreen(driver);
		
		Download = new DownloadReportSuperAdminScreen(driver);
		
		try {
			
			Credentials = readspreadsheet.readSpreadSheet("Credentials");
			
		} catch (Exception e) {
			
		}
		
	}
	
	
	@Test
	public void US_142_ReportDownloadFunctionality() throws InterruptedException
	{
		 // Login code
		login.username(Credentials.get(0).get(1).toString());
					
					
		login.password(Credentials.get(1).get(1).toString());
					
	    login.login();
		
	    Download.LogoBtn();
	    
	    Download.AdminLinkBtn();
	    
	    Download.SponsorLinkBtn();
	    
	    Download.DropdownList1Btn(Credentials.get(56).get(1).toString());
	    
	    Download.DownloadBtn();
	}
}
