package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RegisterPage {
    WebDriver driver;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators of elements
    By firstname_textBox = By.id("input-firstname");
    By lastname_textBox = By.id("input-lastname");
    By email_textBox = By.id("input-email");
    By password_textBox = By.id("input-password");
    By newsletter_checkBox = By.xpath("//*[@id=\"input-newsletter\"]");
    By agree_checkBox = By.xpath("//*[@id=\"form-register\"]/div/div/input");
    By continue1_btn = By.xpath("//*[@id=\"form-register\"]/div/button");
    By firstname_error_msg = By.id("error-firstname");
    By lastname_error_msg = By.id("error-lastname");
    By email_error_msg = By.id("error-email");
    By password_error_msg = By.id("error-password");
    By registered_email_error_msg = By.id("alert");
    By agreement_error_msg = By.id("alert");

    //Actions
     public String generateRandomEmail() {
            long timestamp = System.currentTimeMillis(); // رقم فريد لكل ثانية
            return "test" + timestamp + "@mail.com";
     }

    public void navigate()
    {
        driver.get("http://localhost/opencartproject/index.php?route=account/register&language=en-gb");
    }


    public void register(String firstname, String lastname, String email, String password)
     {

         driver.findElement(firstname_textBox).sendKeys(firstname);
         driver.findElement(lastname_textBox).sendKeys(lastname);
         driver.findElement(email_textBox).sendKeys(email);
         driver.findElement(password_textBox).sendKeys(password);

     }


    public void scrollDownAndClick1() {
        WebElement element = driver.findElement(newsletter_checkBox);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        element.click();
    }


    public void scrollDownToPrivacypolicy()
    {
        WebElement element1 = driver.findElement(agree_checkBox);

        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform();


//        element1.click();
    }
    public void ClickPrivacyPolicy()
    {
        driver.findElement(agree_checkBox).click();
    }


    public void ClickContinue1()
    {
        driver.findElement(continue1_btn).click();
    }

     //Assertions
    public void assertNewletterIsSelected()
    {
        Assert.assertTrue(driver.findElement(newsletter_checkBox).isSelected());

    }
    public void assertPrivacyPolicyIsSelected()
    {
        Assert.assertTrue(driver.findElement(agree_checkBox).isSelected());
    }

    public void assertFailedRegister()
    {
        Assert.assertTrue(driver.findElement(continue1_btn).isDisplayed());
    }
    public void assertFirstnameErrorMsg()
    {
        Assert.assertTrue(driver.findElement(firstname_error_msg).isDisplayed());
        Assert.assertTrue(driver.findElement(firstname_error_msg).getText().contains("First Name must be between 3 and 32 characters!"));
    }
    public void assertLastnameErrorMsg()
    {
        Assert.assertTrue(driver.findElement(lastname_error_msg).isDisplayed());
        Assert.assertTrue(driver.findElement(lastname_error_msg).getText().contains("Last Name must be between 3 and 32 characters!"));
    }
    public void assertEmailErrorMsg()
    {
        Assert.assertTrue(driver.findElement(email_error_msg).isDisplayed());
        Assert.assertEquals(driver.findElement(email_error_msg).getText(),"E-Mail Address does not appear to be valid!");
    }
    public void assertinvalidFmailErrorMsg()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String msg = (String) js.executeScript("return arguments[0].validationMessage;", driver.findElement(email_textBox));
        Assert.assertEquals(msg , "Please include an '@' in the email address. 'maiamr' is missing an '@'.");
    }
    public void assertRegisteredEmailErrorMsg()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(driver.findElement(registered_email_error_msg).isDisplayed());
        Assert.assertEquals(driver.findElement(registered_email_error_msg).getText(),"Warning: E-Mail Address is already registered!");
    }
    public void assertPasswordErrorMsg()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(driver.findElement(password_error_msg).isDisplayed());
        Assert.assertEquals(driver.findElement(password_error_msg).getText(),"Password must be between 6 and 40 characters!");
    }
    public void assertAgreementErrorMsg()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(driver.findElement(agreement_error_msg).isDisplayed());
        Assert.assertEquals(driver.findElement(agreement_error_msg).getText(),"Warning: You must agree to the Privacy Policy!");

    }


}
