package com.basic.tagsSD;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		tags = "@Smoke or @Regression",
		features = { "src/test/resources/com/basic/tagsFF" },		
		glue = { "com/basic/tagsSD" },
		plugin = { "pretty", 
				"html:target/cucumber-htmlreport10", 
				"json:target/cucumber-report_10.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish=true

)

public class RunTagsTest {

}
