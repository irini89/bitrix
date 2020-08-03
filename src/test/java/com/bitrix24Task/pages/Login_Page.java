package com.bitrix24Task.pages;

import com.bitrix24Task.utilities.ConfigurationReader;
import com.bitrix24Task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_Page extends com.bitrix24Task.pages.BasePage {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);

    // LOGIN WebElements

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    //

    public void login() {

        wait.until(ExpectedConditions.visibilityOf(userNameBox)).sendKeys(ConfigurationReader.getProperty("username1"));
        wait.until(ExpectedConditions.visibilityOf(passwordBox)).sendKeys(ConfigurationReader.getProperty("password2"));
        loginButton.click();

    }




}
