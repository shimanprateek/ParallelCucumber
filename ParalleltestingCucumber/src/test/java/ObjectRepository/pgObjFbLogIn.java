package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pgObjFbLogIn {

	public pgObjFbLogIn(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email") 
	public WebElement txtbx_Email;
	

	@FindBy(how = How.ID, using = "pass") 
	 public WebElement txtbx_Pass;

	@FindBy(how = How.ID, using = "loginbutton") 
	 public WebElement btn_Pass;
	

}
