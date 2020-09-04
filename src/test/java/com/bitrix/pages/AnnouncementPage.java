package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.swing.*;
public class AnnouncementPage {
    public AnnouncementPage(){ PageFactory.initElements(Driver.getDriver(), this); }
    //1st AC
    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement moreButton;
    @FindBy (xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more ']")
    public WebElement announcements;
    @FindBy (xpath = "(//span[@title='Upload files'])[1]")
    public WebElement uploadIcon;
    @FindBy (xpath = "(//span[@title='Upload files'])[1]")
    public WebElement uploadFilesAndImages;
    @FindBy (xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selectDocumentsFromBitrix24;
    @FindBy (xpath = "(//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file'])[6]")
    public WebElement fileToUpload;
    @FindBy (css = "span.popup-window-button.popup-window-button-accept")
    public WebElement selectDocumentButton;
    // Gives a BUG
    @FindBy (linkText = "(//span[.='Office 365'])[1]")
    public WebElement downloadFromExternalDriveOffice365;
    // Gives a BUG
    @FindBy (linkText = "(//span[.='Document'])[1]")
    public WebElement createUsingGoogleDocsDocument;
    //2nd AC
    @FindBy (xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMore;
    @FindBy (xpath = "//div[@class='bx-finder-box-tabs']/a[1]")
    public  WebElement recent;
    @FindBy (xpath = "//div[@class='bx-finder-box-tabs']/a[2]")
    public WebElement EmployeesAndDepartments;
    @FindBy (xpath = "//a[.='E-mail users']")
    public WebElement eMailUsers;
    @FindBy (xpath = "(//div[@class='bx-finder-box-item-t7-name'])[5]")
    public WebElement email;
    @FindBy (xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;
    @FindBy (xpath = "(//span[.='email email'])[1]")
    public WebElement emailAfterClick;
    //3nd AC
    @FindBy (xpath = "//span[@class=\'bxhtmled-top-bar-btn bxhtmled-button-link\']")
    public WebElement linkIcon;
    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;
    @FindBy (id = "linkidPostFormLHE_blogPostForm-href")
    public  WebElement linkURL;
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveLinkButton;
    //4th AC BUG here
//    @FindBy (xpath = "//span[@title='Insert video']")
//    public WebElement videoIcon;
//
//    @FindBy (xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
//    public WebElement videoURL;
//
////    @FindBy (xpath = "//input[@class='adm-btn-save']")
////    public WebElement saveVideo;
    //5th AC
    @FindBy (xpath = "//span[@title='Quote text']")
    public WebElement comaIcon;
    //6th AC
    @FindBy (xpath = "(//span[@title='Add mention'])[1]")
    public WebElement addMention;
    @FindBy (xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public  WebElement mentionEmail;
    //7th AC
    @FindBy (xpath = "(//span[@class='feed-add-post-form-editor-btn'])[1]")
    public WebElement visualEditor;
    //8th AC
    @FindBy (xpath = "//span[@title='Topic']")
    public WebElement topic;
    //9th
    //BUG
    //10th
    @FindBy (xpath = "//span[@title='Add tag']")
    public  WebElement tag;
}