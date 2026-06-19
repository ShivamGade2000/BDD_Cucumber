package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/FailedSenariosFiles/failed.txt",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:report/cucumber-reports/SampleReport.html"}

)


public class LoginRunner2_ExecuteOnlyFailedSenario extends AbstractTestNGCucumberTests {

}
