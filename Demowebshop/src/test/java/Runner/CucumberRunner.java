package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/Cart.feature" }, glue = {
"stepdefinition" }, tags = "", plugin = { "html:target/cucumber-reports.html" })

public class CucumberRunner extends AbstractTestNGCucumberTests {

}


