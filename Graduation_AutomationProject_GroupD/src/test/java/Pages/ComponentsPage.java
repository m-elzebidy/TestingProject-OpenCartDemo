package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ComponentsPage
{
    WebDriver driver;

    public ComponentsPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By componentsPageTitle = By.xpath("//h1[text()='Components']");

//    Actions

//    Assertions
    public void assertComponentsPageTitleIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(componentsPageTitle).isDisplayed());
    }

}
