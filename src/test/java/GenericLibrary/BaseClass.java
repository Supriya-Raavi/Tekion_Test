
package GenericLibrary; 
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
//import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public WebDriver driver;

	public static Logger log = Logger.getLogger("");


	  @AfterMethod(alwaysRun = true) public void getResult(ITestResult result) throws Exception 
	  { 
	  if (result.getStatus() == ITestResult.FAILURE) 
	  {
	  TakeScreenshot.Failure(driver, result.getName()); 
	  }
	  
	  else if (result.getStatus() == ITestResult.SUCCESS)
	  {
	  TakeScreenshot.Success(driver, result.getName());
	  }
	  }
	 

	// launching browser..

	@BeforeClass(alwaysRun = true)
	public void precondition() throws IOException, InterruptedException {
		log.info("Opening Browser");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	

	// closing browser
	 @AfterClass (alwaysRun=true)
	 public void postcondition()
	 {
	 driver.quit();
	 log.info("Closing Browser");
	 }
}
