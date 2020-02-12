package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.SearchResultPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class SearchResultSteps extends HomePageSteps {
    SearchResultPage searchResult;

    public SearchResultSteps() {
        searchResult = new SearchResultPage();
    }

    @Step("Search result page shows valid result.")
    public SearchResultSteps checkValidResultOnSearchResultPage(String resultText) {
        log.info("Search result page shows valid result.");
        searchResult.getValidResult()
                .shouldBe(visible)
                .shouldHave(text(resultText));
        return new SearchResultSteps();
    }

    @Step("Search result page shows invalid result.")
    public SearchResultSteps checkInvalidResultOnSearchResultPage(String errorMessage) {
        log.info("Search result page shows invalid result.");
        searchResult.getInvalidResultMessage()
                .shouldBe(visible)
                .shouldHave(text(errorMessage));
        return new SearchResultSteps();
    }
}
