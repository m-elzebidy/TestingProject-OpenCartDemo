package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartEditingTest extends TestBase {

    @Test(description = "TC-CHK-004: Verify editing cart items during checkout")
    public void verifyCartEditingDuringCheckout() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Test Steps
        homePage.searchProduct("MacBook");
        productPage.addToCarts();
        productPage.navigateToCart();


        // Update quantity from 1 to 5
        cartPage.updateQuantity(5);

      //  cartPage.proceedToCheckout();

        //softAssert.assertAll();
    }
}