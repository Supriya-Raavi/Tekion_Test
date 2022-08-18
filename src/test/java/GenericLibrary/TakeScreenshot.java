package GenericLibrary;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.relevantcodes.extentreports.LogStatus;


public class TakeScreenshot extends BaseClass {

	public static void Success(WebDriver driver, String testName) throws IOException {

		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//The below method will save the screen shot in d drive with test method name 
		try {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + testName + timeStamp + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken for the passed testcase "+testName);
			
			//FileUtils.copyFile(scrFile, new File("./Screenshot/"+dateformat +"/Success/" +testName+".png"));
			//log.info("Screenshot is stored : " + "./Screenshot/"+dateformat +"/Success/" +testName+".png");
			
			//extent_logger.log(LogStatus.PASS , extent_logger.addScreenCapture(System.getProperty("user.dir") + "./Screenshot/"+dateformat +"/Success/" +testName+".png"));
		} catch (IOException e) {
			log.error(e.getLocalizedMessage());
		}

	}

	public static void Failure(WebDriver driver, String testName) throws IOException {

		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//The below method will save the screen shot in d drive with test method name 
		try {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + testName + timeStamp + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken for failed case "+testName);
			//FileUtils.copyFile(scrFile, new File("./Screenshot/"+dateformat +"/Failure/" +testName+".png"));
			//log.info("Screenshot is stored : " + "./Screenshot/"+dateformat +"/Failure/" +testName+".png");
			
			//extent_logger.log(LogStatus.FAIL , extent_logger.addScreenCapture(System.getProperty("user.dir") + "./Screenshot/"+dateformat +"/Failure/" +testName+".png"));
		} catch (IOException e) {
			log.error(e.getLocalizedMessage());
		}

	}

}
