package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.io.IOException;


public class AppHooks {

    @Before           //when you have same steps for all senarios
    public  void openBrowser() throws IOException {
        System.out.println("-------open browser------");

        String browser = UtilityClass.getPFData("browserName");        //get browser name from property file
        DriverFactory.initializeBrowser(browser);                          //pass browser name to initializeBrowser() method
    }

    @After
    public  void closeBrowser()
    {
        System.out.println("-------close browser--------");

        //DriverFactory.driver.quit();
    }



    //Befor and After Hook
//    @Before(order = 1)           //Before hook orders runs from low order to high  1 then 2
//    public void beforeHook1()
//    {
//        System.out.println("beforeHook1");
//    }
//
//    @Before(order = 2)
//    public void beforeHook2()
//    {
//        System.out.println("beforeHook2");
//    }
//
//    @After(order = 1)                 //After hook orders runs from high to low 2 then 1
//    public void afterHook1()
//    {
//        System.out.println("afterHook1");
//    }
//
//    @After(order = 2)
//    public void afterHook2()
//    {
//        System.out.println("afterHook2");
//    }


//    @BeforeStep          // befor and after each steps
//    public void beforeStep()
//    {
//        System.out.println("before step");
//    }
//
//    @AfterStep
//    public void afterStep()
//    {
//        System.out.println("after step");
//    }
}
