package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;
import static org.testng.AssertJUnit.assertTrue;

public class EducationalScheduleProcessPage extends HomePage {

    private SelenideElement daytimeStudyForm = $x("(//div[contains(@class,'page-content')]//span/a[contains(@href,'DENNA')])[1]");
    private SelenideElement extramuralStudyForm = $x("//div[contains(@class,'page-content')]//span/a[contains(@href,'ZACHNA')]");

    public EducationalScheduleProcessPage checkEducationalScheduleProcessTitle(String expectedTitle) {
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(EducationalScheduleProcessPage.class);
    }

    public EducationalScheduleProcessPage clickExtramuralStudyScheduleLink() {
        extramuralStudyForm
                .shouldBe(visible)
                .click();
        return page(EducationalScheduleProcessPage.class);
    }

    @SneakyThrows
    public EducationalScheduleProcessPage checkFileDaytimeStudyFormDownloaded() {
        assertTrue(daytimeStudyForm.download().canRead());
        return page(EducationalScheduleProcessPage.class);
    }
}