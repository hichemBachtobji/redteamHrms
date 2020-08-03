package com.RedTeamHrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.RedTeamHrms.utils.configsReader;
import com.RedTeamHrms.utils.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver setUp() {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		
		configsReader.readProperties(constants.CONFIGURATION_FILEPATH);
		
		switch(configsReader.getProperty("browser")) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
		case "firefox":
			driver= new FirefoxDriver();
			break;
		
		}
		driver.manage().timeouts().implicitlyWait(constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(configsReader.getProperty("url"));
		pageInitializer.initialize();
		return driver;
		
	}
	
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
		
	}

}
