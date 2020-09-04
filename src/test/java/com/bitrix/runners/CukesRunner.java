package com.bitrix.runners;

import com.bitrix.pages.LoginPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",//features content root
        glue = "com/bitrix/step_definitions", //glue source root
        dryRun = false,
        tags = "@announcement"

)


public class CukesRunner {


}
