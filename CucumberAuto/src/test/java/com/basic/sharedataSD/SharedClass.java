package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedClass {
	WebDriver driver;

	@Before
	public WebDriver setup() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Work Learn\\Projects\\Cucumber setUp\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		driver=null;
	}

}
