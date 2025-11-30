package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CamerasPage
{
    WebDriver driver;

    public CamerasPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By camerasPageTitle = By.xpath("//h1[text()='Cameras']");

//    Actions

//    Assertions
    public void assertCamerasPageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(camerasPageTitle).isDisplayed());
    }


}
