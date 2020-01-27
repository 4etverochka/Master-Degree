package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.EmploymentPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static org.testng.Assert.assertTrue;

import static com.codeborne.selenide.Condition.*;

@Log4j2
public class EmploymentPageSteps extends HomePageSteps {
    private EmploymentPage employmentPage;

    public EmploymentPageSteps() {
        employmentPage = new EmploymentPage();
    }

    @Step("Check employment page title text.")
    public EmploymentPageSteps checkEmploymentPageTitle(String expectedTitle) {
        log.info("Check employment page title text.");
        employmentPage.getHeaderFragment()
                .getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedTitle));
        return new EmploymentPageSteps();
    }

    @Step("Check partners title.")
    public EmploymentPageSteps checkPartnersTitle(String expectedTitle, boolean engLocale) {
        log.info("Check partners title.");
        if (!engLocale) {
            employmentPage.getPartnersTitle()
                    .shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        } else {
            employmentPage.getRoomsInfo()
                    .shouldBe(visible)
                    .shouldHave(text(expectedTitle));
        }
        return new EmploymentPageSteps();
    }

    @Step("Check rooms info text.")
    public EmploymentPageSteps checkRoomsInfo(String expectedInfoText) {
        log.info("Check rooms info text.");
        employmentPage.getRoomsInfo()
                .shouldBe(visible)
                .shouldHave(text(expectedInfoText));
        return new EmploymentPageSteps();
    }

    @Step("Check partner logo number {index}.")
    public EmploymentPageSteps checkPartnerLogo(String expectedLogoUrl, int index) {
        log.info("Check partner logo number " + index + ".");
        assertTrue(employmentPage.getImages()
                .get(index)
                .shouldBe(visible).getAttribute("src")
                .equals(expectedLogoUrl));
        return new EmploymentPageSteps();
    }
}
