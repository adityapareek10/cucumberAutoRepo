package com.basic.multiSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/multiFF" },		
		glue = { "com/basic/multiSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport8", "json:target/cucumber-report_8.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunMultiTest {

}
