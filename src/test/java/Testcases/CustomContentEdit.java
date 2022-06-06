package Testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Screens.CustomContentScreen;
import Screens.Loginscreen;

public class CustomContentEdit extends BaseClass {
	
	public  Loginscreen login;
	public CustomContentScreen CustomContentEdit;
	static List<List<Object>> Credentials = null;
	
	
	@BeforeTest
	public void check1() 
	{
		
		login = new Loginscreen(driver);
		CustomContentEdit = new CustomContentScreen(driver);
		
		try {
			
			Credentials = readspreadsheet.readSpreadSheet("Credentials");
			
		} catch (Exception e) {
			
		}
	}

	@Test
	public void CustomContentEditProcess() throws InterruptedException, AWTException
	{
		
		login.username(Credentials.get(4).get(1).toString());
		
		
		login.password(Credentials.get(5).get(1).toString());
					
	    login.login();
		
	   // Navigating to Custom Content Screen
	    
	    CustomContentEdit.CustomContentlinkBtn();
	    
	    // Changing Article Type Content to Video Type Content
	    CustomContentEdit.CustomContent6Btn();
	    
	    CustomContentEdit.EditBtn();
	    
       
	    
	    CustomContentEdit.CancelBtn();
	    
	    // Image upload
	    
	    
        CustomContentEdit.CustomContent6Btn();
	    
	    CustomContentEdit.EditBtn();
	    
	    CustomContentEdit.UploadImageBtn();
	    
        
	    
	    CustomContentEdit.UploadImageUrlTxt(Credentials.get(21).get(2).toString());
		
	    CustomContentEdit.DoneBtn();
	    
	    CustomContentEdit.DrpfilledBtn(Credentials.get(22).get(2).toString());
	    
	    CustomContentEdit.ContentTitleTxt(Credentials.get(23).get(2).toString());
	    
	    CustomContentEdit.ContentUrlBtn(Credentials.get(24).get(2).toString());
	     
	    CustomContentEdit.PublishChnagesBtn();
	     
	     CustomContentEdit.PopupPublishBtn();
	     
	     CustomContentEdit.OkayBtn();
	     
	     CustomContentEdit.MemberScreenBtn();
	     
	     CustomContentEdit.CustomContentlinkBtn();
	     
	     
	     
	     // Changing Video Type Content to Article Type Content
	     
	     CustomContentEdit.CustomContent6Btn();
		    
		 CustomContentEdit.EditBtn();
		 
		// Image upload
		    
		    CustomContentEdit.UploadImageBtn();
		    
		    CustomContentEdit.UploadImageUrlTxt(Credentials.get(17).get(2).toString());
			
		    CustomContentEdit.DoneBtn();
		    
		    CustomContentEdit.DrpfilledBtn(Credentials.get(18).get(2).toString());
		    
		    // To check cancel Functionality
		    CustomContentEdit.CancelBtn();
		    
		    CustomContentEdit.DiscardChnagesBtn();
		    
		    CustomContentEdit.CustomContent6Btn();
		    
			 CustomContentEdit.EditBtn();
			 
			 CustomContentEdit.UploadImageBtn();
			    
			    CustomContentEdit.UploadImageUrlTxt(Credentials.get(17).get(2).toString());
				
			    CustomContentEdit.DoneBtn();
			    
			    CustomContentEdit.DrpfilledBtn(Credentials.get(18).get(2).toString());
			    
		    
		    CustomContentEdit.ContentTitleTxt(Credentials.get(19).get(2).toString());
		    
		    CustomContentEdit.UploadBtn();
		     
		    CustomContentEdit.UploadmiddleBtn();
		     
		     uploadFile(Credentials.get(20).get(2).toString());
		     
		     CustomContentEdit.UploadfinalBtn();
		     
		     CustomContentEdit.PublishChnagesBtn();
		     
		     CustomContentEdit.PopupPublishBtn();
		     
		     CustomContentEdit.OkayBtn();
	     
		     CustomContentEdit.MemberScreenBtn();
		     
		     CustomContentEdit.CustomContentlinkBtn();
		     
		     
		  // Changing Image Type Content to PDF Type Content
		     
		     CustomContentEdit.CustomContent6Btn();
			    
			 CustomContentEdit.EditBtn();
			 
			 // Image upload
			    
			    CustomContentEdit.UploadImageBtn();
			    
			    CustomContentEdit.UploadImageUrlTxt(Credentials.get(29).get(2).toString());
				
			    CustomContentEdit.DoneBtn();
			    
			    CustomContentEdit.DrpfilledBtn(Credentials.get(30).get(2).toString());
			    
			    CustomContentEdit.ContentTitleTxt(Credentials.get(31).get(2).toString());
			    
			    CustomContentEdit.UploadBtn();
			     
			    CustomContentEdit.UploadmiddleBtn();
			     
			     uploadFile(Credentials.get(32).get(2).toString());
			     
			     CustomContentEdit.UploadfinalBtn();
			     
			     CustomContentEdit.PublishChnagesBtn();
			     
			     CustomContentEdit.PopupPublishBtn();
			     
			     CustomContentEdit.OkayBtn();
		     
			     CustomContentEdit.MemberScreenBtn();
			     
			     CustomContentEdit.CustomContentlinkBtn();
			     
			     
			  // Changing PDF Type Content to Image Type Content
			     
			     CustomContentEdit.CustomContent6Btn();
				    
				 CustomContentEdit.EditBtn();
				 
				 // Image upload
				    
				    CustomContentEdit.UploadImageBtn();
				    
				    CustomContentEdit.UploadImageUrlTxt(Credentials.get(25).get(2).toString());
					
				    CustomContentEdit.DoneBtn();
				    
				    CustomContentEdit.DrpfilledBtn(Credentials.get(26).get(2).toString());
				    
				    CustomContentEdit.ContentTitleTxt(Credentials.get(27).get(2).toString());
				    
				    CustomContentEdit.UploadBtn();
				     
				    CustomContentEdit.UploadmiddleBtn();
				     
				     uploadFile(Credentials.get(28).get(2).toString());
				     
				     CustomContentEdit.UploadfinalBtn();
				     
				     CustomContentEdit.PublishChnagesBtn();
				     
				     CustomContentEdit.PopupPublishBtn();
				     
				     CustomContentEdit.OkayBtn();
			     
				     CustomContentEdit.MemberScreenBtn();
				     
				     CustomContentEdit.CustomContentlinkBtn();
				     
				     
				     // Changing Article Type Content to Video Type Content
					    CustomContentEdit.CustomContent6Btn();
					    
					    CustomContentEdit.EditBtn();
					    
					    // Image upload
					    
					    CustomContentEdit.UploadImageBtn();
					    
					    CustomContentEdit.UploadImageUrlTxt(Credentials.get(37).get(2).toString());
						
					    CustomContentEdit.DoneBtn();
					    
					    CustomContentEdit.DrpfilledBtn(Credentials.get(38).get(2).toString());
					    
					    CustomContentEdit.ContentTitleTxt(Credentials.get(39).get(2).toString());
					    
					    CustomContentEdit.ContentUrlBtn(Credentials.get(40).get(2).toString());
					     
					    CustomContentEdit.PublishChnagesBtn();
					     
					     CustomContentEdit.PopupPublishBtn();
					     
					     CustomContentEdit.OkayBtn();
					     
					     CustomContentEdit.MemberScreenBtn();
					     
					     CustomContentEdit.CustomContentlinkBtn();
					     
					     
					     // Changing Other Type Content to Podcast Type Content
						    CustomContentEdit.CustomContent6Btn();
						    
						    CustomContentEdit.EditBtn();
						    
						    // Image upload
						    
						    CustomContentEdit.UploadImageBtn();
						    
						    CustomContentEdit.UploadImageUrlTxt(Credentials.get(33).get(2).toString());
							
						    CustomContentEdit.DoneBtn();
						    
						    CustomContentEdit.DrpfilledBtn(Credentials.get(34).get(2).toString());
						    
						    CustomContentEdit.ContentTitleTxt(Credentials.get(35).get(2).toString());
						    
						    CustomContentEdit.ContentUrlBtn(Credentials.get(36).get(2).toString());
						     
						    CustomContentEdit.PublishChnagesBtn();
						     
						     CustomContentEdit.PopupPublishBtn();
						     
						     CustomContentEdit.OkayBtn();
						     
						     CustomContentEdit.MemberScreenBtn();
						     
						     CustomContentEdit.CustomContentlinkBtn();
			 
			 
	     
	     
	     
	}
	
	 // Method Call for KeyPress Events
    public static void setClipBoard(String file) {
	  StringSelection obj= new StringSelection(file);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	 }

    public static void uploadFile(String filePath) throws AWTException, InterruptedException {
	  setClipBoard(filePath);
	  Robot rb= new Robot();
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  rb.keyRelease(KeyEvent.VK_V);
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	 
     Thread.sleep(3000);
     rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  rb.keyRelease(KeyEvent.VK_V);
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	 
	 }

}



