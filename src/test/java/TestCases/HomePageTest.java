package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.BasePage;
import PageFactory.AddCustomerPage;
import PageFactory.HomePage;
import PageFactory.LoginPage;

public class HomePageTest extends BasePage {

	LoginPage loginPage;
	HomePage homePage;
	AddCustomerPage addCustomer;

	public HomePageTest() throws IOException {
		super();

	}

	@BeforeTest
	public void browserInitilization() throws IOException {
		initilization();
		loginPage = new LoginPage();
		loginPage.landingHomePage();
		homePage = new HomePage();
		addCustomer = new AddCustomerPage();
	}

	@Test(priority = 1)
	public void validatingHomePageTest()  {
		String homePageTitle = loginPage.getHomePageTitle();
		Assert.assertEquals(homePageTitle, "Dashboard- iBilling");

		/*
		 * String addCustomerPageTitle = homePage.getAddcustomerPage();
		 * Assert.assertEquals(addCustomerPageTitle, "Contacts - iBilling");
		 */
	}

	@Test(priority = 2)
	public void gettingAddCustomerPageTest() throws InterruptedException  {
		
		 homePage.landingAddcustomer();
		 addCustomer .getAddcustomerPage();
		 
		 
			/*
			 * String addCustomerPageTitle = driver.getTitle();
			 * Assert.assertEquals(addCustomerPageTitle, "Contacts - iBilling");
			 */

	}

	@AfterTest
	public void tearDown() {
		browserQuit();
	}

}
