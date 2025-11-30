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

//    @Test
//    public void validateSubcategoryDesktopsShownWhenHoverOver()
//    {
//        homePage = new HomePage(driver);
//
//        homePage.navigateHomePage();
//        homePage.hoverOverDesktopsCategory();
//        homePage.assertSubcategoryDesktopsShown();
//
//    }

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
