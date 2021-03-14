package app.core.elements.kpi.otp.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class GiulianiSecurityAndSafetyLLCPage extends HomePage{

    public GiulianiSecurityAndSafetyLLCPage checkGiulianiSecurityAndSafetyLLCPageTitle(String expectedTitle) {
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(GiulianiSecurityAndSafetyLLCPage.class);
    }
}