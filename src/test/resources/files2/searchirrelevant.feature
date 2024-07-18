
@tag
Feature: Amazon Search and Filtering
  

  @tag1
  Scenario: Search with irrelevant term
    Given I am on the Amazon homepage
    When I search for Random Irrelevant Keywords
    Then I should see less than 10 search results

  
