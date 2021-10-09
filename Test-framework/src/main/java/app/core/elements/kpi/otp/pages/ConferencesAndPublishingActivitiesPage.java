package app.core.elements.kpi.otp.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class ConferencesAndPublishingActivitiesPage extends HomePage {

    public ConferencesAndPublishingActivitiesPage checkConferencesAndPublishingActivitiesTitle(String expectedTitle) {
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(ConferencesAndPublishingActivitiesPage.class);
    }
}