package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {

    public ActiveStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/span[.='Message']")
    public WebElement MessageElement;

    @FindBy(xpath = "(//span[@title='Upload files'])[1]")
    public WebElement clickuploadImageElement;

    // we should upload the file from local disk send key method does not work!
    @FindBy(xpath = ("(//input[@type='file'])[1]"))
    public WebElement localDisk;
    // we should upload the file from local disk send key method does not work!
    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selectDocFromBitrix;

    // There is a bug it gives an error message BUG BUG
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud'])[3]")
    public WebElement externalDrive;
    // There is a bug it gives an error message  BUG BUG
    @FindBy(xpath = "(//span[contains(text(),'Create using')])[3]")
    public WebElement createUsing;

    @FindBy(xpath = "//span[.='Sales and marketing']")
    public WebElement salesMarketingButton;

    @FindBy(linkText = "Marketing and advertising")
    public WebElement MarketingAdvertising;

    @FindBy(linkText = "Logo.gif")
    public WebElement LogoGifElement;

    @FindBy(css = "span.popup-window-button.popup-window-button-accept")
    public WebElement selectDocument;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement selectContactButton;

    @FindBy(xpath = "//a[.='Recent']")
    public WebElement recentContactListElement;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartmentsElement;

    @FindBy(xpath = "//div[.='hr47@cybertekschool.com']")
    public WebElement randomEmail;

    @FindBy(xpath = "//a[.='E-mail users']")
    public WebElement emailUsersButton;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement inputBoxElement;

    @FindBy(id = "destEmailTab_destination9364735")
    public WebElement inviteEmailUserNameButton;

    @FindBy(xpath = "//input[@id='invite_email_user_last_name']")
    public WebElement inviteEmailLastNameButton;

    @FindBy(xpath = "//span[@id='invite_email_user_button']")
    public WebElement okButton;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkLinkURLButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextButton;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement linkSaveButton;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoURL;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-size")
    public WebElement videoSizeElement;
    @FindBy(xpath = "(//input[@id='undefined'])[2]")
    public WebElement videoURLSaveButton;

    @FindBy(xpath = "//span[@id='bx-b-quote-blogPostForm']")
    public WebElement commaButton;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[3]")
    public WebElement emailemailButton;

    //  @FindBy(css = "button.ui-btn.ui-btn-lg.ui-btn-primary")
    //   public  WebElement sendButton;

}
