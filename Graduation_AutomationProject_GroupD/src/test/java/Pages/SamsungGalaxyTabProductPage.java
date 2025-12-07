package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SamsungGalaxyTabProductPage
{
    WebDriver driver;

    public SamsungGalaxyTabProductPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By productTitle = By.xpath("//h1[normalize-space()='Samsung Galaxy Tab 10.1']");

//    Actions

//    Assertions
    public void assertProductTitleContainsIphone()
    {
        Assert.assertTrue(driver.findElement(productTitle).getText().contains("iphone") , "Error : User should navigate to iphone6 PDP but instead navigates to Samsung Galaxy tab PDP");
    }


}
