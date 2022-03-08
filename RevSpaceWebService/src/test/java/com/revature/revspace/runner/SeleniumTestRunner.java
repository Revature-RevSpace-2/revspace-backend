package com.revature.revspace.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/Notifications.feature"},
		//features = {"feature"},
		glue = {"com.revature.revspace.gluecode"}
		)
public class SeleniumTestRunner {

}
