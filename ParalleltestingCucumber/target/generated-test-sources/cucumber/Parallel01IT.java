import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/shima/workspace/ParalleltestingCucumber/src/test/java/Features/test2.feature"},
        plugin = {"json:C:/Users/shima/workspace/ParalleltestingCucumber/target/cucumber-parallel/1.json", "html:C:/Users/shima/workspace/ParalleltestingCucumber/target/cucumber-parallel/1"},
        monochrome = true,
        tags = {"@Smoke3"},
        glue = {"StepDefinition"})
public class Parallel01IT {
}
