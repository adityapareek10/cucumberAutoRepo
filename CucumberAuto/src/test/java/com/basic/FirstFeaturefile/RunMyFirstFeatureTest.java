package com.basic.FirstFeaturefile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/firstFeatureFileFF/" },		
		glue = { "com/basic/FirstFeaturefile" },
		plugin = { "pretty", "html:target/cucumber-htmlreport4", "json:target/cucumber-report_4.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunMyFirstFeatureTest {

}
