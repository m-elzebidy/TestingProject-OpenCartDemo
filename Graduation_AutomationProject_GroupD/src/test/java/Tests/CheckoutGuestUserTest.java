package Tests;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutGuestUserTest extends TestBase {

    @Test(description = "TC-CHK-002: Verify checkout with guest user")
    public void verifyCheckoutWithGuestUser() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Test Steps
        homePage.searchProduct("MacBook");
        productPage.addToCarts();
        productPage.navigateToCart();

        cartPage.proceedToCheckout();


        checkoutPage.selectGuestCheckout();

        checkoutPage.fillBillingDetails("John", "Doe", "john.doe@test.com",
                "1 main street", "12345", "Banha");

        checkoutPage.continueGuest();


        // checkoutPage.selectPaymentMethod("Cash on Delivery");
        // checkoutPage.agreeToTerms();
        // checkoutPage.confirmOrder();

       // softAssert.assertAll();
    }
}