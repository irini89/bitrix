package com.bitrix.step_definitions;

import com.bitrix.pages.ActiveStreamPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Configuration_Reader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActiveStreamStepDefinitions {
    LoginPage login = new LoginPage();
    ActiveStreamPage activeStreamPage = new ActiveStreamPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

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
        Assert.assertTrue("Title is wrong", Driver.getDriver().getTitle().contains("Portal"));
    }


    @Then("user clicks message button")
    public void userClicksMessageButton() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.MessageElement.click();
        Thread.sleep(2000);
    }

    @Then("^user clicks upload files$")
    public void userClicksUploadFilesAndPicturesFromLocalDisks() throws InterruptedException {
        Thread.sleep(5000);
        activeStreamPage.clickuploadImageElement.click();
        Thread.sleep(2000);

    }

    @Then("user clicks upload files and images from local disks")
    public void userClicksUploadFilesAndImagesFromLocalDisks() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15, 100);
        WebElement uploadFileElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[1]")));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].style.left='0'", uploadFileElement);

        uploadFileElement.sendKeys("/Users/aylinbekem/IdeaProjects/bitrix/src/test/resources/bitrix.xlsx");

        Thread.sleep(2000);
    }


    @Then("user select documents from Bitrix")
    public void userSelectDocumentsFromBitrix() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.selectDocFromBitrix.click();
        Thread.sleep(2000);
        activeStreamPage.salesMarketingButton.click();
        Thread.sleep(2000);
        activeStreamPage.MarketingAdvertising.click();
        Thread.sleep(2000);
        activeStreamPage.LogoGifElement.click();
        Thread.sleep(2000);
        activeStreamPage.selectDocument.click();
        Thread.sleep(5000);


        //  activeStreamPage.sendButton.click();
        //  Thread.sleep(1000);

    }


    @Then("user clicks select contact button")
    public void userClicksSelectContactButton() {
        activeStreamPage.selectContactButton.click();
    }

    @Then("user clicks recent button")
    public void userClicksRecentButton() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.recentContactListElement.click();
    }

    @Then("user clicks employees and departments button")
    public void userClicksEmployeesAndDepartmentsButton() {
        activeStreamPage.employeesAndDepartmentsElement.click();
    }

    @Then("user clicks random email")
    public void userClicksRandomEmail() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.randomEmail.click();
    }

    @Then("user clicks emailUsers button")
    public void userClicksEmailUsersButton() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.emailUsersButton.click();
        activeStreamPage.emailemailButton.click();
        activeStreamPage.closeButton.click();
    }

    @Then("user clicks on Link button")
    public void userClicksOnLinkButton() throws InterruptedException {
        activeStreamPage.linkButton.click();
        Thread.sleep(3000);
        activeStreamPage.linkLinkURLButton.sendKeys("https://www.amazon.com/");
        activeStreamPage.linkTextButton.sendKeys("Amazon");
        activeStreamPage.linkSaveButton.click();
    }

    @Then("user clicks video Upload button")
    public void userClicksVideoUploadButton() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.insertVideoButton.click();
        Thread.sleep(2000);

        activeStreamPage.videoURL.sendKeys("https://www.youtube.com/watch?v=Vao7T4__0Xw");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.videoSizeElement));
        Select select = new Select(activeStreamPage.videoSizeElement);

        select.selectByVisibleText("560 x 315");
        activeStreamPage.videoURLSaveButton.click();
        Thread.sleep(2000);

    }

    @Then("user clicks on the Comma icon")
    public void userClicksOnTheCommaIcon() throws InterruptedException {
        Thread.sleep(2000);
        activeStreamPage.commaButton.click();


    }

    @Then("user clicks on the mentioned icon")
    public void userClicksOnTheMentionedIcon() {
        activeStreamPage.mentionedbutton.click();

    }
}







