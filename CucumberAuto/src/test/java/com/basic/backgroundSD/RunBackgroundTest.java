package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/backgroundFF" },		
		glue = { "com/basic/backgroundSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport1", "json:target/cucumber-report_1.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunBackgroundTest {

}
