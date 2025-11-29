package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class YourAccountHasBeenCreatedPage {
    WebDriver driver;

    public YourAccountHasBeenCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators of elements
    By success_msg = By.xpath("//*[@id=\"content\"]/h1");
    By continue2_btn = By.xpath("//*[@id=\"content\"]/div/a");

    //Actions
//    public void clickcontinue()
//    {
//       driver.findElement(continue2_btn).click();
//    }

    //Assertions
    public void assertSuccessfulRegister()
    {
        Assert.assertTrue(driver.findElement(success_msg).isDisplayed());
        Assert.assertEquals(driver.findElement(success_msg).getText(),"Your Account Has Been Created!");
        Assert.assertTrue(driver.findElement(continue2_btn).isDisplayed());
    }
}
