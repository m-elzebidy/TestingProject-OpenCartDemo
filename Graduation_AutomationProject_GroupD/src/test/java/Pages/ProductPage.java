package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    //    Locators
    By addToCartBtn = By.id("button-cart");
    By addToWishlistBtn = By.cssSelector("button[data-original-title='Add to Wish List']");
    By successAlert = By.cssSelector(".alert-success");
    By warningAlert = By.cssSelector(".alert-danger");
    By loginAlert = By.cssSelector(".alert-danger");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    //  Actions
    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void addToWishlist() {
        driver.findElement(addToWishlistBtn).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successAlert).getText();
    }

    public String getWarningMessage() {
        return driver.findElement(loginAlert).getText();
    }

    //    Assertions
}