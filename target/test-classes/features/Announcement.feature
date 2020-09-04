@babochka
Feature: As a user i should be able to to send announcements subheading for "More" under Activity Stream.
  Background:
    Given User logs on the login page.

    Scenario Outline: user <username> should be able to login to the bitrix page


      When user enters credentials "<username>" username and "<password>" password
      Then user lands om the main page
      Then user clicks on more Dropdown button
      Then user clicks on Announcement
      Then user clicks on uppload files and pictures from local disk
      Then user downloads from external drive
      Then user selects documents from bitrix24
      Then user creates files to upload

      Then user should be able to add users and recipients from selecting contact from E-mail and  employees
      Then user should be able to add users and recipients from selecting contact from recent contact list.


      Examples:
        | username                | password |
        | hr4@cybertekschool.com  | UserUser |
      #  | hr3@cybertekschool.com  | UserUser |
