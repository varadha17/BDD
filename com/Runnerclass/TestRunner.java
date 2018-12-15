package com.Runnerclass;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "C:\\Users\\name\\eclipse-workspace\\google\\src\\main\\java\\com\\FeatureFile\\conig.feature"
		,glue= {"com.stepDefinition"}
		,format= {"pretty","html:test-output", "junit:junit_xml/cucumber.xml"}
		,monochrome = true
		,dryRun = false

		)

public class TestRunner {
	

}
