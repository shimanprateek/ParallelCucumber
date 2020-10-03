/*package Trigger;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/java/Features"
		features = {"C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\src\\test\\java\\Features"}
		//features = {"C:\\Users\\pratekug\\eclipse-workspace\\FlexCubeReportingV2\\src\\test\\java\\Features\\AccountBalance_Def.feature"}
		,glue = {"StepDefinition"}
		,tags = {"@Smoke"}
		//,tags = {"@FeatureYo","@Reg,@Smoke"}
		//,plugin = {"pretty","html:target/html-report","json:target/cucumber.json"}
		,plugin = {"pretty","html:target/html-report","json:target/cucumber0.json",
				"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\target\\cucumber-reports\\report0.html"}
	//	,glue = {"stepDefinition"}
		)

public class TestRunnerIT {

	@AfterClass
	public static void writeExtentReport() throws InterruptedException {
		File f = new File("C:\\Users\\shima\\workspace\\ParalleltestingCucumber\\extent-config.xml");
		//ExtentCucumberFormatter.class
		 Reporter.loadXMLConfig(f);
		 Reporter.setSystemInfo("Browser", "Chrome");
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		 Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		 Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		 Reporter.setSystemInfo("Selenium", "2.53");
		 Reporter.setSystemInfo("Maven", "3.5.2");
		 Reporter.setSystemInfo("Java Version", "1.8.0_171");
		 //Thread.sleep(5000);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("---start Project---");
	}

}

*/