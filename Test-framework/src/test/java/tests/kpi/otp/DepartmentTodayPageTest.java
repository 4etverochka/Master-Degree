package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class DepartmentTodayPageTest extends BaseTest {

    @Test(description = "Check department today info on different site versions.",
            dataProvider = "department_today_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkInfoOnDepartmentTodayPage(int departmentTodayLinkNumber,
                                               int changeLanguageLinkNumber,
                                               String departmentToday_ru,
                                               String departmentToday_ukr,
                                               String departmentToday_eng) {
        page(HomePage.class)
                .openHomePage()
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
