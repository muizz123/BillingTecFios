package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.BasePage;
import PageFactory.LoginPage;

public class LoginPageTest extends BasePage {

	LoginPage loginpage;
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeTest
	public void launchBrowser() throws IOException {
		initilization();
		loginpage = new LoginPage();
		
	}
	@Test(priority = 1)
	public void validatingLoginPageTest() {
		String title = loginpage.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Login - iBilling");
		
	}
	@Test (priority = 2)
	public void loginFeatureTest() {
		loginpage.landingHomePage();
		String homePageTitle = loginpage.getHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Dashboard- iBilling");
	}
	@AfterTest
	public void tearDown() {
		browserQuit();
	}
}
