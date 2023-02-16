package Resourse;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import EndToEndFrameWorks.ProjectOne.Base;

public class HomePageObjects extends Base {
	
	
	WebDriver driver;
	By LoginHomeButton = By.cssSelector("a[href = 'https://rahulshettyacademy.com/sign_in/']");
	
	By FeaturedCourse = By.cssSelector(".text-center");
	By NavigationBarElement = By.cssSelector(".nav.navbar-nav.navbar-right");
	
public HomePageObjects(WebDriver driver) {
	this.driver=driver;
}
	
	public WebElement LogIn() {
		return driver.findElement(LoginHomeButton);
		//WebElement 	LoginHomeButtonn = driver.findElement(By.cssSelector("a[href = 'https://rahulshettyacademy.com/sign_in/']"));
		//Actions A = new Actions(driver);
		//A.moveToElement(LoginHomeButtonn).click().build().perform();
		
	}
	
	public WebElement FeaturedCourseText() {
		return driver.findElement(FeaturedCourse);
	}
	
	public boolean NavigationBar() {
		return driver.findElement(NavigationBarElement).isDisplayed();
	}

	
	

}
