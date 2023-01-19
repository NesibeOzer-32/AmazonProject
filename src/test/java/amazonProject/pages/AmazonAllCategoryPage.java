package amazonProject.pages;

import amazonProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAllCategoryPage {

    public AmazonAllCategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allNavigationBarBtn;

    @FindBy(xpath = "(//a[@class='hmenu-item'])[5]")
    public WebElement ComputersModule;

    @FindBy(xpath = "//a[.='Computers & Tablets']")
    public WebElement ComputerTabletsModule;

    @FindBy(xpath = "//span[.='RESULTS']")
    public WebElement resultText;

    @FindBy(xpath = "//span[.=\"Laptops\"]")
    public WebElement laptopsModule;

    @FindBy(xpath = "(//span[.='& Up'])[2]")
    public WebElement avgCustomerReviewModule;

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[4]")
    public WebElement ASUS;

    @FindBy(id = "low-price")
    public WebElement lowPrice;

    @FindBy(id = "high-price")
    public WebElement maxPrice;

    @FindBy(xpath = "//span[@class='a-button a-spacing-top-mini a-button-base s-small-margin-left']")
    public WebElement goBtn;

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[17]")
    public WebElement ProcessorCountTwelve;

    @FindBy(xpath = "(//I[@class='a-icon a-icon-checkbox'])[15]")
    public WebElement displaySize;
    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public WebElement laptop;

    @FindBy(xpath = "//h1[.=' About this item ']")
    public WebElement LaptopInfo;

    @FindBy(id = "add-to-cart-button")
    public WebElement AddToCartBtn;

    @FindBy(id = "buy-now-button")
    public WebElement BuyNowBtn;

    @FindBy(xpath = "//a[.='Visit the help section']")
    public WebElement helpSectionModule;

    @FindBy(xpath = "(//a[.='Amazon Assistant'])[1]")
    public WebElement amazonAssistant;

    @FindBy(xpath = "//h1[.='Amazon Assistant']")
    public WebElement amazonAssistantText;

    @FindBy(xpath = "//input[@class='a-input-text a-span12']")
    public WebElement FindMoreSolutionsField;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div/div[3]/div/div/h2/a")
    public WebElement BrokenItemBtn;

    @FindBy(xpath = "//h1[.='Replace a Damaged, Defective, or Broken Item ']")
    public WebElement brokenItemInfo;

    @FindBy(xpath = "//span[.='United States']")
    public WebElement LocationUSA;









}
