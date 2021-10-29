package com.basic.sharedataSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/sharedataFF" },		
		glue = { "com/basic/sharedataSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport6", "json:target/cucumber-report_6.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunShareDataTest {

}
