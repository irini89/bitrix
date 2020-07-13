@smoke
Feature:As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.





  Scenario Outline: DDT example with credentials, Login as username
    Given user logs on the login page
    When  user enters "<username>" username and "<password>" password
    Then user enters dashpage

    Examples:
      | username                       |password   |
      | hr4@cybertekschool.com         |UserUser   |
      | marketing3@cybertekschool.com  |UserUser   |
      | helpdesk4@cybertekschool.com   |UserUser   |