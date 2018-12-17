Feature: Express board creation
  Scenario: Find space for the creation of wiremock data

    Given I have element space inside of my array
    But a motherboard by the name of "Sally" has already been created
    When I create a board named "shutTheFrontDoor"
    And I have a free node
    Then I should still see available space

