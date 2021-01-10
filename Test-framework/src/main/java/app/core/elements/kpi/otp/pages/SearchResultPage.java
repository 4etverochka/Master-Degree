package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

@Log4j2
public class SearchResultPage extends HomePage {
    private SelenideElement validResult = $x("//h1/a[text()='Преподаватели']");
    private SelenideElement invalidResultMessage = $x("//p");

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
