package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\nafas\\Desktop\\sohag\\eBayBDD\\eBayCucumber\\src\\test\\java\\feature\\Register.feature"},
        glue={"stepDefinitions"},
        format = {"pretty","json:report/cucumber.json","html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        tags = {"@FunctionalTest"},
        dryRun = false




)






public class RunnerTest {
}
