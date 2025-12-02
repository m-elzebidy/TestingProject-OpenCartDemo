package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By guest_checkout_radio =   By.cssSelector("label[for='input-guest']");
    By continue_btn = By.id("button-register");
    By firstname_input = By.name("firstname");
    By lastname_input = By.name("lastname");
    By email_input = By.name("email");
    By city_input = By.name("shipping_city");
    By address1_input = By.name("shipping_address_1");
    By Region_input = By.cssSelector("option[value='1012']");
    By postcode_input = By.name("shipping_postcode");
    By country_dropdown = By.cssSelector("option[value='63']");
    By zone_dropdown = By.id("input-payment-zone");
    By payment_method = By.name("payment_method");
    By terms_checkbox = By.name("agree");
    By confirm_order_btn = By.id("button-confirm");
    By success_message = By.xpath("//h1[contains(text(),'Your order has been placed!')]");
    By validation_error = By.cssSelector(".text-danger");




    // Actions
    public void selectGuestCheckout() {
        driver.findElement(guest_checkout_radio).click();
        //driver.findElement(continue_btn).click();
    }

    public void fillBillingDetails(String firstname, String lastname, String email, String address, String postcode, String city)
    {
        driver.findElement(firstname_input).sendKeys(firstname);
        driver.findElement(lastname_input).sendKeys(lastname);
        driver.findElement(email_input).sendKeys(email);
        driver.findElement(country_dropdown).click();
        driver.findElement(address1_input).sendKeys(address);
        driver.findElement(Region_input).click();
        driver.findElement(postcode_input).sendKeys(postcode);
        driver.findElement(city_input).sendKeys(city);

//        Select countrySelect = new Select(driver.findElement(country_dropdown));
//        countrySelect.selectByVisibleText(country);
//
//        Select zoneSelect = new Select(driver.findElement(zone_dropdown));
//        zoneSelect.selectByVisibleText(zone);
    }

    public void selectPaymentMethod(String method) {
        if (method.equalsIgnoreCase("Cash on Delivery")) {
            driver.findElement(payment_method).click();
        }
    }

    public void continueGuest(){
        driver.findElement(continue_btn).click();

    }

    public void agreeToTerms() {
        driver.findElement(terms_checkbox).click();
    }

    public void confirmOrder() {
        driver.findElement(confirm_order_btn).click();
        wait.until(ExpectedConditions.urlContains("success"));
    }

    // Assertions
    public void assertOrderSuccess() {
        Assert.assertTrue(driver.findElement(success_message).isDisplayed());
    }

    public void assertValidationMessages() {
        Assert.assertTrue(driver.findElements(validation_error).size() > 0);
    }
}