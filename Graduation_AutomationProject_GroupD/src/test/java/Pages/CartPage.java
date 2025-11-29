package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class CartPage extends BasePage{

        public CartPage(WebDriver driver){
            super(driver);
        }

        public boolean isProductInCart(String name){
            By selector = By.xpath("//table//a[text()='"+name+"']");
            return isDisplayed(selector);
        }

        public void removeProduct(String name){
            By selector = By.xpath("//a[text()='"+name+"']/ancestor::tr//button[@data-original-title='Remove']");
            click(selector);
        }

        public boolean isCartEmpty(){
            By emptyMsg = By.xpath("//p[contains(text(),'Your shopping cart is empty')]");
            return isDisplayed(emptyMsg);
        }
    }






