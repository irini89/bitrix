package com.bitrix.pages;

import com.bitrix.utilities.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public LoginPage() {//constructor

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordElement;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButtonElement;

    public void login(String userName, String Password) {

        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(Password);
        loginButtonElement.click();

    }
}