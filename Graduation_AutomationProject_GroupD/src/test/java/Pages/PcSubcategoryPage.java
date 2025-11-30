package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PcSubcategoryPage
{
    WebDriver driver;

    public PcSubcategoryPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By pcPageTitle = By.xpath("//h1[text()='PC']");

//    Actions

//    Assertions
    public void assertPcPageTitleIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(pcPageTitle).isDisplayed());
    }

}
