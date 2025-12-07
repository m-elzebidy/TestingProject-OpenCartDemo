package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LaptopsPage
{
    WebDriver driver;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By laptopsPageTitle = By.xpath("//h1[text()='Laptops & Notebooks']");

//    Actions

//    Assertions
    public void assertLaptopsPageTitleIsDisplayed()
    {
        try {
            WebElement title = driver.findElement(laptopsPageTitle);
            Assert.assertTrue(title.isDisplayed(),
                    "Error: User failed to navigate to Laptops Category page after clicking Laptops btn");
        } catch (NoSuchElementException e) {
            Assert.fail("Error: User failed to navigate to Laptops Category page after clicking Laptops btn");
        }

    }

}
