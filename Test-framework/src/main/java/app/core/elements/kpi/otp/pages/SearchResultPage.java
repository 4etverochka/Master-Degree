package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultPage extends HomePage {
    private SelenideElement validResult = $x("//h1/span");
    private SelenideElement invalidResultMessage = $x("//h3");

    public SearchResultPage checkValidResultOnSearchResultPage(String resultText) {
        validResult.shouldBe(visible)
                .shouldHave(text(resultText));
        return page(SearchResultPage.class);
    }

    public SearchResultPage checkInvalidResultOnSearchResultPage(String errorMessage) {
        invalidResultMessage.shouldBe(visible)
                .shouldHave(text(errorMessage));
        return page(SearchResultPage.class);
    }
}