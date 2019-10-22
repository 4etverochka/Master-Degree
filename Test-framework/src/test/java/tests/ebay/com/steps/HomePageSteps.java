package tests.ebay.com.steps;

import app.core.elements.ebay.com.pages.HomePage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static app.core.elements.ebay.com.pages.HomePage.PAGE_URL;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

@Log4j2
public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Open home page.")
    public HomePageSteps openPage() {
        log.info("Open home page.");
        open(PAGE_URL);
        homePage = new HomePage();

        return this;
    }

    @Step("Click on 'sign in' link.")
    public LoginPageSteps clickOnSignInLink() {
        log.info("Click on 'sign in' link.");
        homePage.getSignInLink()
                .shouldBe(visible)
                .click();

        return new LoginPageSteps();
    }

    @Step("Check logged user name.")
    public HomePageSteps checkLoggedUserName(String expectedUserName) {
        log.info("Check logged user name.");
        assertTrue(homePage.getHeaderFragment()
                .getLoggedUserName()
                .getText()
                .contains(expectedUserName));

        return this;
    }

    @Step("Enter {searchText} into search field.")
    public HomePageSteps enterIntoSearchField(String searchText) {
        log.info("Enter "+searchText+" into search field.");
        homePage.getSearchFragment()
                .getSearchField()
                .shouldBe(visible)
                .sendKeys(searchText);

        return this;
    }

    @Step("Choose {categoryNumber} category.")
    public HomePageSteps chooseCategory(int categoryNumber) {
        log.info("Choose "+categoryNumber+" category.");
        homePage.getSearchFragment()
                .getCategoryDropdown().shouldBe(visible)
                .click();

        homePage.getSearchFragment()
                .getCategories()
                .get(categoryNumber)
                .click();

        return this;
    }

    @Step("Click on 'Search' button.")
    public SearchResultsPageSteps clickOnSearchButton() {
        log.info("Click on 'Search' button.");
        homePage.getSearchFragment()
                .getSearchButton()
                .click();

        return new SearchResultsPageSteps();
    }

    @Step("Click on 'Shopping cart' icon.")
    public ShoppingCartPageSteps clickOnShoppingCartIcon() {
        log.info("Click on 'Shopping cart' icon.");
        homePage.getHeaderFragment()
                .getCart()
                .click();

        return new ShoppingCartPageSteps();
    }
}
