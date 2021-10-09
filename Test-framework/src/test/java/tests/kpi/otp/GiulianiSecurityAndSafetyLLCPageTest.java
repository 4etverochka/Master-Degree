package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class GiulianiSecurityAndSafetyLLCPageTest extends BaseTest {
    private static final int LINK_NUMBER_SIX = NUMBER_SIX.getValue();
    private static final int LINK_NUMBER_SEVEN = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_RUS = GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_RUS.getValue();
    private static final String EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_UKR = GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_UKR.getValue();
    private static final String EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_URL = GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_URL.getValue();

    @Test(description = "Check Giuliani Security & Safety LLC page in different site versions.")
    public void checkGiulianiSecurityAndSafetyLLCPage() {
        page(HomePage.class)
                .openPage()
                .clickOnGiulianiSecurityAndSafetyLLCPageLink(LINK_NUMBER_SIX)
                .checkGiulianiSecurityAndSafetyLLCPageTitle(EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_RUS);
        checkUrl(EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(LINK_NUMBER_SEVEN)
                .clickOnGiulianiSecurityAndSafetyLLCPageLink(LINK_NUMBER_SIX)
                .checkGiulianiSecurityAndSafetyLLCPageTitle(EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_UKR);
        checkUrl(EXPECTED_GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_URL);
    }
}