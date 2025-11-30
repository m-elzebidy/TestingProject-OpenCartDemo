package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MonitorsPage
{
    WebDriver driver;

    public MonitorsPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By monitorsPageTitle = By.xpath("//h1[text()='Monitors']");

//    Actions

//    Assertions
    public void assertMonitorsPageTitleIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(monitorsPageTitle).isDisplayed());
    }


}
