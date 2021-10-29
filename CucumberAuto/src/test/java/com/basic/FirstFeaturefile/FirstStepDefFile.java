package com.basic.FirstFeaturefile;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FirstStepDefFile {
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Work Learn\\Projects\\Cucumber setUp\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("^User enter user First Name$")
	public void user_enter_user_First_Name() {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aditya.pareek10@gmail.com");
	}

	@Then("^User Checks User First Name is present$")
	public void user_Checks_User_First_Name_is_present()  {
		String actualUserName = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals("aditya.pareek10@gmail.com", actualUserName);
	}

	/*@When("^User enters user surname$")
	public void user_enters_user_surname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}*/



}
