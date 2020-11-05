Feature: Free CRM login feature
  Scenario Outline:
    Given user is already on the login page
    When the title of the login page is Free CRM
    Then user enters the "<email>" and "<password>" and click on the login button
    Then the user on the home page
    Then the user close the browser
    Examples:
      | email               | password |
      | vadoc61635@tibui.com | Testerfreelance2 |