package vagrant.test;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadProperty;
import pageLibrary.CommonLibrary;
import pageLibrary.Imdb_page;
import pageLibrary.Wiki_Page;

public class Imdb_test extends BaseClass {
	static String ReleaseDateInImdb;
	static String CountryInImdb;

	@Test(priority=1)
	public void getMovieDetailsInImdb() throws InterruptedException, IOException {
		Imdb_page ip=new Imdb_page(driver);
		 CommonLibrary	 obj1 = new CommonLibrary(driver);
		 driver.get(ReadProperty.readValue("ImdbUrl"));
		obj1.enterText(ip.getSearchMovie(), ReadProperty.readValue("Movie_Name"));
		obj1.WebDriverWait_And_Click(ip.getMovieTitle());
		obj1.WebDriverWait1(ip.getReleaseDate());
		 ReleaseDateInImdb = ip.getReleaseDate().getText();
		obj1.WebDriverWait1(ip.getCountryOfOrigin());
		 CountryInImdb = ip.getCountryOfOrigin().getText();


	}
	
	

}
