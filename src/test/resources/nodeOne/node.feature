Feature: Ability to create and destroy nodes
  Scenario: create and destroy node

    Given I have 1 space for domestic node
    When I issue command programaticaly
    Then I should see 1 element in station occupied