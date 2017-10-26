package intshop.intshop_poc_cuke.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = { "intshop.intshop_poc_cuke.steps"},
        features = "src\\test\\java\\intshop\\intshop_poc_cuke\\features\\webdriver_check\\"
)

public class RunWebdriverChecksTest {
}
