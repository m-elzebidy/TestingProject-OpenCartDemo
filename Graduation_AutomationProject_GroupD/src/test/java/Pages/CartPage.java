package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators

    By removeButton = By.cssSelector("button[data-original-title='Remove']");
    By successAlert = By.cssSelector(".alert-success");


//  Actions
    public void openCartPage() {
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=checkout/cart");
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successAlert).getText();
    }

//    Assertions


}





