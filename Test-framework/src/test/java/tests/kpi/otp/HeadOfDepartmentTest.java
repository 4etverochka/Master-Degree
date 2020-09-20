package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class HeadOfDepartmentTest extends BaseTest {

    @Test(description = "RedirectToHeadOfDepartmentPage.",
            dataProvider = "redirection_to_head_of_department",
            dataProviderClass = KpiDataProvider.class)
    public void checkRedirectToHeadOfDepartmentPage(int departmentTodayLinkNumber,
                                               int changeLanguageLinkNumber,
                                               String headOfDepartmentTitleRu,
                                               String positionRu,
                                               String scientificDegreeRu,
                                               String scientificTitleRu,
                                               String headOfDepartmentTitleUkr,
                                               String positionUkr,
                                               String scientificDegreeUkr,
                                               String scientificTitleUkr,
                                               String headOfDepartmentTitleEn,
                                               String positionEn,
                                               String scientificDegreeEn,
                                               String scientificTitleEn) {
        page(HomePage.class)
                .openHomePage()
                .clickOnDepartmentTodayLink(departmentTodayLinkNumber)
                .openHeadOfDepartmentPageInNewTab(false)
                .checkRuInfoOnHeadOfDepartmentPage(
                        headOfDepartmentTitleRu,
                        positionRu,
                        scientificDegreeRu,
                        scientificTitleRu)
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .openHeadOfDepartmentPageInNewTab(false)
                .checkUkrInfoOnHeadOfDepartmentPage(
                        headOfDepartmentTitleUkr,
                        positionUkr,
                        scientificDegreeUkr,
                        scientificTitleUkr)
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .openHeadOfDepartmentPageInNewTab(true)
                .checkEnInfoOnHeadOfDepartmentPage(
                        headOfDepartmentTitleEn,
                        positionEn,
                        scientificDegreeEn,
                        scientificTitleEn);
    }
}
