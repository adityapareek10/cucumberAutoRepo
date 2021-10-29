package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DemoStepDef {
	
	WebDriver driver = null;
	@Given("^User need to be on demo site page$")
	public void user_need_to_be_on_demo_site_page()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Work Learn\\Projects\\Cucumber setUp\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("^User enter first name$")	
	public void user_enter_firsr_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Babu");
		Thread.sleep(2000);
	}
	
	@When("^User enter last name$")	
	public void user_enter_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rao");
		Thread.sleep(2000);
	}


}
