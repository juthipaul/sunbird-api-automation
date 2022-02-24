package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/org.feature",
		glue= {"StepDefinations.StepDefination"},
		tags= {"@org"},
		plugin ={"html:target/cucumberHTMLReport","json:target/jsonReports/cucumber-report.json"}
)
public class TestRunner {
}
