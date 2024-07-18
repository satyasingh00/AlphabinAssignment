
@tag
Feature: Verify recently viewed items section on Amazon
  

  @tag1
  Scenario: Verify recently viewed items section
    Given I am on the Amazon homepage
    When I view a few different product pages
    Then I should see a Recently Viewed section on the homepage
    And the displayed items should be a subset of the recently viewed products
  