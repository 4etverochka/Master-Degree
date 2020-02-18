package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class HeadOfDepartmentTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "RedirectToHeadOfDepartmentPage.",
            dataProvider = "redirection_to_head_of_department",
            dataProviderClass = KpiDataProvider.class)
    public void redirectToHeadOfDepartmentPage(int departmentTodayLinkNumber,
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
        homePageSteps.openPage()
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
