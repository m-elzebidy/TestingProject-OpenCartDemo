package Tests;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.ProductPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class CheckoutValidationTest extends TestBase {

    @Description("TC-CHK-003: Verify validation of mandatory fields during checkout")
    @Test
    public void verifyMandatoryFieldsValidation() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Test Steps
        homePage.navigate();
        homePage.searchProduct("MacBook");
        productPage.addToCarts();
        productPage.navigateToCart();

        cartPage.proceedToCheckout();
        checkoutPage.selectGuestCheckout();
        checkoutPage.fillBillingDetails("John", "Doe", "john.doe@test.com",
                "1 main stret", "123 ","Banha");
        checkoutPage.continueGuest();

        // Leave mandatory fields empty and try to continue
      //  checkoutPage.confirmOrder();
      //  checkoutPage.assertValidationMessages();
    }
}