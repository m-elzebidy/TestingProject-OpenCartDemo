package StepDef;

import Pages.HomePage;
import Pages.ProductPage;
import Pages.WishListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WishListSteps {

        HomePage home = new HomePage(Hocks.driver);
        ProductPage productPage = new ProductPage(Hocks.driver);
        WishListPage wishlist = new WishListPage(Hocks.driver);

        @When("user adds product to wishlist")
        public void addWishlist(){
            productPage.addToWishlist();
        }

        @Then("{string} should be in the wishlist")
        public void verify(String product){
            String msg = productPage.getSuccessMsg();
            Assert.assertTrue(msg.contains("Success:"));

            home.openWishlist();
            Assert.assertTrue(wishlist.isInWishlist(product));
        }
    }

