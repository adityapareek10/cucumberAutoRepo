package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class ShareDataStepDef1 {
	WebDriver driver;

	public ShareDataStepDef1(SharedClass share) {
		driver = share.setup();
	}

	@Then("^User Checks User \"([^\"]*)\" First Name is present$")
	public void user_Checks_User_First_Name_is_present(String firstName) throws InterruptedException {
		String actualUserName = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals(firstName, actualUserName);
		Thread.sleep(2000);
	}

	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(surName);
		Thread.sleep(2000);
	}

	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='login']")).getText();
		// Assert.assertEquals("", actualMobile);
		Thread.sleep(2000);
	}

}
