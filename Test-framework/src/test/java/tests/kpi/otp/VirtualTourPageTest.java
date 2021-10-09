package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_SEVEN;
import static app.core.test_data.KpiIntConstants.NUMBER_FIVE;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class VirtualTourPageTest extends BaseTest {

    private static final int LINK_NUMBER_FIVE = NUMBER_FIVE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_TOUR_PAGE_TITLE_RU = VIRTUAL_TOUR_PAGE_TITLE_RU.getValue();
    private static final String EXPECTED_TOUR_PAGE_TITLE_UKR = VIRTUAL_TOUR_PAGE_TITLE_UKR.getValue();
    private static final String EXPECTED_VIRTUAL_TOUR_PAGE_URL = VIRTUAL_TOUR_PAGE_URL.getValue();

    @Test(description = "Check virtual tour page redirection in different site versions.")
    public void checkVirtualTourPage() {
        page(HomePage.class)
                .openPage()
                .clickOnVirtualTourLink(LINK_NUMBER_FIVE)
                .checkVirtualTourPageTitle(EXPECTED_TOUR_PAGE_TITLE_RU);
        checkUrl(EXPECTED_VIRTUAL_TOUR_PAGE_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnVirtualTourLink(LINK_NUMBER_FIVE)
                .checkVirtualTourPageTitle(EXPECTED_TOUR_PAGE_TITLE_UKR);
        checkUrl(EXPECTED_VIRTUAL_TOUR_PAGE_URL);
    }
}