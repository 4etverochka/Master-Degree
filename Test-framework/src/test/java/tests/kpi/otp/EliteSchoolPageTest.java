package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_FIVE;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class EliteSchoolPageTest extends BaseTest {

    private static final int LINK_NUMBER_FIVE = NUMBER_FIVE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT.getValue();
    private static final String EXPECTED_ELITE_SCHOOL_PAGE_URL = ELITE_SCHOOL_PAGE_URL.getValue();

    @Test(description = "Check elite school page redirection in rus version.")
    public void checkEliteSchoolPageRU() {
        page(HomePage.class)
                .openPage()
                .clickOnEliteSchoolPageLink(LINK_NUMBER_FIVE)
                .checkEliteSchoolPageTitle();
        checkUrl(EXPECTED_ELITE_SCHOOL_PAGE_URL);
    }

    @Test(description = "Check elite school page redirection in ukr version.")
    public void checkEliteSchoolPageUkr() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEliteSchoolPageLink(LINK_NUMBER_FIVE)
                .checkEliteSchoolPageTitle();
        checkUrl(EXPECTED_ELITE_SCHOOL_PAGE_URL);
    }
}