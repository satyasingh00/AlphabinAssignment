
@tag
Feature: Select random category from dropdown on Amazon
  @tag1
  Scenario: Select random category from dropdown
    Given I am on the Amazon homepage
    When I get all available categories from the dropdown menu and store them in an array
    Then I should be able to randomly select a category from the array and apply the filter
    Then I should see search results specific to the chosen category
  