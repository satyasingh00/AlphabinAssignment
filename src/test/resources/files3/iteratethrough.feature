
@tag
Feature: Amazon Search and Filtering
  

  @tag1
  Scenario: Iterate through a list of brands and flter
    Given I am on the Amazon homepage
    When I search for "Laptops"
    Then I should see search results containing "Laptops"
    When I create a list of brands: ["Apple", "Dell", "HP"]
    And I flter the search results by iterating through brands in the list
    Then I should see only laptops from the specifed brands displayed for each iteration

  