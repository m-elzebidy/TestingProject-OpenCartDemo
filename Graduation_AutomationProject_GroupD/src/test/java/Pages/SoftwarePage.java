package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SoftwarePage
{
    WebDriver driver;

    public SoftwarePage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By softwarePageTitle = By.xpath("//h1[text()='Software']");

//    Actions

//    Assertions
    public void assertSoftwarePageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(softwarePageTitle).isDisplayed());
    }


}
