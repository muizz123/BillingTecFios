package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class LoginPage extends BasePage{

	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[@name='login']")
	WebElement button;
	
	public  LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void userName() {
		String user_Name = pro.getProperty("userName");
		userName.sendKeys(user_Name);
	}
	public void password() {
		String passwor = pro.getProperty("password");
		password.sendKeys(passwor);
	}
	public void button() {
		button.click();
	}
	public void landingHomePage() {
		userName();
		password();
		button();
	}
	public String getHomePageTitle() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
	}
	
}
