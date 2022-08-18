package vagrant.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ReadProperty;
import pageLibrary.CommonLibrary;
import pageLibrary.Wiki_Page;

public class Wiki_test extends BaseClass{
	@Test(priority=2)
	public void getMovieDetailsWiki() throws IOException, InterruptedException {
		Wiki_Page wp=new Wiki_Page(driver);
		CommonLibrary	 obj1 = new CommonLibrary(driver);
		driver.get(ReadProperty.readValue("WikiUrl"));
		obj1.WebDriverWait1(wp.getReleaseDate());
		String RelaseDateInWiki = wp.getReleaseDate().getText();
		String CountryInWiki = wp.getCountry().getText();
		String releaseDateInImdb = Imdb_test.ReleaseDateInImdb;
		String countryInImdb = Imdb_test.CountryInImdb;
		Assert.assertEquals(releaseDateInImdb, RelaseDateInWiki);
		Assert.assertEquals(countryInImdb, CountryInWiki);


		

	}
}
