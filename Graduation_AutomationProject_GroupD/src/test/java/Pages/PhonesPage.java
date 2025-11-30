package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PhonesPage
{
    WebDriver driver;

    public PhonesPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By phonesPageTitle = By.xpath("//h1[text()='Phones & PDAs']");

//    Actions

//    Assertions
    public void assertPhonesPageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(phonesPageTitle).isDisplayed());
    }


}
