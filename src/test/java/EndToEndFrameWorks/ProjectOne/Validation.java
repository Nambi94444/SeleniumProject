package EndToEndFrameWorks.ProjectOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resourse.HomePageObjects;

public class Validation extends Base {
	WebDriver driver;

	@BeforeTest
	public void HomePageCode() throws IOException {

		driver = DriverInitialation();

		driver.get(Details.getProperty("URL"));
	}

	@Test
	public void validation() throws IOException {

		HomePageObjects HomePage = new HomePageObjects(driver);
		System.out.println(HomePage.FeaturedCourseText().getText());
		Assert.assertEquals(HomePage.FeaturedCourseText().getText(), "FEATURED COURSsES");
		Assert.assertTrue(HomePage.NavigationBar());

	}

	@AfterTest
	public void end() {
		driver.close();
	}

}
