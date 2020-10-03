package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebookdetails {
	
	public WebDriver driver;
	//pgObjFbLogIn pgObj;
	//pgObjHome pgObj1;
	public   WebDriverWait wait ;
	//Scenario scenario;

		
	@Given("^I am on facebook page \"([^\"]*)\"$")
	public void i_am_on_facebook_page(String Browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:/Users/shima/Downloads/chromedriver_win32_latest/chromedriver.exe");
				driver = new ChromeDriver();	
				//scenario.write("Chrome driver In");
		}else
		{
			driver = new FirefoxDriver();
		}
		Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	//	Reporter.addStepLog("Launch Successful : PASS ");
	}

	@When("^I login with credentials$")
	public void i_login_with_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	/*	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("shiman.prateek@gmail.com");
		pgObj = new pgObjFbLogIn(driver);
		pgObj.txtbx_Email.clear();
		pgObj.txtbx_Email.sendKeys("shiman.prateek@gmail.com");
		pgObj.txtbx_Pass.clear();
		pgObj.txtbx_Pass.sendKeys("shiman");
		pgObj.btn_Pass.click();*/
		//Reporter.addStepLog("Scenario Step : PASS ");
	}

	@After
	@Then("^I logout$")
	public void i_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*pgObj1 = new pgObjHome(driver);	
	    pgObj1.pg_login_anchor.click();
	    wait = new WebDriverWait(driver,10) ;
	    wait.until(ExpectedConditions.visibilityOf(pgObj1.list_logout));
	    pgObj1.list_logout.click();*/
	   // Reporter.addScenarioLog("User Logged-Off Successfully out of Facebook - Passed");
		driver.quit();
	}
}
