@bitrix1
Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given user logs on the login page

  Scenario Outline: <username> should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.

    When user enters "<username>" username and "<password>" password
    Then user enters dashpage
    Then user clicks message button
    Then  user clicks upload files
    Then user clicks upload files and images from local disks
    Then  user select documents from Bitrix
        #// There is a bug it gives an error message BUG BUG
       # Then  user select documents to download from external drive
      #// There is a bug it gives an error message BUG BUG
        # Then  user create files to upload from create using GoogleDocs.
    Then user clicks select contact button
    Then user clicks recent button
    Then user clicks employees and departments button
    Then user clicks random email
    Then user clicks emailUsers button
    Then user clicks on Link button
    Then user clicks video Upload button
    Then user clicks on the Comma icon

    Examples:
      | username                | password |
      | hr4@cybertekschool.com  | UserUser |
    #  | marketing3@cybertekschool.com | UserUser |
   #   | helpdesk4@cybertekschool.com  | UserUser |



