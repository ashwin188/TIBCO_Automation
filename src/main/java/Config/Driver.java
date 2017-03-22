package Config;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
	
	public static WebDriver driver;

	public static WebDriver getDriver(String type) throws Exception {
		if(type.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette","./TIBCO_Selenium/Drivers/Firefox/geckodriver.exe");
			 driver = new FirefoxDriver();
			return driver;
			
			
			
		}else if(type.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./TIBCO_Selenium/Drivers/Firefox/geckodriver.exe");
			driver = new ChromeDriver();
			return driver;
		
			
			
		}
			throw new Exception("Invalid driver type " + type + "!");	
		}
	
}