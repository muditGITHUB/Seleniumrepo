package com.Maven.noJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class helloMaven {
	@Test
	public void f() {

		System.out.println("First maven program");

		// Point to external browser drivers
		System.setProperty("webdriver.gecko.driver",
				"D:\\study\\Automation Testing\\Selenium\\1_Setup\\Seleniumhq\\BrowserDrivers\\geckodriver.exe");

//		FirefoxOptions options = new FirefoxOptions();
//		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

//		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		dc.setCapability("marionette", true);
//		WebDriver Fdriver =  new FirefoxDriver(dc);
	
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("moz:firefoxOptions", options);
//		// set more capabilities as per your requirements
//		FirefoxDriver Fdriver = new FirefoxDriver(capabilities);
		
		FirefoxDriver Fdriver = new FirefoxDriver();

		// Maximize window
		Fdriver.manage().window().maximize();

		// Open URL
		Fdriver.get("http://www.seleniumpoint.com/testwebsite.php");
	}
}
