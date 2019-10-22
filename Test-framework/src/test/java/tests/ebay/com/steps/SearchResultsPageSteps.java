package tests.ebay.com.steps;

import app.core.elements.ebay.com.pages.SearchResultsPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Log4j2
public class SearchResultsPageSteps {
    private SearchResultsPage searchResultsPage;

    public SearchResultsPageSteps() {
        searchResultsPage = new SearchResultsPage();
    }

    @Step("Check empty search filed error text.")
    public SearchResultsPageSteps checkEmptySearchFieldErrorText(String expectedText) {
        log.info("Check empty search filed error text.");
        assertThat("Invalid error message!", searchResultsPage.getEmptySearchFieldError().getText(), equalTo(expectedText));

        return this;
    }

    @Step("Choose {numberSearchResult} search result.")
    public ProductPageSteps chooseDesiredSearchResult(int numberSearchResult) {
        log.info("Choose "+numberSearchResult+" search result.");
        searchResultsPage.getSearchResultsList()
                .get(numberSearchResult)
                .shouldBe(visible)
                .click();

        return new ProductPageSteps();
    }

    @Step("Select 'Buy It Now' filter.")
    public SearchResultsPageSteps selectBuyItNowFilter() {
        log.info("Select 'Buy It Now' filter.");
        searchResultsPage.getBuyItNowFilter().shouldBe(visible)
                .click();

        return this;
    }
}
