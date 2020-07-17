package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {

    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div/span[.='Message']")
    public WebElement MessageElement;

    @FindBy(xpath="(//span[@title='Upload files'])[1]")
    public WebElement clickuploadImageElement;

    // we should upload the file from local disk send key method does not work!
    @FindBy(xpath =("(//input[@type='file'])[1]"))
    public WebElement localDisk;
    // we should upload the file from local disk send key method does not work!
    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public  WebElement selectDocFromBitrix;

    // There is a bug it gives an error message BUG BUG
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud'])[3]")
    public WebElement externalDrive;
    // There is a bug it gives an error message  BUG BUG
    @FindBy(xpath = "(//span[contains(text(),'Create using')])[3]")
    public WebElement createUsing;

    @FindBy(xpath ="//span[.='Sales and marketing']")
    public WebElement salesMarketingButton;

    @FindBy(linkText="Marketing and advertising")
    public WebElement MarketingAdvertising;

    @FindBy(linkText="Logo.gif")
    public WebElement LogoGifElement;

    @FindBy(css = "span.popup-window-button.popup-window-button-accept")
    public WebElement selectDocument;

    @FindBy(css = "button.ui-btn.ui-btn-lg.ui-btn-primary")
    public  WebElement sendButton;

}
