Feature: journeys

  Scenario: Create_New_Journey
    Given I am logged in
    When I start a new Journey
    And I simulate a valid trip
    Then a new journey is created