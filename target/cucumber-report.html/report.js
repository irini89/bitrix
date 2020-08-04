$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ActiveStream.feature");
formatter.feature({
  "name": "As a user, I should be able to send messages by clicking on Message tab under Active Stream.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@bitrix"
    }
  ]
});
formatter.scenarioOutline({
  "name": "\u003cusername\u003e should be able to click on upload files icon to upload files and pictures from local disks,",
  "description": "  download from external drive, select documents from bixtrix24, and create files to upload.",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "When "
});
formatter.step({
  "name": "user enters dashpage",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks message button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks upload files",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks upload files and images from local disks",
  "keyword": "Then "
});
formatter.step({
  "name": "user select documents from Bitrix",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks select contact button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks recent button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks employees and departments button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks random email",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks emailUsers button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Link button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks video Upload button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on the Comma icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on the mentioned icon",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hr4@cybertekschool.com ",
        "UserUser"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.user_logs_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "hr4@cybertekschool.com  should be able to click on upload files icon to upload files and pictures from local disks,",
  "description": "  download from external drive, select documents from bixtrix24, and create files to upload.",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@bitrix"
    }
  ]
});
formatter.step({
  "name": "user enters \"hr4@cybertekschool.com \" username and \"UserUser\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dashpage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.user_enters_dashpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks message button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksMessageButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks upload files",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksUploadFilesAndPicturesFromLocalDisks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks upload files and images from local disks",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksUploadFilesAndImagesFromLocalDisks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select documents from Bitrix",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userSelectDocumentsFromBitrix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks select contact button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksSelectContactButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks recent button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksRecentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks employees and departments button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksEmployeesAndDepartmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks random email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksRandomEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks emailUsers button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksEmailUsersButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Link button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksOnLinkButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027linkidPostFormLHE_blogPostForm-href\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.105)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Aylins-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:6e:5187:e008:c393%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/m3/rs35tdl94kl...}, goog:chromeOptions: {debuggerAddress: localhost:52112}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f0a297651c4f33afa20dc66232eb75f2\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027linkidPostFormLHE_blogPostForm-href\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\n\tat com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksOnLinkButton(ActiveStreamStepDefinitions.java:132)\n\tat ✽.user clicks on Link button(file:///Users/aylinbekem/IdeaProjects/bitrix/src/test/resources/features/ActiveStream.feature:25)\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks video Upload button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksVideoUploadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the Comma icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksOnTheCommaIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the mentioned icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.ActiveStreamStepDefinitions.userClicksOnTheMentionedIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});