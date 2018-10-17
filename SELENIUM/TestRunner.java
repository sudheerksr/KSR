package com.lps.functinal.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\MAVENPROJECT\\CUCUMBERBDD\\src\\main\\java\\com\\lps\\functinal\\feature\\dealsmap.feature", //the path of the feature files
		glue={"com\\lps\\functinal\\stepdefinition"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false
		
				)
public class TestRunner {

}
