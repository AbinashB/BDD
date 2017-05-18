Feature: One way flight reservation
  Scenario: Search for one way flight options from Hyderabad to Banglore
    Given I navigate to the cleartrip homepage
    And I select flight with "Hyderabad, IN" and "Bangalore, IN" options
    When I click on search flights
    Then list of flight options will be visible