package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class lert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		ScreenShot("tecfios");
		
	}
	public static void ScreenShot(String url) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("screenShot/"+url+".png"));
	
	}

}
