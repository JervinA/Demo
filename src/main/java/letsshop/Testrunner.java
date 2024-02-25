package letsshop;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"Resources/Features/Letsshop.feature"}, glue= {"stepDefinitions"}, monochrome = true, plugin = {"html:target/cucumberreport.html"})

public class Testrunner extends AbstractTestNGCucumberTests {
	
	
	

	
	
}
