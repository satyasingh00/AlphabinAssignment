package steps4;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectRandomSTEPS {
	WebDriver driver;
    String selectedCategory;
    
    @Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @When("I get all available categories from the dropdown menu and store them in an array")
    public void i_get_all_available_categories_from_the_dropdown_menu_and_store_them_in_an_array() {
        WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoryDropdown);
        List<WebElement> categories = select.getOptions();
        String[] categoryArray = new String[categories.size()];

        for (int i = 0; i < categories.size(); i++) {
            categoryArray[i] = categories.get(i).getText();
        }

        // Randomly select a category
        Random random = new Random();
        int randomIndex = random.nextInt(categoryArray.length);
        selectedCategory = categoryArray[randomIndex];
    }

    @Then("I should be able to randomly select a category from the array and apply the filter")
    public void i_should_be_able_to_randomly_select_a_category_from_the_array_and_apply_the_filter() {
        WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoryDropdown);
        select.selectByVisibleText(selectedCategory);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("test");  
        searchBox.submit();
    }

    @Then("I should see search results specific to the chosen category")
    public void i_should_see_search_results_specific_to_the_chosen_category() {
        // Validate that the results are displayed for the selected category
        WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoryDropdown);
        String currentSelectedCategory = select.getFirstSelectedOption().getText();
        assert currentSelectedCategory.equals(selectedCategory);

        
        List<WebElement> results = driver.findElements(By.cssSelector(".s-title span"));
        assert results.size() > 0;

        driver.quit();
    }
}



