package com.basic.datatableSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun = true,
		features = { "src/test/resources/com/basic/DataTableFF" },		
		glue = { "com/basic/datatableSD" },
		plugin = { "pretty", "html:target/cucumber-htmlreport3", "json:target/cucumber-report_3.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class RunDataTableTest {

}
