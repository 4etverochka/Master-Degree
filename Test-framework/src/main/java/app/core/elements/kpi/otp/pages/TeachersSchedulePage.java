package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class TeachersSchedulePage extends HomePage {
    private SelenideElement title = $x("(//div/h3)[1]");

    public StudentsSchedulePage checkTeachersSchedulePageTitle(String expectedTitle) {
        title.shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(StudentsSchedulePage.class);
    }
}