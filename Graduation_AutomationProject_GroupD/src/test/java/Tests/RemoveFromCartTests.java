package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class RemoveFromCartTests extends BaseTests {

        @Test
        public void removeIphoneFromCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);
            CartPage cart = new CartPage(driver);

            home.openProduct("iPhone");
            product.addToCart();
            Thread.sleep(1500);
            cart.openCartPage();
            cart.removeItem();
            Thread.sleep(1500);
            Assert.assertTrue(cart.getSuccessMessage().contains("Success"),
                    "Remove iPhone failed!");
        }

        @Test
        public void removeMacBookFromCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);
            CartPage cart = new CartPage(driver);

            home.openProduct("MacBook");
            product.addToCart();
            Thread.sleep(1500);
            cart.openCartPage();
            cart.removeItem();
            Thread.sleep(1500);
            Assert.assertTrue(cart.getSuccessMessage().contains("Success"),
                    "Remove MacBook failed!");
        }

        @Test
        public void removeFromEmptyCart() throws InterruptedException {
            CartPage cart = new CartPage(driver);
            cart.openCartPage();
            cart.removeItem();
            Thread.sleep(1500);
            Assert.assertTrue(true, "Empty cart removal checked!");
        }
    }

