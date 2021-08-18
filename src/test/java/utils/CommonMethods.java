package utils;


import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CommonMethods {
	
	public static WebDriver driver;
	
	public static void setUp() {
		ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		if ("chrome".equals(ConfigReader.getPropertyValue("browser"))) {
			WebDriverManager.chromedriver().setup();
		/*if ("Firefox".equals(ConfigReader.getPropertyValue("browser"))) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver","/Users/Raghav/Downloads/geckodriver.exe");
					WebDriver driver = new FirefoxDriver();*/
		}

	}

}
