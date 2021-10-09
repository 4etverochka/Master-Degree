package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_SEVEN;
import static app.core.test_data.KpiIntConstants.NUMBER_FIVE;
import static app.core.test_data.KpiStringConstants.IT_KIDS_SCHOOL_PAGE_URL;
import static com.codeborne.selenide.Selenide.page;

public class ITKidsSchoolPageTest extends BaseTest {

    private static final int LINK_NUMBER_FIVE = NUMBER_FIVE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_IT_KIDS_SCHOOL_PAGE_URL = IT_KIDS_SCHOOL_PAGE_URL.getValue();

    @Test(description = "Check IT Kids school page redirection in rus version.")
    public void checkITKidsSchoolPageRU() {
        page(HomePage.class)
                .openPage()
                .clickOnITKidsSchoolPageLink(LINK_NUMBER_FIVE)
                .checkITKidsSchoolPageTitle();
        checkUrl(EXPECTED_IT_KIDS_SCHOOL_PAGE_URL);
    }

    @Test(description = "Check IT Kids school page redirection in ukr version.")
    public void checkITKidsSchoolPageUkr() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnITKidsSchoolPageLink(LINK_NUMBER_FIVE)
                .checkITKidsSchoolPageTitle();
        checkUrl(EXPECTED_IT_KIDS_SCHOOL_PAGE_URL);
    }
}