package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pgObjHome {
	public pgObjHome(WebDriver driver) {
	    PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how = How.ID, using = "userNavigationLabel") 
	 public WebElement pg_login_anchor;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Log Out") 
	 public WebElement list_logout;

}
