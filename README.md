Amazon Search and Filtering Automation

** This project automates the testing of Amazon's search and filtering functionalities using Selenium and Cucumber for Behavior-Driven Development (BDD).

** Scenarios Covered
1. **Search for product and filter by brand**
   - Given I am on the Amazon homepage
   - When I search for "Wireless Headphones"
   - Then I should see results containing "Wireless Headphones"
   - When I filter by brand "Sony"
   - Then I should see only Sony wireless headphones displayed

2. **Search with irrelevant term**
   - Given I am on the Amazon homepage
   - When I search for "Random Irrelevant Keywords"
   - Then I should see less than 10 search results

3. **Iterate through a list of brands and filter**
   - Given I am on the Amazon homepage
   - When I search for "Laptops"
   - Then I should see search results containing "Laptops"
   - When I create a list of brands: ["Apple", "Dell", "HP"]
   - And I filter the search results by iterating through brands in the list
   - Then I should see only laptops from the specified brands displayed for each iteration

4. **Select random category from dropdown**
   - Given I am on the Amazon homepage
   - When I get all available categories from the dropdown menu and store them in an array
   - Then I should be able to randomly select a category from the array and apply the filter
   - Then I should see search results specific to the chosen category

5. **Verify recently viewed items section**
   - Given I am on the Amazon homepage
   - When I view a few different product pages
   - Then I should see a "Recently Viewed" section on the homepage
   - And the displayed items should be a subset of the recently viewed products
  
 ** Project Structure
   1.src/test/java
   pages/ runner/
   2.src/test/resources
   features/
  
** Prerequisites

- Java JDK 8 or higher
- Maven
- ChromeDriver (compatible version with your Chrome browser)

Setup Instructions
: Clone the repository: git clone (//https://github.com/satyasingh00/AlphabinAssignment.git)
cd Alphabin_Assignment
: Install dependencies: mvn clean install
: Run the tests: mvn test

## Running the Tests 
Run the code from runner file


Execution process Cucumber Setup

1.Feature Files
Feature files are located in src/test/resources/features/. These files contain the Gherkin syntax that describes the scenarios.

2.Step Definitions
Step definition files are located in src/test/java/stepDefinitions/. These files contain the Java code that implements the steps defined in the feature files.

3.Runner File
The runner file is located in src/test/java/runner/. This file is responsible for running the Cucumber tests.


