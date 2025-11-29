package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class WishListPage extends BasePage {

        public WishListPage(WebDriver driver){
            super(driver);
        }

        public boolean isInWishlist(String productName){
            By selector = By.xpath("//a[text()='"+productName+"']");
            return isDisplayed(selector);
        }
    }

