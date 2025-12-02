package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By email_input = By.id("input-email");
    By password_input = By.id("input-password");
    By login_btn = By.xpath("//button[text()='Login']");
    By alert_danger = By.cssSelector(".alert-danger");
    By my_account_header = By.xpath("//h2[contains(text(),'My Account')]");

    // Actions
    public void login(String email, String password) {
        driver.findElement(email_input).sendKeys(email);
        driver.findElement(password_input).sendKeys(password);
        driver.findElement(login_btn).click();
    }

    // Verification methods
    public boolean isLoginSuccessful() {
        try {
            return driver.findElement(my_account_header).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginFailed() {
        try {
            return driver.findElement(alert_danger).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}