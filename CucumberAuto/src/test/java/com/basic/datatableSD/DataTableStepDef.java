package com.basic.datatableSD;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DataTableStepDef {
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Work Learn\\Projects\\Cucumber setUp\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("^User enter user \"([^\"]*)\" First Name$")
	public void user_enter_user_First_Name(String userName) throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
	    Thread.sleep(2000);
	    }

	@Then("^User Checks User \"([^\"]*)\" First Name is present$")
	public void user_Checks_User_First_Name_is_present(String firstName) throws InterruptedException  {
		String actualUserName = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals(firstName, actualUserName);
		Thread.sleep(2000);
	}

	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException {
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(surName);
	   Thread.sleep(2000);
	}

	@But("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws InterruptedException  {
		driver.findElement(By.xpath("//button[@name='login']")).getText();
		//Assert.assertEquals("", actualMobile);   
		Thread.sleep(2000);
	}

	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		driver = null;
	}
	
	@When("^Enter following data$")
	public void Enter_following_data(DataTable table) {
		List<List<String>> data = table.asLists();
		
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);
		String value3 = data.get(1).get(0);	
		String value4 = data.get(1).get(1);
		String value5 = data.get(2).get(0);
		String value6 = data.get(2).get(1);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value3);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(value4);
		
	}


}
