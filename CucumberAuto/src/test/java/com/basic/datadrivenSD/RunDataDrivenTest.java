package com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/DataDrivenFF" },		
		glue = { "com/basic/datadrivenSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport2", "json:target/cucumber-report_2.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunDataDrivenTest {

}
