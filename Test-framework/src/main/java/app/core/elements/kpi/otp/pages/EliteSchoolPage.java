package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class EliteSchoolPage extends HomePage {
    private SelenideElement title = $x("//a[@class='navbar-brand']");

    public EliteSchoolPage checkEliteSchoolPageTitle() {
        title.shouldBe(visible)
                .should(appears);
        return page(EliteSchoolPage.class);
    }
}