package com.bitrix.step_definitions;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Configuration_Reader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {


    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();


    }

    @After
    public void tearDown() {
        //if test failed, take a screenshot
        /**
        if( scenario.isFailed()){
            BrowserUtils.takeScreenshot();
        }
         Driver.closeDriver();
         */
    }


}
