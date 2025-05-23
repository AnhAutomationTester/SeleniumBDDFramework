Feature: Login
  Scenario Outline: Verify that user can log in with valid credentials
    Given I open the application
    When I login with username "<username>" and password "<password>"
    Then I click on the login button
    Examples:
      | username | password |
      | Admin    | admin123 |
