@tyu
Feature: Search Amazon

  Scenario Outline: Search and sort the results by price
    Given I search for "<product>" on Amazon
    Then the results should be stored and displayed sorted by their price
    Examples:
      | product |
      | Samsung |
      | Apple   |
      | OnePlus |