package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        try {
            WebElement title = driver.findElement(mp3PlayersPageTitle);
            Assert.assertTrue(title.isDisplayed(),
                    "Error: User failed to navigate to Mp3Players Category page after clicking Mp3Players btn");
        } catch (NoSuchElementException e) {
            Assert.fail("Error: User failed to navigate to Mp3Players Category page after clicking Mp3Players btn");
        }

    }


}
