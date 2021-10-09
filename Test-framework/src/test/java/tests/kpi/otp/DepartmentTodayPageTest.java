package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class DepartmentTodayPageTest extends BaseTest {
    private static final int ZERO = NUMBER_ZERO.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String RU = DEPARTMENT_TODAY_RU.getValue();
    private static final String UKR = DEPARTMENT_TODAY_UKR.getValue();
    private static final String EN = DEPARTMENT_TODAY_EN.getValue();

    @Test(description = "Check department today info on different site versions.")
    public void checkInfoOnDepartmentTodayPage() {
        page(HomePage.class)
                .openPage()
                .clickOnDepartmentTodayLink(ZERO)
                .checkValidResultOnDepartmentTodayPage(RU)
                .returnToHomePage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnDepartmentTodayLink(ZERO)
                .checkValidResultOnDepartmentTodayPage(UKR)
                .returnToHomePage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnDepartmentTodayLinkInEnVersion(ZERO)
                .checkValidResultOnDepartmentTodayPage(EN);
    }
}