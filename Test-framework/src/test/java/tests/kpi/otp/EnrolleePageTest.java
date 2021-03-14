package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class EnrolleePageTest extends BaseTest {

    private static final int LINK_NUMBER_FIVE = NUMBER_FIVE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT.getValue();
    private static final String EXPECTED_ENROLLEE_PAGE_TITLE_RU = ENROLLEE_PAGE_TITLE_RU.getValue();
    private static final String EXPECTED_ENROLLEE_PAGE_TITLE_UKR = ENROLLEE_PAGE_TITLE_UKR.getValue();
    private static final String EXPECTED_ENROLLEE_PAGE_URL = ENROLLEE_PAGE_URL.getValue();

    @Test(description = "Check redirection to enrollee page in different site versions.")
    public void checkEnrolleePageRedirection() {
        page(HomePage.class)
                .openPage()
                .clickOnEnrolleePageLink(LINK_NUMBER_FIVE)
                .checkEnrolleePageTitle(EXPECTED_ENROLLEE_PAGE_TITLE_RU);
        checkUrl(EXPECTED_ENROLLEE_PAGE_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEnrolleePageLink(LINK_NUMBER_FIVE)
                .checkEnrolleePageTitle(EXPECTED_ENROLLEE_PAGE_TITLE_UKR);
        checkUrl(EXPECTED_ENROLLEE_PAGE_URL);
    }
}