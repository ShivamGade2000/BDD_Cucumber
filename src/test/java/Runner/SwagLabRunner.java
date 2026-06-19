package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "C:\\rest practice\\student\\BDD_Cucumber\\src\\test\\java\\Features",
        glue = {"Steps","Hooks"},
        tags = "@ProductE2E",
        publish = true,
        plugin = {"pretty","html:report/cucumber-reports/SwagLabReport.html"}

)
public class SwagLabRunner extends AbstractTestNGCucumberTests {
}
