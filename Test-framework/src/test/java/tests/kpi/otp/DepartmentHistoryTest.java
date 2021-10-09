package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class DepartmentHistoryTest extends BaseTest {
    private static final int LINK_NUMBER_ZERO = NUMBER_ZERO.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String DEPARTMENT_HISTORY_TITLE_RU = DEPARTMENT_HISTORY_PAGE_TITLE_RU.getValue();
    private static final String DEPARTMENT_HISTORY_TITLE_UKR = DEPARTMENT_HISTORY_PAGE_TITLE_UKR.getValue();
    private static final String DEPARTMENT_HISTORY_URL = DEPARTMENT_HISTORY_PAGE_URL.getValue();

    @Test(description = "Check Department History on different site versions.")
    public void checkDepartmentPage() {
        page(HomePage.class)
                .openPage()
                .clickOnDepartmentHistoryLink(LINK_NUMBER_ZERO)
                .checkDepartmentHistoryPageTitle(DEPARTMENT_HISTORY_TITLE_RU);
        checkUrl(DEPARTMENT_HISTORY_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnDepartmentHistoryLink(LINK_NUMBER_ZERO)
                .checkDepartmentHistoryPageTitle(DEPARTMENT_HISTORY_TITLE_UKR);
        checkUrl(DEPARTMENT_HISTORY_URL);
    }
}