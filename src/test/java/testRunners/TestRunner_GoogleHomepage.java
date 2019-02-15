package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features", glue="")
public class TestRunner_GoogleHomepage {
 
}
