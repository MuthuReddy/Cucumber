package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions(stepNotifications=true,publish=true,snippets=SnippetType.CAMELCASE,plugin = {"pretty","json:target/index.json"},features="src/test/resources",glue="com.stepdefinition")

public class TestRunner {
	@AfterClass
    public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\shank\\eclipse-workspace\\Cucumber1\\target\\index.json");

}

}