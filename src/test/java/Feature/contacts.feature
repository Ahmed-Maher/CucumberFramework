Feature: Free CRM add new Contact feature
  Scenario Outline:
    Given user is already on the login page
    Then user enters the "<email>" and "<password>" and click on the login button
    Then the user on the home page
    Then user move to contact page
    Then user enters contact information "<firstname>" and "<lastname>"
    Then user verify the contact information
    Then the user close the browser
    Examples:
      | email                | password          | firstname |  lastname |
      | vadoc61635@tibui.com | Testerfreelance2  | test1     |  test1    |
      | vadoc61635@tibui.com | Testerfreelance2  | test2     |  test2    |