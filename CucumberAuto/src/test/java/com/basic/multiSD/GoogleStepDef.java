package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleStepDef {
	
	WebDriver driver = null;
	@Given("^User need to be on Google page$")
	public void user_need_to_be_on_google_page()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Work Learn\\Projects\\Cucumber setUp\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("^User enter search String$")
	
	public void user_enter_search_string() throws InterruptedException {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
	}

}
