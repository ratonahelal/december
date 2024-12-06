package Runner;

import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/feature/DisableButton.feature" }, glue = {
"stepdefinition" }, tags = "", plugin = { "html:target/cucumber-reports.html" })



public class CucumberRunner extends AbstractTestNGCucumberTests {

}
