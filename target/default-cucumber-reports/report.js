$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Announcement.feature");
formatter.feature({
  "name": "As a user i should be able to to send announcements subheading for \"More\" under Activity Stream.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@babochka"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user \u003cusername\u003e should be able to login to the bitrix page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters credentials \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "When "
});
formatter.step({
  "name": "user lands om the main page",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on more Dropdown button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Announcement",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on uppload files and pictures from local disk",
  "keyword": "Then "
});
formatter.step({
  "name": "user downloads from external drive",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects documents from bitrix24",
  "keyword": "Then "
});
formatter.step({
  "name": "user creates files to upload",
  "keyword": "Then "
});
formatter.step({
  "name": "user should be able to add users and recipients from selecting contact from E-mail and  employees",
  "keyword": "Then "
});
formatter.step({
  "name": "user should be able to add users and recipients from selecting contact from recent contact list.",
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
  "name": "User logs on the login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_logs_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user hr4@cybertekschool.com  should be able to login to the bitrix page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@babochka"
    }
  ]
});
formatter.step({
  "name": "user enters credentials \"hr4@cybertekschool.com \" username and \"UserUser\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_enters_credentials_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands om the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_lands_om_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on more Dropdown button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_clicks_on_more_Dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Announcement",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_clicks_on_Announcement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on uppload files and pictures from local disk",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_clicks_on_uppload_files_and_pictures_from_local_disk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user downloads from external drive",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_downloads_from_external_drive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects documents from bitrix24",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_selects_documents_from_bitrix24()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates files to upload",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_creates_files_to_upload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to add users and recipients from selecting contact from E-mail and  employees",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_should_be_able_to_add_users_and_recipients_from_selecting_contact_from_E_mail_and_employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to add users and recipients from selecting contact from recent contact list.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.Announcement_page.user_should_be_able_to_add_users_and_recipients_from_selecting_contact_from_recent_contact_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});