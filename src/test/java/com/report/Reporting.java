package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		File file = new File("C:\\Users\\shank\\eclipse-workspace\\Cucumber\\target");
		Configuration configuration = new Configuration(file, "Insta Login");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("browser version", "109");
		configuration.addClassifications("os", "WIN11");
		configuration.addClassifications("Testing", "Reg");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		System.out.println("Parthi");

	}
}
