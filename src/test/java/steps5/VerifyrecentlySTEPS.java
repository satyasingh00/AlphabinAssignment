package steps5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyrecentlySTEPS {
	WebDriver driver;
    List<String> viewedProducts = new ArrayList<>();
    
    @Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }

    @When("I view a few different product pages")
    public void i_view_a_few_different_product_pages() {
        String[] productUrls = {
            "https://www.amazon.in/CELLBELL-C190-Berlin-Office-Ergonomic/dp/B0CRVNPS3Y/?_encoding=UTF8&ref_=pd_hp_d_btf_ci_mcx_mr_hp_atf_m",
            "https://www.amazon.in/Amkette-Ergo-View-Adjustment-laptops/dp/B07PQ169ZH/?_encoding=UTF8&ref_=pd_hp_d_btf_ci_mcx_mr_hp_atf_m",
            "https://www.amazon.in/TEKAVO-Engineered-Computer-Workstation-150x60x76/dp/B09Q29YQ79/ref=pd_rhf_gw_s_pd_crcd_d_sccl_1_12/260-6426570-9497613?pd_rd_i=B09Q29YQ79&psc=1"
        };

        for (String url : productUrls) {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
            viewedProducts.add(productTitle.getText());
        }
    }

    @Then("I should see a \"Recently Viewed\" section on the homepage")
    public void i_should_see_a_recently_viewed_section_on_the_homepage() {
        driver.get("https://www.amazon.in");
        List<WebElement> recentlyViewedSection = driver.findElements(By.xpath("//h2[text()='Recently Viewed']"));
        assert recentlyViewedSection.size() > 0;
    }

    @Then("the displayed items should be a subset of the recently viewed products")
    public void the_displayed_items_should_be_a_subset_of_the_recently_viewed_products() {
        List<WebElement> recentlyViewedItems = driver.findElements(By.cssSelector(".carousel .a-carousel-card .p13n-sc-truncated"));
        List<String> recentlyViewedTitles = new ArrayList<>();
        
        for (WebElement item : recentlyViewedItems) {
            recentlyViewedTitles.add(item.getText());
        }

        assert viewedProducts.containsAll(recentlyViewedTitles);
        driver.quit();
    }
}


