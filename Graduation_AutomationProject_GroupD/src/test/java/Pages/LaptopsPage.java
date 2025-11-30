package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Assert.assertTrue(driver.findElement(laptopsPageTitle).isDisplayed());
    }

}
