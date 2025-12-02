package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.YourAccountHasBeenCreatedPage;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage;
    YourAccountHasBeenCreatedPage yourAccountHasBeenCreatedPage;

    @Test
    public void validateRegisterWithValidCredentials()
    {
        //TC01 - Validate Register with valid credentials
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail, "ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.assertNewletterIsSelected();
        yourAccountHasBeenCreatedPage.assertSuccessfulRegister();
    }
    @Test
    public  void validateRegisterWith32charaterFirstname()
    {
        //TC02 - Validate Register with 32 character firstname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Maiqwertyuiopasdfghjklzxcvbnmpo","Amr",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.assertNewletterIsSelected();
        yourAccountHasBeenCreatedPage.assertSuccessfulRegister();
    }
    @Test
    public void validateRegisterWith32characterLastname()
    {
        //TC03 - Validate Register with 32 character lastname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amrqwertyuiopasdfghjklzxcvbnmpo",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.assertNewletterIsSelected();
        yourAccountHasBeenCreatedPage.assertSuccessfulRegister();
    }
    @Test
    public void validateRegisterWithInvalidFirstname()
    {
        //TC04 - Validate Register with 1 character firstname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("M","Amr",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFailedRegister();
        registerPage.assertFirstnameErrorMsg();
    }


    @Test
    public void validateRegisterWithInvalidLastname()
    {
        //TC05 - Validate Register with 1 character lastname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","A",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFailedRegister();
        registerPage.assertLastnameErrorMsg();
    }
    @Test
    public void validateRegisterWithMoreThan32charaterFirstname()
    {
        //TC06 - Validate Register with more than 32 characters firstname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("MaiAmrqwertyuiopasdfghjklzxcvbnmpo","Amr",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFailedRegister();
        registerPage.assertFirstnameErrorMsg();
    }
    @Test
    public void validateRegisterWithMoreThan32characterLastname()
    {
        //TC07 - Validate Register with more than 32 characters lastname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amrqwertyuiopasdfghjklzxcvbnmpouytre",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFailedRegister();
        registerPage.assertLastnameErrorMsg();
    }

    @Test
    public void validateRegisterWithEmptyFirstname()
    {
        //TC08 - Validate Register with empty firstname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("","Amr",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFirstnameErrorMsg();
    }

    @Test
    public void validateRegisterWithEmptyLastname()
    {
        //TC09 - Validate Register with empty lastname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertLastnameErrorMsg();
    }
    @Test
    public void validateRegisterWithBothEmptyFirstnameAndLastname()
    {
        //TC10 - Validate Register with both empty firstname and lastname
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("","",dynamicEmail,"ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertFirstnameErrorMsg();
        registerPage.assertLastnameErrorMsg();
    }

    @Test
    public void validateRegisterWithInvalidEmail()
    {
        //TC11 - Validate Register with invalid email
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        registerPage.register("Mai","Amr","maiamr","ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertinvalidFmailErrorMsg();

    }

    @Test
    public void validateRegisterWithEmptyEmail() {
        //TC12 - Validate Register with empty email
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        registerPage.register("Mai", "Amr", "", "ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertNewletterIsSelected();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.assertEmailErrorMsg();

    }
    @Test
    public void validateRegisterWithAlreadyRegisteredEmail()
    {
        //TC13 - Validate Register with already registered email
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        registerPage.register("Mai","Amr","keyahip582@chaineor.com","ABC123");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertRegisteredEmailErrorMsg();
    }
    @Test
    public void validateRegisterWith40charactersPassword()
    {
        //TC14 - Validate Register with valid credentials
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail, "ABCDEFG1234567890HIJKLMNOPqrstuvwxyz0098");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.assertNewletterIsSelected();
        yourAccountHasBeenCreatedPage.assertSuccessfulRegister();
    }
    @Test
    public void validateRegisterWithMoreThan40characterPassword()
    {
        //TC015 - Validate Register with 1 character password
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail,"ABCDEFG1234567890HIJKLMNOPqrstuvwxyz009877");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.assertNewletterIsSelected();
        registerPage.assertPrivacyPolicyIsSelected();
        registerPage.ClickContinue1();
        registerPage.assertPasswordErrorMsg();
    }
    @Test
    public void validateRegisterWithInvalidPassword()
    {
        //TC016 - Validate Register with 1 character password
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail,"A");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPasswordErrorMsg();

    }

    @Test
    public void validateRegisterWithEmptyPassword()
    {
        //TC17 - Validate Register with empty password
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail,"");
        registerPage.scrollDownAndClick1();
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertNewletterIsSelected();
        registerPage.assertPasswordErrorMsg();
    }

    @Test
    public void validateRegisterWithoutAgreeToPrivacyPolicy()
    {
        //TC18 - Validate Register without agree to privacy policy
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail,"ABC123");
        registerPage.scrollDownToPrivacypolicy();
        registerPage.scrollDownAndClick1();
        registerPage.ClickContinue1();
        registerPage.assertNewletterIsSelected();
        registerPage.assertAgreementErrorMsg();
    }

    @Test
    public void validateRegisterWithoutSubscribe()
    {
        //TC19 - Validate Register without subscribe
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        yourAccountHasBeenCreatedPage = new YourAccountHasBeenCreatedPage(driver);
        homePage.navigate();
        registerPage.navigate();
        // 🔹 توليد الإيميل الديناميكي
        String dynamicEmail = registerPage.generateRandomEmail();
        registerPage.register("Mai","Amr",dynamicEmail, "ABC123");
        registerPage.scrollDownToPrivacypolicy();
        registerPage.ClickPrivacyPolicy();
        registerPage.ClickContinue1();
        registerPage.assertPrivacyPolicyIsSelected();
        yourAccountHasBeenCreatedPage.assertSuccessfulRegister();
    }


}
