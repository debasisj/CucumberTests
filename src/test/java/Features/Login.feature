Feature: Login
  This feature deals with login functionality

  Scenario: Login test with valid credentials
    Given I have navigated to loin page
    And I have entered user and password
      | user  | password |
      | admin | pwd      |
    And I hit login
    Then I should be able to login

  Scenario Outline: Login to feature deals with correct login functionality

    Given I navigate to loin page
    And I  enter correct <Username> and <Password>
    And I hit to login
    Then I should be able to login to the site

    Examples:
      | Username | Password |
      | xxxx     | yyyy     |
      | dddd     | op       |