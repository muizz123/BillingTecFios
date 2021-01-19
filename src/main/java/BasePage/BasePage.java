package BasePage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.TimeConfig;

public class BasePage {

	public static WebDriver driver;
	public static Properties pro;
	
	public BasePage() throws IOException {
		
		pro = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\Config\\AppConfig.properties");
	   pro.load(fis);
		
	}
	public void initilization() {
		String browser = pro.getProperty("browser");
		String url = pro.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TimeConfig.pageLoadOut, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TimeConfig.implicitWait, TimeUnit.SECONDS);
	} 
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void browserQuit() {
		driver.quit();
	}
}
