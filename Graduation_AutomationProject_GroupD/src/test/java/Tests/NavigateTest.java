package Tests;

import Pages.*;
import org.testng.annotations.Test;


public class NavigateTest extends TestBase
{

    HomePage homePage;
    DesktopsPage desktopsPage;
    TabletsPage tabletsPage;
    LaptopsPage laptopsPage;
    ComponentsPage componentsPage;
    SoftwarePage softwarePage;
    PhonesPage phonesPage;
    CamerasPage camerasPage;
    Mp3PlayersPage mp3PlayersPage;

    @Test
    public void validateSuccessfulHomePageNavigation()
    {
        homePage = new HomePage(driver);

        homePage.navigateHomePage();
        homePage.assertSuccessfulNavigation();
    }

    @Test
    public void validateSuccessfulDesktopsCategoryNavigation()
    {
        homePage = new HomePage(driver);
        desktopsPage = new DesktopsPage(driver);

        homePage.navigateHomePage();
        homePage.clickDesktopsCategoryButton();
        desktopsPage.assertDesktopsPageTitleIsdisplayed();
    }

    @Test
    public void validateSuccessfulLaptopsCategoryNavigation()
    {
        homePage = new HomePage(driver);
        laptopsPage = new LaptopsPage(driver);

        homePage.navigateHomePage();
        homePage.clickLaptopsCategoryButton();
        laptopsPage.assertLaptopsPageTitleIsDisplayed();
    }

    @Test
    public void validateSuccessfulComponentsCategoryNavigation()
    {
        homePage = new HomePage(driver);
        componentsPage = new ComponentsPage(driver);

        homePage.navigateHomePage();
        homePage.clickComponentsCategoryButton();
        componentsPage.assertComponentsPageTitleIsDisplayed();
    }

    @Test
    public void validateSuccessfulTabletsCategoryNavigation()
    {
        homePage = new HomePage(driver);
        tabletsPage = new TabletsPage(driver);

        homePage.navigateHomePage();
        homePage.clickTabletsCategoryButton();
        tabletsPage.assertTabletsPageTitleIsdisplayed();
    }

    @Test
    public void validateSuccessfulSoftwareCategoryNavigation()
    {
        homePage = new HomePage(driver);
        softwarePage = new SoftwarePage(driver);

        homePage.navigateHomePage();
        homePage.clickSoftwareCategoryButton();
        softwarePage.assertSoftwarePageTitleIsdisplayed();
    }

    @Test
    public void validateSuccessfulPhonesAndPdasCategoryNavigation()
    {
        homePage = new HomePage(driver);
        phonesPage = new PhonesPage(driver);

        homePage.navigateHomePage();
        homePage.clickPhonesCategoryButton();
        phonesPage.assertPhonesPageTitleIsdisplayed();
    }

    @Test
    public void validateSuccessfulCamerasCategoryNavigation()
    {
        homePage = new HomePage(driver);
        camerasPage = new CamerasPage(driver);

        homePage.navigateHomePage();
        homePage.clickCamerasCategoryButton();
        camerasPage.assertCamerasPageTitleIsdisplayed();
    }

    @Test
    public void validateSuccessfulMp3PlayersCategoryNavigation()
    {
        homePage = new HomePage(driver);
        mp3PlayersPage = new Mp3PlayersPage(driver);

        homePage.navigateHomePage();
        homePage.clickMp3PlayersCategoryButton();
        mp3PlayersPage.assertMp3PlayersPageTitleIsdisplayed();
    }

    @Test
    public void validateDesktopsNavigationFromSubcategory()
    {
        tabletsPage = new TabletsPage(driver);
        desktopsPage = new DesktopsPage(driver);

        tabletsPage.tabletsPageNavigation();
        tabletsPage.clickDesktopsButtonInSubMenu();
        desktopsPage.assertDesktopsPageTitleIsdisplayed();
        desktopsPage.assertReleventProductsShown();
    }

    @Test
    public void hoverOver()
    {
        homePage = new HomePage(driver);

        homePage.navigateHomePage();
        homePage.hoverOverDesktopsCategory();
    }
}
