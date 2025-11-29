package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TabletsPage
{
    WebDriver driver;

    public TabletsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By tabletsPageTitle = By.xpath("//h1[text()='Tablets']");
    By desktopsButtonInSubMenu = By.xpath("//a[normalize-space(text())='Desktops (13)']");


    //Actions
    public void tabletsPageNavigation()
    {
        driver.get("http://localhost/opencartproject/index.php?route=product/category&language=en-gb&path=57");
    }
    public void clickDesktopsButtonInSubMenu()
    {
        driver.findElement(desktopsButtonInSubMenu).click();
    }


    //Assertions
    public void assertTabletsPageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(tabletsPageTitle).isDisplayed());
    }


}
