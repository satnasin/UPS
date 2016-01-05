package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSetup
{
	static WebDriver driver;

	public static WebDriver startBrowser(String browserName,String appURL) 
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("Launching Chrome browser..");
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			System.out.println("Launching Firefox browser.."); 
			
		}
		
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void WebDriversetOff()
	{
		driver.close();
	}
	
	
}
