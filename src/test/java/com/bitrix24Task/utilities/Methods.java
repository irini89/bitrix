package com.bitrix24Task.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Methods {

    public static void highlightElement(WebElement element){

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);


    }

}
