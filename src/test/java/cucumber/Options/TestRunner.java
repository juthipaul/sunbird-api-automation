package cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//features = "src/test/java/features/question.feature",
		//glue= { "stepDefinitions/"},
		//tags= {"@question"},
		//plugin= {"json:target/jsonReports/cucumber-report.json"}
	
		features = "features"
		,glue={"stepDefinitions"}
		,dryRun = true
	
)
public class TestRunner {

}
