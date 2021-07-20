package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonfile) {
		File reportDirectory =new File("C:\\Users\\user\\eclipse-workspace1\\Cucumberr\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(reportDirectory, "Adactin_hotel");
		configuration.addClassifications("OS","Window10");
		configuration.addClassifications("browser", "Chrome");
		configuration.addClassifications("browser_version", "91");
		configuration.addClassifications("sprint", "4");
		List<String>jsonFile = new ArrayList<String>();
		jsonFile.add(jsonfile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFile, configuration);
		reportBuilder.generateReports();
}
	
}
