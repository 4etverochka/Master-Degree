package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

@Log4j2
public class SearchResultPage extends HomePage {
    private SelenideElement validResult = $x("//h1/a[text()='Преподаватели']");
    private SelenideElement invalidResultMessage = $x("//p");

    @Step
    public SearchResultPage checkValidResultOnSearchResultPage(String resultText) {
        log.info("Search result page shows valid result.");
        validResult.shouldBe(visible)
                .shouldHave(text(resultText));
        return page(SearchResultPage.class);
    }

    @Step
    public SearchResultPage checkInvalidResultOnSearchResultPage(String errorMessage) {
        log.info("Search result page shows invalid result.");
        invalidResultMessage.shouldBe(visible)
                .shouldHave(text(errorMessage));
        return page(SearchResultPage.class);
    }
}
