package EndToEndFrameWorks.ProjectOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resourse.HomePageObjects;
import Resourse.LoginPageObject;

public class BasePageNavigation extends Base {
	WebDriver driver;

// @Parameters("URL")
	@BeforeTest
	public void starter() throws IOException {
		driver = DriverInitialation();

		driver.get(Details.getProperty("URL"));
	}

	@Test(dataProvider = "Datag")
	public void basePageNavigation(String A, String G) throws IOException {

		HomePageObjects HomePage = new HomePageObjects(driver);
		HomePage.LogIn().click();
		LoginPageObject LoginPage = new LoginPageObject(driver);
		LoginPage.EmailIdElement().sendKeys(A);
		LoginPage.Password().sendKeys(G);
		LoginPage.Mover();
		System.out.println("All Done");
		System.out.println("Uploading change in new Branch");

	}

	@DataProvider(name = "Datag")
	public Object[][] getData() {
		Object[][] Data = new Object[2][2];
		Data[0][0] = "Nambi";
		Data[0][1] = "1134";
		Data[1][0] = "Rajan";
		Data[1][1] = "345678";
		return Data;

	}

	@AfterTest
	public void closer() {
		driver.close();
	}

}
