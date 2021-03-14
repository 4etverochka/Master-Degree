package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class Games3DPage extends HomePage{

    private SelenideElement title = $x("//div[contains(@class,'header-text')]");

    public Games3DPage checkGames3DPageTitle(String expectedTitle) {
        title.shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(Games3DPage.class);
    }
}