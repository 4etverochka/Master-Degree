package tests.kyivstar.ua.steps;

import app.core.elements.kyivstar.ua.pages.HomePage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static app.core.elements.kyivstar.ua.pages.HomePage.PAGE_URL;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertTrue;

@Log4j2
public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps(){
        homePage=new HomePage();
    }

    @Step("Open home page.")
    public HomePageSteps openHomePage() {
        log.info("Open home page.");
        open(PAGE_URL);
        homePage=new HomePage();

        return this;
    }

    @Step("Click on search icon.")
    public HomePageSteps clickOnSearchIcon() {
        log.info("Click on search icon.");
        homePage.getSearchIcon()
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Enter search with {text} text.")
    public HomePageSteps enterSearch(String text) {
        log.info("Enter search with "+text+" text.");
        homePage.getSearchField()
                .shouldBe(visible)
                .sendKeys(text);

        homePage.getSearchField()
                .shouldBe(visible)
                .pressEnter();

        return this;
    }

    @Step("Click on 'Store' link.")
    public ShopPageSteps clickOnStoreLink() {
        log.info("Click on 'Store' link.");
        homePage.getStoreLink()
                .shouldBe(visible)
                .click();

        return new ShopPageSteps();
    }

    @Step("Check search results list size.")
    public HomePageSteps checkSearchResultsListSize(String expectedText) {
        log.info("Check search results list size.");

        for(int i=0;i< homePage.getSearchResultFragment().getSearchResults().size();i++){
            log.info(homePage.getSearchResultFragment().getSearchResults().get(i).text());
            assertTrue(homePage.getSearchResultFragment().getSearchResults().get(i).text().toLowerCase().contains(expectedText));
        }

        return this;
    }
}
