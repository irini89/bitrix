Feature: As a user I should be able to send anouncements from Anouncement subheading from "More" under the Activity Stream
  Background:
    Given user logs in on the login page
  Scenario Outline:  <username> should be able to upload files, add users and recepients, attach links, insert videos,
  create a quote, add mention, click on Visual editor, click on Topic icon, record video, add tags.
    When user enters credentials "<username>" username and "<password>" password
    Then user enters dashpage
    Then user clicks on more button
    Then user clicks on announcement
    Then user clicks on upload icon
    Then user clicks on upload files and images
    Then user clicks on select Documents From Bitrix24
   # Then user clicks on downloadFromExternalDriveOffice365
   # Then user clicks on create Using Google Docs Document
    Then user clicks on add more and clicks on recents, employees and departments and email users
    Then user attaches a link by clicking on the link icon
   # Then user inserts video by clicking on the video icon and entering video URL
    Then user creates a quote by clicking on the Coma icon
    Then user adds mention by clicking on the Add mention icon and selects contacts from the lists provided in dropdown.
    Then user clicks on Visual Editor and sees the editor text-bar displays on top of the message box.
    Then user clicks on the Topic icon to see the annoucement Topic text box displays on top of the message box.
   # Then user clicks on "Record Video" tab to record a video and attach it with the message.
    Then user adds tags by selecting existing tags or creating new tags by clicking on the # icon.
    Examples:
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |
     # | hr3@cybertekschool.com        | UserUser |
     # | helpdesk3@cybertekschool.com  | UserUser |
     # | helpdesk4@cybertekschool.com  | UserUser |
     # | marketing3@cybertekschool.com | UserUser |
     # | marketing4@cybertekschool.com | UserUser |
















