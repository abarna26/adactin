package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepsdefinition", dryRun = false, monochrome = true, plugin = {"json:src\\test\\resources\\Reports\\Adactinhotel.json","rerun:src\\test\\resources\\FailedScenario\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void afterclass() {
		JvmReport.generateJvmReport(
				"C:\\Users\\user\\eclipse-workspace1\\Cucumberr\\src\\test\\resources\\Reports\\Adactinhotel.json");

	}

}
