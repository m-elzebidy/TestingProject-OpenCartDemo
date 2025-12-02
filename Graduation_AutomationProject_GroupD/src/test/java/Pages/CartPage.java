package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators

    By checkout_btn = By.partialLinkText("Checkout");
    By quantity_input = By.cssSelector("input[name*='quantity']");
    By update_btn = By.cssSelector("button.btn.btn-primary[formaction*='cart.edit']");
    By total_price = By.xpath("//td[contains(text(),'$')]");
    By empty_cart_msg = By.xpath("//p[text()='Your shopping cart is empty!']");
    By product_name = By.xpath("//td[@class='text-start']/a");

    By removeButton = By.cssSelector("button[data-original-title='Remove']");
    By successAlert = By.cssSelector(".alert-success");



    // Actions
    public void proceedToCheckout() {
        driver.findElement(checkout_btn).click();
    }

    public void updateQuantity(int quantity) {
        driver.findElement(quantity_input).clear();
        driver.findElement(quantity_input).sendKeys(String.valueOf(quantity));
        driver.findElement(update_btn).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(update_btn));
    }

    public void removeProduct() {
        By remove_btn = By.cssSelector("button[data-original-title='Remove']");
        driver.findElement(remove_btn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(empty_cart_msg));
    }

    // New verification methods
    public boolean isProductInCart(String productName) {
        try {
            return driver.findElement(product_name).getText().contains(productName);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public double getTotalPrice() {
        try {
            String priceText = driver.findElement(total_price).getText();
            priceText = priceText.replaceAll("[^0-9.]", "");
            return Double.parseDouble(priceText);
        } catch (Exception e) {
            return 0.0;
        }
    }

    public boolean isCartEmpty() {
        try {
            return driver.findElement(empty_cart_msg).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public void openCartPage() {
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=checkout/cart");
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successAlert).getText();
    }
}





