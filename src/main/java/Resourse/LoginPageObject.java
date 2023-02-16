package Resourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import EndToEndFrameWorks.ProjectOne.Base;

public class LoginPageObject extends Base {

	WebDriver driver;
	private By EmailIdTextBox = By.cssSelector("#user_email");
	private By PassWordTextBox = By.cssSelector("#user_password");
	private By LoginButtonINLoginPagee = By.cssSelector(".btn.btn-primary.btn-md.login-button");
	

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement EmailIdElement() {
		return driver.findElement(EmailIdTextBox);
	}

	public WebElement Password() {
		return driver.findElement(PassWordTextBox);
	}

	/*public WebElement LoginButtonInPage() {

		return driver.findElement(LoginButtonINLoginPagee);

	}*/
	public void Mover() {
		WebElement LoginButtonINLoginPageee = driver
				.findElement(By.cssSelector(".btn.btn-primary.btn-md.login-button"));
		Actions N = new Actions(driver);
		N.moveToElement(LoginButtonINLoginPageee).click().build().perform();
		
	}

}
