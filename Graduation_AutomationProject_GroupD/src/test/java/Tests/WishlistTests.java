package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import Pages.WishlistPages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class WishlistTests extends BaseTests {

        @Test
        public void addToWishlistWithoutLogin() throws InterruptedException {
            HomePage home = new HomePage(driver);
            home.openProduct("MacBook");
            ProductPage product = new ProductPage(driver);
            product.addToWishlist();
            Thread.sleep(1500);
            Assert.assertTrue(product.getWarningMessage().contains("You must login or create an account"),
                    "Login warning NOT displayed!");
        }

        @Test
        public void addToWishlistAfterLogin() throws InterruptedException {
            // login steps (simplified)
            driver.findElement(By.linkText("My Account")).click();
            driver.findElement(By.linkText("Login")).click();
            driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
            driver.findElement(By.id("input-password")).sendKeys("123456");
            driver.findElement(By.cssSelector("input[value='Login']")).click();

            HomePage home = new HomePage(driver);
            home.openProduct("MacBook");
            ProductPage product = new ProductPage(driver);
            product.addToWishlist();
            Thread.sleep(1500);
            Assert.assertTrue(product.getSuccessMessage().contains("Success: You have added MacBook"),
                    "MacBook NOT added to wishlist!");
        }

        @Test
        public void removeFromWishlistInvalidToken() throws InterruptedException {
            WishlistPages wishlist = new WishlistPages(driver);
            wishlist.openWishlistPage();
            wishlist.removeItem();
            Thread.sleep(1500);
            Assert.assertTrue(wishlist.getWarningMessage().contains("Invalid token"),
                    "Invalid token warning NOT displayed!");
        }
    }

