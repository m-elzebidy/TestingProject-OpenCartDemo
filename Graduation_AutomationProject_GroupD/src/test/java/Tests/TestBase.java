package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase
{
    WebDriver driver;

    @BeforeMethod
    public void precondition()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}

//JavascriptExecutor js = (JavascriptExecutor) driver;
//String msg = (String) js.executeScript("return arguments[0].validationMessage;", driver.findElement(email_textBox));
//Assert.assertEquals(msg , "E-Mail Address does not appear to be valid!");
