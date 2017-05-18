Feature: Two way flight reservation
  @Smoke
  Scenario Outline: Search for round trip flights (Scenario by Example)
    Given I navigate to the cleartrip homepage
    And choose the round trip option
    And I select round flights with "<From>" and "<To>" options
    When I click on search flights
    Then list of flight options will be visible
    Examples:
      |From      |To           |
      |New Delhi |Hyderabad, IN|
      |Mumbai    |New Delhi    |