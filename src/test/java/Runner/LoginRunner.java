package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//        features = {"C:\\rest practice\\student\\BDD_Cucumber\\src\\test\\java\\Features\\Ex2_LoginToApp_MultipleScenario.feature",
//                    "C:\\rest practice\\student\\BDD_Cucumber\\src\\test\\java\\Features\\Ex1_LoginToApp_SingleScenario.feature"},

        features = "C:\\rest practice\\student\\BDD_Cucumber\\src\\test\\java\\Features_Pratice\\Ex1_LoginToApp_SingleScenario.feature",
        glue = {"Steps","Hooks"}


        //To generate Report we use publish = true, AND to access that reportany time use pretty plugin
        //publish = true,                                                            //to generate Report it will store till 24hrs
       // plugin = {"pretty","html:report/cucumber-reports/SampleReport.html"}     //for permenant report that we can access any time use pretty plugin
       // plugin = {"rerun:target/FailedSenariosFiles/failed.txt"}                   // to rerun failed test cases use rerun plugin
        //dryRun = true                              // it will just check the Step Defination available or not for each steps in feature file ,
                                                     // if available it will give true or else false show msg SD Not available
        //tags = "@Performance",                      //for single tag
        //tags = "@Sanity or @Smoke or @Performance"  //when you have to run MULTIPLE TEST CASES Using TAGS use "or"
        //tags = "@Sanity and @Stability"             //it checks both the tags are available in TC if both are available then only it works
        //tags = "not @Smoke"                         //except @Smoke it will run all other test cases using "not"
)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
