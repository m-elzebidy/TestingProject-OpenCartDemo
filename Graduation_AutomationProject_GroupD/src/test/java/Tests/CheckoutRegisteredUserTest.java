package Tests;

import Pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutRegisteredUserTest extends TestBase {

    @Test(description = "TC-CHK-001: Verify checkout with registered user")
    public void verifyCheckoutWithRegisteredUser() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Test Steps
        homePage.navigateToLoginPage();
        loginPage.login("m@m.com", "123456");


        homePage.navigate();
        homePage.searchProduct("MacBook");
        productPage.addToCarts();
        productPage.navigateToCart();

        cartPage.proceedToCheckout();



       // softAssert.assertAll();
    }
}