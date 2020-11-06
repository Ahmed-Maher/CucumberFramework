package MyRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature/contacts.feature",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json" }
)

public class TestRunner {

}
