package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ShareDataStepDef {
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) {
		driver=share.setup();
	}

	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Work Learn\\Projects\\Cucumber
		// setUp\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter user \"([^\"]*)\" First Name$")
	public void user_enter_user_First_Name(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
		Thread.sleep(2000);
	}

}
