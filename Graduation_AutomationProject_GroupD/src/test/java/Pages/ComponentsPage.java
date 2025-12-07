package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        try {
            WebElement title = driver.findElement(componentsPageTitle);
            Assert.assertTrue(title.isDisplayed(),
                    "Error: User failed to navigate to Components Category page after clicking Components btn");
        } catch (NoSuchElementException e) {
            Assert.fail("Error: User failed to navigate to Components Category page after clicking Components btn");
        }

    }

}
