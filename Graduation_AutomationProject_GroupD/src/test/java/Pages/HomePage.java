package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class HomePage
{
    WebDriver driver;
    Actions actions;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }


    //Locators
    By carousel = By.className("carousel-inner");
    By desktopCategoryButton = By.cssSelector("a.nav-link.dropdown-toggle");
    By laptopsCategoryButton = By.xpath("//a[normalize-space(text())='Laptops & Notebooks']");
    By tabletsCategoryButton = By.xpath("//a[normalize-space(text())='Tablets']");

    By showAllDesktopsButton = By.xpath("//a[normalize-space(text())='Show All Desktops']");
    By myAccount_list = By.className("dropdown");
    By register_item = By.xpath("//*[@id=\"top\"]/div/div/div[2]/ul/li[2]/div/ul/li[1]/a]");

    By searchInput = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");
    By cartButton   = By.id("cart");
    By wishlistButton = By.id("wishlist-total");


    //Actions
    public void navigateHomePage()
    {
        driver.get("http://localhost/opencartproject/");
    }

    public void clickDesktopsCategoryButton()
    {
        driver.findElement(desktopCategoryButton).click();
    }

    public void clickTabletsCategoryButton()
    {
        driver.findElement(tabletsCategoryButton).click();
    }

    public void hoverOverDesktopsCategory()
    {
        actions.moveToElement(driver.findElement(desktopCategoryButton)).perform();
        driver.findElement(showAllDesktopsButton).click();
    }

    // Search for product
    public void searchFor(String product){
        driver.findElement(searchInput).sendKeys(product);
        driver.findElement(searchButton).click();
    }

    // Open product page
    public void openProduct(String product){
        driver.findElement(By.linkText(product)).click();
    }

    // Open shopping cart
    public void openCart(){
        driver.findElement(cartButton).click();
    }

    // Open wishlist
    public void openWishlist(){
        driver.findElement(wishlistButton).click();
    }



    //Assertions
    public void assertSubcategoryDesktopsShown()
    {
        Assert.assertTrue(driver.findElement(showAllDesktopsButton).isDisplayed());
        driver.findElement(showAllDesktopsButton).click();
    }
    public void assertSuccessfulNavigation()
    {
        Assert.assertTrue(driver.findElement(carousel).isDisplayed());
    }


}
