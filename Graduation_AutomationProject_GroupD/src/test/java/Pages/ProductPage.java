package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

        private By addToCartBtn = By.id("button-cart");
        private By wishlistBtn  = By.cssSelector("button[data-original-title='Add to Wish List']");
        private By successMsg   = By.cssSelector(".alert.alert-success");

        public ProductPage(WebDriver driver){
            super(driver);
        }

        public void addToCart(){
            click(addToCartBtn);
        }

        public void addToWishlist(){
            click(wishlistBtn);
        }

        public String getSuccessMsg(){
            return getText(successMsg);
        }
    }

