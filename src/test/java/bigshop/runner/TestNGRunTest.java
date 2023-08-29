package bigshop.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/bigshop"},
        glue = {"bigshop.step_definitions", "bigshop.hooks"},
        monochrome = true,
        tags = "@Search",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                "junit:test-output/cucumber-reports/Cucumber.xml",
                "html:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class TestNGRunTest extends AbstractTestNGCucumberTests {
}
