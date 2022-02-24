package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		plugin ={"html:target/cucumberHTMLReport","json:target/jsonReports/cucumber-report.json"},
		glue= {"src/test/java/stepDefinations"}
)
public class TestRunner {
}
