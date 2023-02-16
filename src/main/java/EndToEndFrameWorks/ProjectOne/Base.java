package EndToEndFrameWorks.ProjectOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {

	public WebDriver driver;

	public Properties Details;
	static ExtentReports N;

	public WebDriver DriverInitialation() throws IOException {
		Details = new Properties();
		FileInputStream Filee = new FileInputStream(
				"D:\\Training\\Selenium\\EndToEndFrameWork\\ProjectOne\\src\\main\\java\\EndToEndFrameWorks\\ProjectOne\\Data.properties");
		Details.load(Filee);
    
		String browserName = Details.getProperty("Browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

		return driver;

	}

	public void getScreenShot(String method, WebDriver driver) throws IOException {
		TakesScreenshot ScreenShot = (TakesScreenshot) driver;
		File scrr = ScreenShot.getScreenshotAs(OutputType.FILE);
		String Location = System.getProperty("user.dir") + "\\report\\" + method + ".png";
		FileUtils.copyFile(scrr, new File(Location));
	}

	public static ExtentReports EntentReportListner() {
		   System.out.println("Senthilan");
		String Location = System.getProperty("user.dir") + "\\report\\" + "index.html";
		ExtentSparkReporter ReportsCreated = new ExtentSparkReporter(Location);
		ReportsCreated.config().setDocumentTitle("QAAccademey");

		 N = new ExtentReports();
		N.attachReporter(ReportsCreated);
		return N;

	}

}
