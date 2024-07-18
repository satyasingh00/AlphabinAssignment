
@tag
Feature: Amazon Search and Filtering
  

  @tag1
  Scenario: Search for product and flter by brand
    Given I am on the Amazon homepage
    When I search for Wireless Headphones
    Then I should see results containing Wireless Headphones
    When I flter by brand Sony
    Then I should see only Sony wireless headphones displayed

  
