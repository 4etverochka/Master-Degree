package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class CuratorsPageTest extends BaseTest {
    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String CURATORS_TITLE_RU = CURATORS_PAGE_TITLE_RU.getValue();
    private static final String CURATORS_TITLE_UKR = CURATORS_PAGE_TITLE_UKR.getValue();
    private static final String CURATORS_PAGE_URL_RU_VER = CURATORS_PAGE_URL_RU.getValue();
    private static final String CURATORS_PAGE_URL_UKR_VER = CURATORS_PAGE_URL_UKR.getValue();

    @Test(description = "Check Curators page on different site versions.")
    public void checkCuratorsPage() {
        page(HomePage.class)
                .openPage()
                .clickOnCuratorsLink(LINK_NUMBER_ONE)
                .checkCuratorsPageTitle(CURATORS_TITLE_RU);
        checkUrl(CURATORS_PAGE_URL_RU_VER);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnCuratorsLink(LINK_NUMBER_ONE)
                .checkCuratorsPageTitle(CURATORS_TITLE_UKR);
        checkUrl(CURATORS_PAGE_URL_UKR_VER);
    }
}