package StepDef;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.By;

public class AddToCartSteps {

        HomePage home = new HomePage(Hocks.driver);
        ProductPage productPage = new ProductPage(Hocks.driver);
        CartPage cart = new CartPage(Hocks.driver);

        @Given("user searches for {string}")
        public void search(String product){
            home.searchFor(product);
            home.openProduct(product);
        }

        @When("user adds product to cart")
        public void add(){
            productPage.addToCart();
        }

        @Then("{string} should be in the cart")
        public void verify(String product){
            String msg = productPage.getSuccessMsg();

            Assert.assertTrue(msg.contains("Success:"));
            Assert.assertTrue(msg.contains(product));

            home.openCart();
            Hocks.driver.findElement(By.linkText("View Cart")).click();
            Assert.assertTrue(cart.isProductInCart(product));
        }
    }

