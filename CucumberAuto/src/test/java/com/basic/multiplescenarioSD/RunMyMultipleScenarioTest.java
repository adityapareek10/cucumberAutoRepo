package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/multiplescenarioFF/" },		
		glue = { "com/basic/multiplescenarioSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport7", "json:target/cucumber-report_7.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunMyMultipleScenarioTest {

}
