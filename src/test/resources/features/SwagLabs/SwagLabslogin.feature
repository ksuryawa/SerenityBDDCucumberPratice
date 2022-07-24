Feature: SwagLabs Login feature
  In order to login to SwagLabs
  As a user
  I want to login to SwagLabs
  So that I can use the application

  Scenario: Login to SwagLabs
    Given I am on the SwagLabs login page
    When I enter valid username and password
    Then I should be able to login successfully


  Scenario Outline: Login to SwagLabs with examples
    Given I am on the SwagLabs login page
    When I enter valid '<username>' and '<password>'
    Then I should be able to login successfully
    Examples:
      | username | password |
      | standard_user    | secret_sauce    |
      | standard_user     | secret_sauce     |
      | standard_user    | secret_sauce      |