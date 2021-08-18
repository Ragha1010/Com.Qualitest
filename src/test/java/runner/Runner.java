package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Raghav/eclipse-workspace/com.cucumber/src/test/resources/features/HomePage.feature", glue = "steps",
                dryRun = false,
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"}
)
public class Runner {
}
