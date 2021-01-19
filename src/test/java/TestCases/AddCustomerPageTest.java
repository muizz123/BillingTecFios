package TestCases;

import java.io.IOException;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.BasePage;
import PageFactory.AddCustomerPage;
import PageFactory.HomePage;
import PageFactory.LoginPage;

public class AddCustomerPageTest extends BasePage {

	HomePage homepage;
	LoginPage loginPage;
	AddCustomerPage addCustomer;

	public AddCustomerPageTest() throws IOException {
		super();

	}

	@BeforeTest
	public void initilizationBrowsewr() throws IOException {
		initilization();
		loginPage = new LoginPage();
		loginPage.landingHomePage();
		homepage = new HomePage();
		addCustomer = new AddCustomerPage();
	}

	@Test(priority = 1)
	public void fullName() {
		homepage.getAddcustomerPage();
		addCustomer.fullName("TechFios2021");
		addCustomer.company();
	}


	@AfterTest
	public void tearDown() {
		browserQuit();
	}

}
