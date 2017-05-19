Feature: One way flight reservation

  @Smoke
  Scenario: Search for one way flight options from Hyderabad to Banglore
    Given I navigate to the cleartrip homepage
    And I select flight with "Hyderabad, IN" and "Bangalore, IN" options
    When I click on search flights
    Then list of flight options will be visible

  @Manual
  Scenario: Search for one way flight options from Banglore to Delhi
    Given I navigate to the cleartrip homepage
    And I select flight with "Bangalore, IN" and "New Delhi" options
    When I click on search flights
    Then list of flight options will be visible
