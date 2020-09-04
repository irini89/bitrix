package com.bitrix.step_definitions;
import com.bitrix.pages.AnnouncementPage;
import com.bitrix.pages.AnnouncementPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Configuration_Reader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AnnouncementStepDefinitions {
    AnnouncementPage announcement = new AnnouncementPage();
    LoginPage login = new LoginPage();
    @Given("user logs in on the login page")
    public void user_logs_in_on_the_login_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("url"));
    }
    @When("user enters credentials {string} username and {string} password")
    public void user_enters_credentials_username_and_password(String string, String string2) {
        login.login(string, string2);
    }
    @Then("user clicks on more button")
    public void user_clicks_on_more_button() throws InterruptedException{
        Thread.sleep(1000);
        announcement.moreButton.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on announcement")
    public void user_clicks_on_announcement()throws InterruptedException {
        Thread.sleep(1000);
        announcement.announcements.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on upload icon")
    public void user_clicks_on_upload_icon() throws InterruptedException{
        Thread.sleep(1000);
        announcement.uploadIcon.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on upload files and images")
    public void user_clicks_on_upload_files_and_images() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15, 100);
        WebElement uploadFileElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[1]")));
        uploadFileElement.sendKeys("C:\\Users\\desar\\OneDrive\\Pictures\\Screenshots\\irini.png.jpg");
        Thread.sleep(1000);
    }
    @Then("user clicks on select Documents From Bitrix24")
    public void user_clicks_on_select_Documents_From_Bitrix24() throws InterruptedException {
        Thread.sleep(1000);
        announcement.selectDocumentsFromBitrix24.click();
        Thread.sleep(1000);
        announcement.fileToUpload.click();
        Thread.sleep(1000);
        announcement.selectDocumentButton.click();
        Thread.sleep(1000);
    }
    //THESE 2 BOTH GIVE BUGS   !!!
//    @Then("user clicks on downloadFromExternalDriveOffice365")
//    public void user_clicks_on_downloadFromExternalDriveOffice365() {
//
//
//
//    }
//    @Then("user clicks on create Using Google Docs Document")
//    public void user_clicks_on_create_Using_Google_Docs_Document() {
//
//    }
    @Then("user clicks on add more and clicks on recents, employees and departments and email users")
    public void user_clicks_on_add_more_and_clicks_on_recents_employees_and_departments_and_email_users() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15, 100);
//        WebElement addMoreButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Add more']")));
        Thread.sleep(1000);
        announcement.addMore.click();
        Thread.sleep(1000);
        announcement.recent.click();
        Thread.sleep(1000);
        announcement.EmployeesAndDepartments.click();
        Thread.sleep(1000);
        announcement.eMailUsers.click();
        Thread.sleep(1000);
        announcement.email.click();
        Thread.sleep(1000);
        announcement.closeButton.click();
        Thread.sleep(1000);
        //announcement.emailAfterClick.isDisplayed();
    }
    @Then("user attaches a link by clicking on the link icon")
    public void user_attaches_a_link_by_clicking_on_the_link_icon() throws InterruptedException {
        Thread.sleep(1000);
        announcement.linkIcon.click();
        Thread.sleep(1000);
        announcement.linkText.sendKeys("Cat video !");
        Thread.sleep(1000);
        announcement.linkURL.sendKeys("https://www.youtube.com/watch?v=xtHYSq0xKiQ");
        Thread.sleep(1000);
        announcement.saveLinkButton.click();
        Thread.sleep(1000);
    }
    //BUG BUG
//    @Then("user inserts video by clicking on the video icon and entering video URL")
//    public void user_inserts_video_by_clicking_on_the_video_icon_and_entering_video_URL() throws InterruptedException {
//Thread.sleep(1000);
//announcement.videoIcon.click();
//Thread.sleep(1000);
//announcement.videoURL.sendKeys("https://www.youtube.com/watch?v=xtHYSq0xKiQ");
//Thread.sleep(1000);
//announcement.saveVideo.click();
//Thread.sleep(1000);
//    }
    @Then("user creates a quote by clicking on the Coma icon")
    public void user_creates_a_quote_by_clicking_on_the_Coma_icon() throws InterruptedException {
        Thread.sleep(1000);
        announcement.comaIcon.click();
        Thread.sleep(1000);
    }
    @Then("user adds mention by clicking on the Add mention icon and selects contacts from the lists provided in dropdown.")
    public void user_adds_mention_by_clicking_on_the_Add_mention_icon_and_selects_contacts_from_the_lists_provided_in_dropdown() throws InterruptedException {
        announcement.addMention.click();
        Thread.sleep(1000);
        announcement.mentionEmail.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on Visual Editor and sees the editor text-bar displays on top of the message box.")
    public void user_clicks_on_Visual_Editor_and_sees_the_editor_text_bar_displays_on_top_of_the_message_box() throws InterruptedException {
        announcement.visualEditor.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on the Topic icon to see the annoucement Topic text box displays on top of the message box.")
    public void user_clicks_on_the_Topic_icon_to_see_the_annoucement_Topic_text_box_displays_on_top_of_the_message_box() throws InterruptedException {
        Thread.sleep(1000);
        announcement.topic.click();
        Thread.sleep(1000);
    }
    // BUG BUG
//    @Then("user clicks on {string} tab to record a video and attach it with the message.")
//    public void user_clicks_on_tab_to_record_a_video_and_attach_it_with_the_message(String string) {
//
//    }
    @Then("user adds tags by selecting existing tags or creating new tags by clicking on the # icon.")
    public void user_adds_tags_by_selecting_existing_tags_or_creating_new_tags_by_clicking_on_the_icon() throws InterruptedException {
        announcement.tag.click();
        Thread.sleep(1000);
    }
}

















