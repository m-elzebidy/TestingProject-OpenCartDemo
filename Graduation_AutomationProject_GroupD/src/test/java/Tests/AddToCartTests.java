package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class AddToCartTests extends BaseTests {

        @Test
        public void addIphoneToCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);
            home.openIphonePage();
            product.addToCart();
            Thread.sleep(1500);
            Assert.assertTrue(product.getSuccessMessage().contains("Success: You have added iPhone"),
                    "iPhone NOT added to cart!");
        }

        @Test
        public void addMacBookToCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);
            home.openLaptops();
            driver.findElement(By.linkText("MacBook")).click();
            product.addToCart();
            Thread.sleep(1500);
            Assert.assertTrue(product.getSuccessMessage().contains("Success: You have added MacBook"),
                    "MacBook NOT added to cart!");
        }

        @Test
        public void addIphoneTwiceToCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);
            home.openIphonePage();
            product.addToCart();
            product.addToCart();
            Thread.sleep(1500);
            Assert.assertTrue(product.getSuccessMessage().contains("Success: You have added iPhone"),
                    "Duplicate iPhone add failed!");
        }

        @Test
        public void addMultipleProductsToCart() throws InterruptedException {
            HomePage home = new HomePage(driver);
            ProductPage product = new ProductPage(driver);

            home.openIphonePage();
            product.addToCart();
            home.openLaptops();
            driver.findElement(By.linkText("MacBook")).click();
            product.addToCart();

            Thread.sleep(1500);
            Assert.assertTrue(product.getSuccessMessage().contains("Success"),
                    "Adding multiple products failed!");
        }
    }

