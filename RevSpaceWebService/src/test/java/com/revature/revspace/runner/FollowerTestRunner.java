package com.revature.revspace.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/UserLogin.feature"},
		glue = {"com.revature.revspace.gluecode"}
		)
public class FollowerTestRunner {

}
