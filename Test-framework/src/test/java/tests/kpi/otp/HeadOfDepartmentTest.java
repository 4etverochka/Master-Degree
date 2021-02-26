package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_ZERO;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class HeadOfDepartmentTest extends BaseTest {

    private static final int ZERO = NUMBER_ZERO.getValue();
    private static final int LANGUAGE_LINK_NUMBER = NUMBER_EIGHT.getValue();

    private static final String HEAD_OF_DEPARTMENT_TITLE_RU = HEAD_OF_DEPARTMENT_PAGE_TITLE_RU.getValue();
    private static final String POSITION_IN_RU = POSITION_RU.getValue();
    private static final String SCIENTIFIC_DEGREE_IN_RU = SCIENTIFIC_DEGREE_RU.getValue();
    private static final String SCIENTIFIC_TITLE_IN_RU = SCIENTIFIC_TITLE_RU.getValue();

    private static final String HEAD_OF_DEPARTMENT_TITLE_UKR = HEAD_OF_DEPARTMENT_PAGE_TITLE_UKR.getValue();
    private static final String POSITION_IN_UKR = POSITION_UKR.getValue();
    private static final String SCIENTIFIC_DEGREE_IN_UKR = SCIENTIFIC_DEGREE_UKR.getValue();
    private static final String SCIENTIFIC_TITLE_IN_UKR = SCIENTIFIC_TITLE_UKR.getValue();

    private static final String HEAD_OF_DEPARTMENT_TITLE_EN = HEAD_OF_DEPARTMENT_PAGE_TITLE_EN.getValue();
    private static final String POSITION_IN_EN = POSITION_EN.getValue();
    private static final String SCIENTIFIC_DEGREE_IN_EN = SCIENTIFIC_DEGREE_EN.getValue();
    private static final String SCIENTIFIC_TITLE_IN_EN = SCIENTIFIC_TITLE_EN.getValue();

    @Test(description = "RedirectToHeadOfDepartmentPage.")
    public void checkRedirectToHeadOfDepartmentPage() {
        page(HomePage.class)
                .openPage()
                .clickOnDepartmentTodayLink(ZERO)
                .openHeadOfDepartmentPageInNewTab(false, true)
                .checkInfoOnHeadOfDepartmentPage(
                        HEAD_OF_DEPARTMENT_TITLE_RU,
                        POSITION_IN_RU,
                        SCIENTIFIC_DEGREE_IN_RU,
                        SCIENTIFIC_TITLE_IN_RU)
                .changeLanguageToUkrainian(LANGUAGE_LINK_NUMBER)
                .openHeadOfDepartmentPageInNewTab(false, false)
                .checkInfoOnHeadOfDepartmentPage(
                        HEAD_OF_DEPARTMENT_TITLE_UKR,
                        POSITION_IN_UKR,
                        SCIENTIFIC_DEGREE_IN_UKR,
                        SCIENTIFIC_TITLE_IN_UKR)
                .changeLanguageToEnglish(LANGUAGE_LINK_NUMBER)
                .openHeadOfDepartmentPageInNewTab(true, false)
                .checkInfoOnHeadOfDepartmentPage(
                        HEAD_OF_DEPARTMENT_TITLE_EN,
                        POSITION_IN_EN,
                        SCIENTIFIC_DEGREE_IN_EN,
                        SCIENTIFIC_TITLE_IN_EN);
    }
}