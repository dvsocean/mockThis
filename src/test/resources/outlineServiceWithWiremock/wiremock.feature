Feature: Express board creation
  Scenario: Find space for the creation of wiremock data

    Given I have element space inside of my array
    When I create a board named "motherBitch"
    Then I should still see available space

