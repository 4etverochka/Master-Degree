package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_SEVEN;
import static app.core.test_data.KpiIntConstants.NUMBER_THREE;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class RoboFestPageTest extends BaseTest {
    private static final int LINK_NUMBER_THREE = NUMBER_THREE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_ROBOFEST_PAGE_TITLE = ROBOFEST_PAGE_TITLE.getValue();
    private static final String EXPECTED_ROBOFEST_PAGE_URL = ROBOFEST_PAGE_URL.getValue();

    @Test(description = "Check redirection to RoboFest2020 in different site versions.")
    public void checkRoboFestPageRedirection() {
        page(HomePage.class)
                .openPage()
                .clickOnRoboFestLink(LINK_NUMBER_THREE)
                .checkRoboFestPageTitle(EXPECTED_ROBOFEST_PAGE_TITLE);
        checkUrl(EXPECTED_ROBOFEST_PAGE_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnRoboFestLink(LINK_NUMBER_THREE)
                .checkRoboFestPageTitle(EXPECTED_ROBOFEST_PAGE_TITLE);
        checkUrl(EXPECTED_ROBOFEST_PAGE_URL);
    }
}