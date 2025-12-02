package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class WishlistPages {

        WebDriver driver;
        By removeButton = By.cssSelector("button[data-original-title='Remove']");
        By warningAlert = By.cssSelector(".alert-warning");

        public WishlistPages(WebDriver driver){
            this.driver = driver;
        }

        public void openWishlistPage(){
            driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/wishlist");
        }

        public void removeItem(){
            driver.findElement(removeButton).click();
        }

        public String getWarningMessage(){
            return driver.findElement(warningAlert).getText();
        }
    }

