Feature: SwagLabs Login feature01
  In order to login to SwagLabs
  As a user
  I want to login to SwagLabs
  So that I can use the application

  Scenario Outline: Login to SwagLabs01
    Given I am on the SwagLabs login page
    When I enter valid '<username>' and '<password>'
    Then I should be able to login successfully
    Examples:
    | username | password |
    | standard_user    | secret_sauce    |
    | standard_user     | secret_sauce     |
    | standard_user    | secret_sauce     |