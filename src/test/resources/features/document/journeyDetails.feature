Feature: Journey_Details

  Scenario: View_Journey_Details
    Given I have multiple trips in Journeys
    When I select a trip
    Then I can see Journey Details

  Scenario: Modify_Journey_details
    Given I an open journey
    When I modify journey type
    Then new type is saved
    And score is updated
