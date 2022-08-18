
package pageLibrary;



import GenericLibrary.BaseClass;


import java.io.File;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonLibrary {
	
	 WebDriver driver;
	

	public CommonLibrary(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[class='icon' and contains(text(),'Top')]")
	private WebElement TopIcon;
	
	
	public  void enterText(WebElement element,String Uname) {
		element.sendKeys(Uname,Keys.ENTER);
	}
	
	public  void setPassword(WebElement element1,String pass) {
		element1.sendKeys(pass);
	}
	
	public  void click(WebElement element) {
		element.click();
	}
	
	public void switchTOChildWindow(WebElement childlink) {
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(parent)) {
				driver.switchTo().window(string);
			}
		}
		childlink.click();
		

	}



	public void NavigateBack() {
		driver.navigate().back();
	}
	
	
		  public void scrollDown(WebDriver driver) throws Exception
		  {
			  JavascriptExecutor js = (JavascriptExecutor)driver; 
			  js.executeScript("window.scrollBy(0,500)");
		  }
		  
		  public void scrollUp(WebDriver driver) throws Exception
		  {
			  JavascriptExecutor js = (JavascriptExecutor)driver; 
			  js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			  TopIcon.click();	  
			  System.out.println("clicked on top link");
		  }
		  
		  public  void javaScriptClick(WebElement ele) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", ele);

			}
		  public void WebDriverWait_And_Click(WebElement ele) {
			WebDriverWait waits=new WebDriverWait(driver, 500);
			waits.until(ExpectedConditions.elementToBeClickable(ele)).click();	

		}
		  public void WebDriverWait1(WebElement ele) {
				WebDriverWait waits=new WebDriverWait(driver, 500);
				waits.until(ExpectedConditions.elementToBeClickable(ele));	

			}
	  }
		  
				

