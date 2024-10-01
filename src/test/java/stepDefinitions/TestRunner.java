package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Resources/Features/LoginCheck.feature", glue={"stepDefinitions"},
monochrome=true,
plugin= {"html:target/cucumberReport.html"}
)

public class TestRunner {
	
	

}
