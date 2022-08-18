package pageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;

public class Wiki_Page extends BaseClass {
	public Wiki_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement SearchMovie;
	
	@FindBy(xpath="(//div[@class='plainlist'])[4]")
	private WebElement ReleaseDate;
	
	@FindBy(xpath="//th[text()='Country']//following-sibling::td")
	private WebElement Country;

	public WebElement getSearchMovie() {
		return SearchMovie;
	}

	public WebElement getReleaseDate() {
		return ReleaseDate;
	}

	public WebElement getCountry() {
		return Country;
	}
	
	
	
	
	
	
}
