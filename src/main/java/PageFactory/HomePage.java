package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePage.BasePage;

public class HomePage extends BasePage{
	
	@FindBy(xpath="//span[text()='Customers']")
	WebElement customer;
	
	@FindBy(xpath="//a[text()='Add Customer']")
	WebElement addCustomer;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickCustomer()  {
		
		Actions action = new Actions(driver);
		explicitWait(customer);
		action.moveToElement(customer);
		customer.click();
		
	}
	public void clickAddcustomer() {
		addCustomer.click();
	}
	public void landingAddcustomer()  {
		clickCustomer();
		explicitWait(addCustomer);
		clickAddcustomer();
	}
	public String getAddcustomerPage() {
		landingAddcustomer();
		String addCustomerPagetitle = driver.getTitle();
		return addCustomerPagetitle;
	}

}
