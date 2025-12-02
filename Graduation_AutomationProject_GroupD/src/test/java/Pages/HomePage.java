package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class HomePage
{
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    //Locators
    By carousel = By.className("carousel-inner");
    By desktopCategoryButton = By.cssSelector("a.nav-link.dropdown-toggle");
    By laptopsCategoryButton = By.xpath("//a[text()='Laptops & Notebooks']");
    By componentsCategoryButton = By.xpath("//a[text()='Components']");
    By tabletsCategoryButton = By.xpath("//a[normalize-space(text())='Tablets']");
    By softwareCategoryButton = By.xpath("//a[text()='Software']");
    By phonesCategoryButton = By.xpath("//a[text()='Phones & PDAs']");
    By camerasCategoryButton = By.xpath("//a[text()='Cameras']");
    By mp3PlayersCategoryButton = By.xpath("//a[text()='MP3 Players']");

    By pcHoverLinkBtn = By.xpath("//a[contains(@class,'dropdown-item') and contains(text(),'PC')]");
    By monitorsHoverLinkBtn = By.xpath("//a[@class='dropdown-item' and normalize-space()='Monitors (2)']");
    By showAllDesktopsButton = By.xpath("//a[normalize-space(text())='Show All Desktops']");
    By showAllLaptopsButton = By.xpath("//a[normalize-space(text())='Show All Laptops & Notebooks']");
    By showAllTabletsButton = By.xpath("//a[normalize-space(text())='Show All Tablets']");

    By myAccount_list = By.className("dropdown");
    By register_item = By.xpath("//*[@id=\"top\"]/div/div/div[2]/ul/li[2]/div/ul/li[1]/a]");

    By iPhone = By.linkText("iPhone");
    By showAllLaptops = By.linkText("Show All Laptops & Notebooks");
    By macbook = By.linkText("MacBook");
    By laptopsMenu = By.linkText("Laptops & Notebooks");


    // Example products
    By macbookProduct = By.linkText("MacBook");
    By hpLaptopProduct = By.linkText("HP LP3065");
    By sonyLaptopProduct = By.linkText("Sony VAIO");

    // Add to cart buttons
    By macAddToCartBtn = By.xpath("//a[text()='MacBook']/../following-sibling::div//button[contains(@onclick,'cart')]");
    By hpAddToCartBtn = By.xpath("//a[text()='HP LP3065']/../following-sibling::div//button[contains(@onclick,'cart')]");
    By sonyAddToCartBtn = By.xpath("//a[text()='Sony VAIO']/../following-sibling::div//button[contains(@onclick,'cart')]");

    // Success messages
    By successAlert = By.cssSelector("div.alert.alert-success");

    // Wishlist icon
    By macWishlistBtn = By.xpath("//a[text()='MacBook']/../following-sibling::div//button[contains(@onclick,'wishlist')]");
    By sonyWishlistBtn = By.xpath("//a[text()='Sony VAIO']/../following-sibling::div//button[contains(@onclick,'wishlist')]");

    By myAccount_dropdown = By.xpath("//span[text()='My Account']");
    By login_link = By.linkText("Login");
    By logout_link = By.linkText("Logout");
    By cart_btn = By.id("cart-total");
    By product_search = By.name("search");
    By search_btn = By.xpath("//button[@type='submit' and @class='btn btn-light btn-lg']");

    //Actions
    public void navigateHomePage()
    {
        driver.get("http://localhost/opencartproject/");
    }

    public void navigate()
    {
        driver.get("http://localhost/opencartProject/");
    }


    public void clickDesktopsCategoryButton()
    {
        driver.findElement(desktopCategoryButton).click();
    }

    public void clickLaptopsCategoryButton()
    {
        driver.findElement(laptopsCategoryButton).click();
    }

    public void clickComponentsCategoryButton()
    {
        driver.findElement(componentsCategoryButton).click();
    }

    public void clickTabletsCategoryButton()
    {
        driver.findElement(tabletsCategoryButton).click();
    }

    public void clickSoftwareCategoryButton()
    {
        driver.findElement(softwareCategoryButton).click();
    }

    public void clickPhonesCategoryButton()
    {
        driver.findElement(phonesCategoryButton).click();
    }

    public void clickCamerasCategoryButton()
    {
        driver.findElement(camerasCategoryButton).click();
    }

    public void clickMp3PlayersCategoryButton()
    {
        driver.findElement(mp3PlayersCategoryButton).click();
    }

    public void validateHoverOverDesktopsCategory()
    {
        actions.moveToElement(driver.findElement(desktopCategoryButton)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(showAllDesktopsButton)));
        Assert.assertTrue(driver.findElement(showAllDesktopsButton).isDisplayed());
    }

    public void validateHoverOverLaptopsCategory()
    {
        actions.moveToElement(driver.findElement(laptopsCategoryButton)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(showAllLaptopsButton)));
        Assert.assertTrue(driver.findElement(showAllLaptopsButton).isDisplayed());
    }

    public void validateHoverOverTabletsCategory()
    {
        actions.moveToElement(driver.findElement(tabletsCategoryButton)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(showAllTabletsButton)));
        Assert.assertTrue(driver.findElement(showAllTabletsButton).isDisplayed());
    }

    public void clickPcAfterHoverDesktopCategory()
    {
        actions.moveToElement(driver.findElement(desktopCategoryButton)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pcHoverLinkBtn)));
        driver.findElement(pcHoverLinkBtn).click();
    }

    public void clickMonitorsAfterHoverComponentsCategory()
    {
        actions.moveToElement(driver.findElement(componentsCategoryButton)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(monitorsHoverLinkBtn)));
        driver.findElement(monitorsHoverLinkBtn).click();
    }

    public void openIphonePage() {
        driver.findElement(iPhone).click();
    }

    public void openLaptopsPage() {
        driver.findElement(laptopsMenu).click();
        driver.findElement(showAllLaptops).click();
    }

    public void openMacbookPage() {
        driver.findElement(macbook).click();
    }

    public void openLaptops() {
    }

    public void openProduct(String iPhone) {
    }


    public String getSuccessMessage() {
        return driver.findElement(successAlert).getText();
    }

    public void navigateToLoginPage() {
        driver.findElement(myAccount_dropdown).click();
        driver.findElement(login_link).click();
    }

    public void logout() {
        driver.findElement(myAccount_dropdown).click();
        driver.findElement(logout_link).click();
    }

    public void searchProduct(String productName) {
        driver.findElement(product_search).sendKeys(productName);
        driver.findElement(search_btn).click();
    }

    //Assertions
    public void assertSubcategoryDesktopsShown()
    {
        Assert.assertTrue(driver.findElement(showAllDesktopsButton).isDisplayed());
    }
    public void assertSuccessfulNavigation()
    {
        Assert.assertEquals(driver.getCurrentUrl() , "http://localhost/opencartproject/");
        Assert.assertTrue(driver.findElement(carousel).isDisplayed());
    }

    public void assertNavigationToHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost/opencart/");
    }


}
