package au.com.towbulls.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report/"},
        features = "src/test/resources/features"
        ,glue={"au.com.towbulls.stepdef"
        }
       // ,dryRun = true
)
/**
 * Created by jacobg on 24/06/2018.
 */
public class RunCukesTest {
    RunCukesTest() {
        System.out.println("##############################################");

    }
}