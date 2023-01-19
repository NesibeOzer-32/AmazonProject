package amazonProject.step_stepDefinitions;

import amazonProject.pages.AmazonAllCategoryPage;
import amazonProject.utilities.BrowserUtils;
import amazonProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AmazonAllCategory_stepDefinitions {

    AmazonAllCategoryPage amazonAllCategoryPage= new AmazonAllCategoryPage();
    @Given("user goes to the Amazon Home Page")
    public void user_goes_to_the_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com/");

    }

    @Given("user clicks All navigation bar")
    public void user_clicks_all_navigation_bar() {
        amazonAllCategoryPage.allNavigationBarBtn.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.ComputersModule,10);

    }

    @Given("user clicks Computers bar")
    public void user_clicks_computers_bar() {
        amazonAllCategoryPage.ComputersModule.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.ComputerTabletsModule,10);

    }

    @Given("user clicks Computers&Tablets bar")
    public void user_clicks_computers_tablets_bar() {
        amazonAllCategoryPage.ComputerTabletsModule.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.resultText,10);

    }

    @Then("user sees results for Computers&Tablets")
    public void user_sees_results_for_computers_tablets() {
        Assert.assertTrue(amazonAllCategoryPage.resultText.isDisplayed());
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.laptopsModule,10);


    }

    @When("user clicks Laptops from Departments")
    public void user_selects_laptops_from_departments() {
        amazonAllCategoryPage.laptopsModule.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.avgCustomerReviewModule,10);

    }

    @When("user clicks three stars from Avg. Customer Review")
    public void user_clicks_three_stars_from_avg_customer_review() {
        amazonAllCategoryPage.avgCustomerReviewModule.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.ASUS,10);

    }

    @When("user clicks ASUS from Featured Brands")
    public void user_clicks_asus_from_featured_brands() {
        amazonAllCategoryPage.ASUS.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.lowPrice,10);

    }

    @When("user type {int} for min price")
    public void user_type_for_min_price(int minPrice) {
        amazonAllCategoryPage.lowPrice.sendKeys(minPrice+"");
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.maxPrice,10);

    }

    @When("user type {int} for max price")
    public void user_type_for_max_price(int maxPrice) {
        amazonAllCategoryPage.maxPrice.sendKeys(maxPrice+"");
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.goBtn,10);

    }

    @When("user clicks Go button")
    public void user_clicks_go_button() {
        amazonAllCategoryPage.goBtn.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.ProcessorCountTwelve,10);

    }

    @When("user twelve for Processor Count")
    public void user_for_processor_count() {
        amazonAllCategoryPage.ProcessorCountTwelve.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.displaySize,10);

    }

    @When("user clicks \"16 to 16.9\" Inches from Display Size")
    public void user_clicks_to_inches_from_display_size() {
        amazonAllCategoryPage.displaySize.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.laptop,10);
    }

    @When("user clicks first result of laptop")
    public void user_clicks_first_result_of_laptop() {
        amazonAllCategoryPage.laptop.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.LaptopInfo,10);
    }

    @Then("user sees information about selected laptop")
    public void user_sees_information_about_selected_laptop() {
        Assert.assertTrue(amazonAllCategoryPage.LaptopInfo.isDisplayed());
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.AddToCartBtn,10);

    }

    @Then("user sees Add to Cart button")
    public void user_sees_add_to_cart_button() {
        Assert.assertTrue(amazonAllCategoryPage.AddToCartBtn.isDisplayed());
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.BuyNowBtn,10);
    }

    @Then("user sees Buy Now Button")
    public void user_sees_buy_now_button() {
        Assert.assertTrue(amazonAllCategoryPage.BuyNowBtn.isDisplayed());


    }

    @When("user clicks Visit the help section")
    public void user_clicks_visit_the_help_section() {
        amazonAllCategoryPage.helpSectionModule.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.amazonAssistant,10);

    }

    @When("user clicks Amazon Assistant module")
    public void user_clicks_amazon_assistant_module() {
        amazonAllCategoryPage.amazonAssistant.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.amazonAssistantText,10);
    }

    @Then("user sees Amazon Assistant text")
    public void user_sees_amazon_assistant_text() {
        Assert.assertTrue(amazonAllCategoryPage.amazonAssistantText.isDisplayed());


    }

    @Then("user type broken item to Find more solutions field")
    public void user_type_broken_item_to_find_more_solutions_field() {
        amazonAllCategoryPage.FindMoreSolutionsField.sendKeys("broken item", Keys.ENTER);
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.BrokenItemBtn,10);

    }

    @Then("user clicks on Replace a Damaged, Defective, or Broken Item")
    public void user_clicks_on_replace_a_damaged_defective_or_broken_item() {
        amazonAllCategoryPage.BrokenItemBtn.click();
        BrowserUtils.waitForVisibility(amazonAllCategoryPage.brokenItemInfo,10);

    }

    @Then("user sees information about broken item")
    public void user_sees_information_about_broken_item() {
        Assert.assertTrue(amazonAllCategoryPage.brokenItemInfo.isDisplayed());
    }







}
