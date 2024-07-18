package steps3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IteratethroughSteps {
	
	WebDriver driver;
	
	@Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @When("I search for Laptops")
    public void i_search_for(String Laptops) {
    	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Laptops");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    @Then("I should see search results containing {string}")
    public void i_should_see_search_results_containing(String Laptops) {
        List<WebElement> results = driver.findElements(By.cssSelector(".s-title span"));
        for (WebElement result : results) {
            assert result.getText().contains(Laptops);
        }
    }

    @When("I create a list of brands: {string}")
    public void i_create_a_list_of_brands(String brands) {
        // This step is for documentation purposes in the feature file
    }

    @When("I filter the search results by iterating through brands in the list")
    public void i_filter_the_search_results_by_iterating_through_brands_in_the_list() {
        String[] brands = {"Apple", "Dell", "HP"};
        for (String brand : brands) {
            WebElement brandFilter = driver.findElement(By.xpath("//span[text()='Brands']"));
            brandFilter.click();
            
        }
    }

    @Then("I should see only laptops from the specified brands displayed for each iteration")
    public void i_should_see_only_laptops_from_the_specified_brands_displayed_for_each_iteration() {
        List<WebElement> results = driver.findElements(By.cssSelector(".s-title span"));
        for (WebElement result : results) {
            boolean isValidBrand = result.getText().contains("Apple") || result.getText().contains("Dell") || result.getText().contains("HP");
            assert isValidBrand;
        }
        driver.quit();
    }
}


