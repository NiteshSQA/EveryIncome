package Testcases;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.Loginscreen;
import Screens.MymemberandConfigureScreen;

public class US_22_Member_AssetManager extends BaseClass {

	public Loginscreen login;
	public MymemberandConfigureScreen Member;
	static List<List<Object>> Credentials = null;
	
	
	@BeforeTest
	public void check2()
	{
		login = new Loginscreen(driver);
		Member = new MymemberandConfigureScreen(driver);
		
		try {
			
			Credentials = readspreadsheet.readSpreadSheet("Credentials");
			
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void US_22_Member_AssetManagerFunctionality() throws InterruptedException
	{
		
		// Login code
				login.username(Credentials.get(2).get(1).toString());
							
							
				login.password(Credentials.get(3).get(1).toString());
							
			    login.login();
			    
			    // Member Tab
			    
			    Member.MemberBtn();
			    
			    //Add member textbox
			    Member.FirstInputBoxTxt(Credentials.get(49).get(1).toString());
			    
			    
			    // Preview invitation button
			    Member.PreviewInvitationBtn();
			    
			    
			    // Preview Invitation Popup Textbox
			    Member.PreviewInvitationPopupTxt(Credentials.get(49).get(1).toString());
			    
			    
		        Member.SendPreviewPopupBtn();
		        
		        
		        
		        
		        Member.OkayPreviewBtn();
		        
		        // Send Preview Button
		        
		        Member.AddNewTextboxBtn();
		        
		        Member.SecondinputboxTxt(Credentials.get(50).get(1).toString());
		        
		        Member.SendPreviewBtn();
		        
		        Member.SendPreviewConfirmBtn();
		        
		        
		        Member.OkayBtn();
		        
		        // Send Preview Button
		        
		       
		        
		        
		        
		        
	}
}
