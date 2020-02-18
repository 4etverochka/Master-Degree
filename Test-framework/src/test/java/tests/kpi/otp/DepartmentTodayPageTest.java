package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class DepartmentTodayPageTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check department today info on different site versions.",
            dataProvider = "department_today_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkInfoOnDepartmentTodayPage(int departmentTodayLinkNumber,
                                               int changeLanguageLinkNumber,
                                               String departmentToday_ru,
                                               String departmentToday_ukr,
                                               String departmentToday_eng) {
        homePageSteps.openPage()
                .clickOnDepartmentTodayLink(departmentTodayLinkNumber)
                .checkValidResultOnDepartmentTodayPage(departmentToday_ru)
                .returnToHomePage()
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnDepartmentTodayLink(departmentTodayLinkNumber)
                .checkValidResultOnDepartmentTodayPage(departmentToday_ukr)
                .returnToHomePage()
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .clickOnDepartmentTodayLinkInEnVersion(departmentTodayLinkNumber)
                .checkValidResultOnDepartmentTodayPage(departmentToday_eng);
    }
}
