package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/java/features/question.feature",
		glue= { "stepDefinitions/"},
		tags= {"@question"},
		plugin= {"json:target/jsonReports/cucumber-report.json"}
		
)
public class TestRunner {

}
