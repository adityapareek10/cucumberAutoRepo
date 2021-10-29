package com.basic.parameterizaionSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/ParameterizationFF" },		
		glue = { "com/basic/parameterizaionSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport9", "json:target/cucumber-report_9.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunparameterizaionTest {

}
