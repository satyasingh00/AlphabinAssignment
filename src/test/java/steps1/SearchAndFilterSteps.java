package steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAndFilterSteps {
	
	WebDriver driver;
	
	@Given("I am on the Amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("I search for Wireless Headphones")
	public void i_search_for_wireless_headphones() {
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Wireless HeadPhones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	}

	@Then("I should see results containing Wireless Headphones")
	public void i_should_see_results_containing_wireless_headphones() {
		
		
		
	    
	}

	@When("I flter by brand Sony")
	public void i_flter_by_brand_sony() {
		driver.findElement(By.xpath("(//span[text()='Sony'])[1]")).click();
	    
	}

	@Then("I should see only Sony wireless headphones displayed")
	public void i_should_see_only_sony_wireless_headphones_displayed() {
		
	    
	}

}
