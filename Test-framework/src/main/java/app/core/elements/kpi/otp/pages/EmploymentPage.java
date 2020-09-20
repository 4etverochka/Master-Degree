package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

@Log4j2
public class EmploymentPage extends HomePage {
    private SelenideElement partnersTitle = $x("//p[contains(@style,'text-align')]/strong");
    private SelenideElement roomsInfo = $x("(//p[contains(@style,'text-align: center')]/span)[1]");
    private ElementsCollection images = $$x("//p//img");

    public EmploymentPage checkEmploymentPageTitle(String expectedTitle) {
        log.info("Check employment page title text.");
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkPartnersTitle(String expectedTitle, boolean engLocale) {
        log.info("Check partners title.");
        if (!engLocale) {
            partnersTitle
                    .shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        } else {
            partnersTitle
                    .shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        }
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkRoomsInfo(String expectedInfoText) {
        log.info("Check rooms info text.");
        roomsInfo
                .shouldBe(visible)
                .shouldHave(text(expectedInfoText));
        return page(EmploymentPage.class);
    }

    public EmploymentPage checkPartnerLogo(String expectedLogoUrl, int index) {
        log.info("Check partner logo number " + index + ".");
        assertTrue(images
                .get(index)
                .shouldBe(visible).getAttribute("src")
                .equals(expectedLogoUrl));
        return page(EmploymentPage.class);
    }
}
