package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class ITKidsSchoolPage extends HomePage {
    private SelenideElement title = $x("//div[@class='navbar-header']");

    public ITKidsSchoolPage checkITKidsSchoolPageTitle() {
        title.shouldBe(visible)
                .should(appears);
        return page(ITKidsSchoolPage.class);
    }
}