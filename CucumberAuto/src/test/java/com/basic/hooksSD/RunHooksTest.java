package com.basic.hooksSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/hooksFF" },		
		glue = { "com/basic/hooksSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport5", "json:target/cucumber-report_5.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunHooksTest {

}
