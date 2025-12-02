package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;

    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    // Locators
    By addToCart_btn = By.id("button-cart");
    By cart_btn = By.cssSelector("button[data-bs-toggle='dropdown']");
    By viewCart_link = By.xpath("//strong[contains(text(),'View Cart')]");
    By quantity_input = By.id("input-quantity");
    By success_alert = By.cssSelector(".alert-success");

    By addToCartBtn = By.id("button-cart");
    By addToWishlistBtn = By.cssSelector("button[data-original-title='Add to Wish List']");
    By successAlert = By.cssSelector(".alert-success");
    By warningAlert = By.cssSelector(".alert-danger");
    By loginAlert = By.cssSelector(".alert-danger");

    // Actions
    public void addToCarts() {
        driver.navigate().refresh();

        driver.findElement(By.linkText("MacBook")).click();

        driver.findElement(addToCart_btn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(success_alert));
    }

    public void setQuantity(int quantity) {
        driver.findElement(quantity_input).clear();
        driver.findElement(quantity_input).sendKeys(String.valueOf(quantity));
    }

    public void navigateToCart() {
        driver.navigate().refresh();
        driver.findElement(cart_btn).click();
        driver.findElement(viewCart_link).click();
    }

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
}