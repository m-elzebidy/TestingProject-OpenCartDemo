package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DesktopsPage {
    WebDriver driver;
    String text;
    String numberOnly;


    public DesktopsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By desktopPageTitle = By.xpath("//h1[text()='Desktops']");
    By desktopsButtonInSubMenu = By.xpath("//a[normalize-space(text())='Desktops (13)']");
    By pcButtonInSubMenu = By.xpath("//a[contains(text(),'- PC')]");
    By macButtonInSubMenu = By.xpath("//a[contains(text(),'- Mac')]");

    //Actions


    //Assertions
    public void assertDesktopsPageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(desktopPageTitle).isDisplayed());
    }
    public void assertReleventProductsShown()
    {
        WebElement desktopsElement = driver.findElement(desktopsButtonInSubMenu);
        text = desktopsElement.getText();
        numberOnly = text.replaceAll("[^0-9]", "");
        int desktopsCount = Integer.parseInt(numberOnly);

        WebElement pcElement = driver.findElement(pcButtonInSubMenu);
        text = pcElement.getText();
        numberOnly = text.replaceAll("[^0-9]", "");
        int pcCount = Integer.parseInt(numberOnly);

        WebElement macElement = driver.findElement(macButtonInSubMenu);
        text = macElement.getText();
        numberOnly = text.replaceAll("[^0-9]", "");
        int macCount = Integer.parseInt(numberOnly);

        Assert.assertEquals(desktopsCount,pcCount+macCount);


    }


}
