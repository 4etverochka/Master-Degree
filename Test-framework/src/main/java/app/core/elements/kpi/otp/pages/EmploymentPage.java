package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class EmploymentPage extends HomePage {
    private SelenideElement partnersTitle = $x("//p[contains(@style,'text-align')]/strong");
    private SelenideElement partnersTitleEng = $x("(//p[contains(@style,'text-align')]//strong)[1]");
    private SelenideElement roomsInfo = $x("(//p[contains(@style,'text-align: center')]/span)[1]");
    private ElementsCollection images = $$x("//p//img");

    public EmploymentPage checkEmploymentPageTitle(String expectedTitle) {
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkPartnersTitle(String expectedTitle, boolean engLocale) {
        if (!engLocale) {
            partnersTitle.shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        } else {
            partnersTitleEng.shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        }
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkRoomsInfo(String expectedInfoText) {
        roomsInfo.shouldBe(visible)
                .shouldHave(text(expectedInfoText));
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkPartnerLogo(String expectedLogoUrl, int index) {
        assertTrue(images.get(index)
                .shouldBe(visible).getAttribute("src")
                .equals(expectedLogoUrl));
        return page(EmploymentPage.class);
    }
}