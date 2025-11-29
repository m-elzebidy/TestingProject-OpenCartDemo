package StepDef;

    import Pages.CartPage;
    import Pages.HomePage;
    import Pages.ProductPage;
    import io.cucumber.java.en.*;
    import org.testng.Assert;
    import org.openqa.selenium.By;

public class RemoveFromCartSteps {

        HomePage home = new HomePage(Hocks.driver);
        ProductPage productPage = new ProductPage(Hocks.driver);
        CartPage cart = new CartPage(Hocks.driver);

        @When("user removes {string} from the cart")
        public void remove(String product){
            home.openCart();
            Hocks.driver.findElement(By.linkText("View Cart")).click();

            cart.removeProduct(product);
        }

        @Then("the cart should be empty")
        public void cartShouldBeEmpty(){
            Assert.assertTrue(cart.isCartEmpty());
        }
    }

