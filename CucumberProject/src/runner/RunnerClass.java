package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //ctrl+shoft+o - import all the jars
@CucumberOptions(features ="Features", glue = {"stepDefinition"}) //features foldername and packagename


public class RunnerClass {
	
	
}
