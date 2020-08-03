package com.bitrix24Task.runners;

import com.bitrix24Task.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("-----> Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabaseConnection(){
        System.out.println("--------> BEFORE ANNOTATION: DB CONNECTION CREATED <------");
    }

    @After(order = 1)
    public void tearDownScenario(Scenario scenario){

        //#1 we need to take a screen shot using Selenium
        // #2 we are going to attach it into our report using attach method
        //attach method accept 3 arguments:
                //1)screenshot; 2) image type; 3) current scenario's name
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


    }

    @After(value = "@db", order = 2 )
    public void tearDownDatabaseConnection(){
        System.out.println("--------> AFTER ANNOTATION: DB CONNECTION CLOSED <------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("===========> BEFORESTEP: TAKING SCREENSHOT <===========");

    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("===========> AFTERSTEP: TAKING SCREENSHOT <===========");

        Driver.closeDriver();
    }



}