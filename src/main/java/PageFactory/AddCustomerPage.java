package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class AddCustomerPage extends BasePage{

	@FindBy(xpath="//input[@id='account']")
	WebElement fullName;
	@FindBy(xpath="//select[@id='cid']")
	WebElement company;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	@FindBy(xpath="//select[@id='country']")
	WebElement country;

	
	
	
	public AddCustomerPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public void fullName(String name) {
		explicitWait(fullName);
		fullName.sendKeys(name);
	}
	public void company() {
		explicitWait(company);
		company.click();
	}
	public void email() {
		email.sendKeys("myemail@gmail.com");
	}
	public String getAddcustomerPage() {
		String addCustomerPagetitle = driver.getTitle();
		return addCustomerPagetitle;
	}

}
