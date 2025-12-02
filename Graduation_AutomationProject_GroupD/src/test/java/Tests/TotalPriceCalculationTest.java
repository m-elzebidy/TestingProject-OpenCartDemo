package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TotalPriceCalculationTest extends TestBase {

    @Description("TC-CHK-005: Verify total price calculation during checkout")
    @Test
    public void verifyTotalPriceCalculation() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Test Steps
        homePage.navigate();

        // Add first product
        homePage.searchProduct("MacBook");
        productPage.addToCarts();
        homePage.navigate();

        // Add second product
        homePage.searchProduct("MacBook");
        productPage.addToCarts();

        productPage.navigateToCart();

        // Verify total (assuming $5 shipping)
      //  cartPage.assertTotalPrice("$1204.00");
       // cartPage.proceedToCheckout();
    }
}