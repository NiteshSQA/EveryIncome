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

public class CustomContentAdd extends BaseClass {
	
	public Loginscreen login;
	public CustomContentScreen CustomContenAdd;
	static List<List<Object>> Credentials = null;
	
	@BeforeTest
	public void check1()
	{
		login= new Loginscreen(driver);
		CustomContenAdd = new CustomContentScreen(driver);
		
		try {
			Credentials= readspreadsheet.readSpreadSheet("Credentials"); 
		} catch (Exception e) {
			
			
		}
	}
	
	@Test
	public void CustomContentCreation() throws InterruptedException, AWTException
	{
		
    // Login code
	login.username(Credentials.get(4).get(1).toString());
				
				
	login.password(Credentials.get(5).get(1).toString());
				
    login.login();
    
    // Navigating to Custom Content Screen
    
   CustomContenAdd.CustomContentlinkBtn();
    
     // Article Type Content
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
    
     CustomContenAdd.UploadImageBtn();
     
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(17).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     //TextBox Code
     CustomContenAdd.DrpBtn(Credentials.get(18).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(19).get(1).toString());
     
     CustomContenAdd.UploadBtn();
     
     CustomContenAdd.UploadmiddleBtn();
     
     uploadFile(Credentials.get(20).get(1).toString());
     
     CustomContenAdd.UploadfinalBtn();
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
    
     
     //Video Type content
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
     CustomContenAdd.UploadImageBtn();
     
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(21).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     //TextBox Code
     CustomContenAdd.DrpBtn(Credentials.get(22).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(23).get(1).toString());
     
     CustomContenAdd.ContentUrlBtn(Credentials.get(24).get(1).toString());
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
		
     // Image Type Content
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
      
     CustomContenAdd.UploadImageBtn();
     
     //TextBox Code
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(25).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     CustomContenAdd.DrpBtn(Credentials.get(26).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(27).get(1).toString());
     
     CustomContenAdd.UploadBtn();
     
     CustomContenAdd.UploadmiddleBtn();
     
     uploadFile(Credentials.get(28).get(1).toString());
     
     CustomContenAdd.UploadfinalBtn();
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
          
     // PDF Type Content
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
     CustomContenAdd.UploadImageBtn();
     
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(29).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     //TextBox Code
     CustomContenAdd.DrpBtn(Credentials.get(30).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(31).get(1).toString());
     
     CustomContenAdd.UploadBtn();
     
     CustomContenAdd.UploadmiddleBtn();
     
     uploadFile(Credentials.get(32).get(1).toString());
     
     CustomContenAdd.UploadfinalBtn();
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
     
     // PODCAST Type Content
     
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
     CustomContenAdd.UploadImageBtn();
     
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(33).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     //TextBox Code
     CustomContenAdd.DrpBtn(Credentials.get(34).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(35).get(1).toString());
     
     CustomContenAdd.ContentUrlBtn(Credentials.get(36).get(1).toString());
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
     
     // Other Type Content
     CustomContenAdd.CustomContentAddlinkBtn();
     
     // Image Upload Code
     CustomContenAdd.UploadImageBtn();
     
     CustomContenAdd.UploadImageUrlTxt(Credentials.get(37).get(1).toString());
     
     CustomContenAdd.DoneBtn();
     
     
     //TextBox Code
     CustomContenAdd.DrpBtn(Credentials.get(38).get(1).toString());
     
     CustomContenAdd.ContentTitleTxt(Credentials.get(39).get(1).toString());
     
     CustomContenAdd.ContentUrlBtn(Credentials.get(40).get(1).toString());
     
     CustomContenAdd.PublishLinkBtn();
     
     CustomContenAdd.PopupPublishBtn();
     
     CustomContenAdd.OkayBtn();
     
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

