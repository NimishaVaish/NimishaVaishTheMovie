package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features//Movie.feature",
        glue = "src.test.java.stepdefinitions",
        dryRun = true,
        monochrome = true,
        strict = true,
        plugin = {"pretty","html:test-output"}
)
public class Runner {


}
