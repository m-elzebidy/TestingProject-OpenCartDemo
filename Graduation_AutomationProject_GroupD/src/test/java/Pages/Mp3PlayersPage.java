package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Mp3PlayersPage
{
    WebDriver driver;

    public Mp3PlayersPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By mp3PlayersPageTitle = By.xpath("//h1[text()='MP3 Players']");

//    Actions

//    Assertions
    public void assertMp3PlayersPageTitleIsdisplayed()
    {
        Assert.assertTrue(driver.findElement(mp3PlayersPageTitle).isDisplayed());
    }


}
