
Feature: Login

  Scenario: Login_to_Profile
    Given I am a registered user
    When I login
    Then I can see my profile

  Scenario: Invalid_Login
    Given I am not a valid user
    When I login
    Then I receive error