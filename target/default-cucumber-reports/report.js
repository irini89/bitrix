$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Announcement.feature");
formatter.feature({
  "name": "As a user I should be able to send anouncements from Anouncement subheading from \"More\" under the Activity Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@announcement"
    }
  ]
});
formatter.scenarioOutline({
  "name": "\u003cusername\u003e should be able to upload files, add users and recepients, attach links, insert videos,",
  "description": "  create a quote, add mention, click on Visual editor, click on Topic icon, record video, add tags.",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters credentials \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "When "
});
formatter.step({
  "name": "user enters dashpage",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on more button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on announcement",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on upload icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on upload files and images",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on select Documents From Bitrix24",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on add more and clicks on recents, employees and departments and email users",
  "keyword": "Then "
});
formatter.step({
  "name": "user attaches a link by clicking on the link icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user creates a quote by clicking on the Coma icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user adds mention by clicking on the Add mention icon and selects contacts from the lists provided in dropdown.",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Visual Editor and sees the editor text-bar displays on top of the message box.",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on the Topic icon to see the annoucement Topic text box displays on top of the message box.",
  "keyword": "Then "
});
formatter.step({
  "name": "user adds tags by selecting existing tags or creating new tags by clicking on the # icon.",
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
        "hr4@cybertekschool.com",
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
  "name": "user logs in on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_logs_in_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "hr4@cybertekschool.com should be able to upload files, add users and recepients, attach links, insert videos,",
  "description": "  create a quote, add mention, click on Visual editor, click on Topic icon, record video, add tags.",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@announcement"
    }
  ]
});
formatter.step({
  "name": "user enters credentials \"hr4@cybertekschool.com\" username and \"UserUser\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_enters_credentials_username_and_password(java.lang.String,java.lang.String)"
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
  "name": "user clicks on more button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_more_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on announcement",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_announcement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on upload icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_upload_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on upload files and images",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_upload_files_and_images()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on select Documents From Bitrix24",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_select_Documents_From_Bitrix24()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add more and clicks on recents, employees and departments and email users",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_add_more_and_clicks_on_recents_employees_and_departments_and_email_users()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user attaches a link by clicking on the link icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_attaches_a_link_by_clicking_on_the_link_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a quote by clicking on the Coma icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_creates_a_quote_by_clicking_on_the_Coma_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds mention by clicking on the Add mention icon and selects contacts from the lists provided in dropdown.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_adds_mention_by_clicking_on_the_Add_mention_icon_and_selects_contacts_from_the_lists_provided_in_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Visual Editor and sees the editor text-bar displays on top of the message box.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_Visual_Editor_and_sees_the_editor_text_bar_displays_on_top_of_the_message_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Topic icon to see the annoucement Topic text box displays on top of the message box.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_clicks_on_the_Topic_icon_to_see_the_annoucement_Topic_text_box_displays_on_top_of_the_message_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds tags by selecting existing tags or creating new tags by clicking on the # icon.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.step_definitions.AnnouncementStepDefinitions.user_adds_tags_by_selecting_existing_tags_or_creating_new_tags_by_clicking_on_the_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});