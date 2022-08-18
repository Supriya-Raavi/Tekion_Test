package pageLibrary;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import GenericLibrary.BaseClass;

	public class Imdb_page extends BaseClass {
		public Imdb_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@type='text']")
		private WebElement SearchMovie;
		
		@FindBy(xpath="(//div[@class='findSection']/table//tr[1]/td[2]/a)[1]")
		private WebElement MovieTitle;
		
		@FindBy(xpath="(//a[@href='/title/tt9389998/releaseinfo?ref_=tt_dt_rdat'])[2]")
		private WebElement ReleaseDate;
		
		@FindBy(xpath="//span[text()='Country of origin']//parent::li/div/ul/li/a")
		private WebElement CountryOfOrigin;

		public WebElement getSearchMovie() {
			return SearchMovie;
		}

		public WebElement getMovieTitle() {
			return MovieTitle;
		}

		public WebElement getReleaseDate() {
			return ReleaseDate;
		}

		public WebElement getCountryOfOrigin() {
			return CountryOfOrigin;
		}
		
		
		
		
		
		
		
		
		
		
		

}
