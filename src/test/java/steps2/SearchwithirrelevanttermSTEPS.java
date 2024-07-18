package steps2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchwithirrelevanttermSTEPS {
	
WebDriver driver;
	
	@Given("I am on the Amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	
	@When("I search for Random Irrelevant Keywords")
	public void i_search_for_random_irrelevant_keywords() {
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("rental person who does nothing");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	}

	@Then("I should see less than {int} search results")
	public void i_should_see_less_than_search_results(Integer int1) {
	    
	}
	
	

}
