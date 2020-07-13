package com.bitrix.step_definitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Configuration_Reader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginBitrix {
    LoginPage login = new LoginPage();


    @Given("user logs on the login page")
    public void user_logs_on_the_login_page() {

        Driver.getDriver().get(Configuration_Reader.getProperty("url"));

    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {

        login.login(string, string2);

    }

    @Then("user enters dashpage")
    public void user_enters_dashpage() {
        Assert.assertTrue("Title is wrong",Driver.getDriver().getTitle().contains("Portal"));
    }


}







