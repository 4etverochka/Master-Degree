package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class ScientificSchoolsDepartmentsPageTest extends BaseTest {

    private static final int LINK_NUMBER_TWO = NUMBER_TWO.getValue();
    private static final int CHANGE_LANGUAGE_TO_UKRAINIAN = NUMBER_EIGHT.getValue();
    private static final String SCIENTIFIC_SCHOOLS_DEPARTMENTS_TITLE_RU = SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_TITLE_RU.getValue();
    private static final String SCIENTIFIC_SCHOOLS_DEPARTMENTS_TITLE_UKR = SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_TITLE_UKR.getValue();
    private static final String SCIENTIFIC_SCHOOLS_DEPARTMENTS_URL_RU = SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_URL_RU.getValue();
    private static final String SCIENTIFIC_SCHOOLS_DEPARTMENTS_URL_UKR = SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_URL_UKR.getValue();

    @Test(description = "Check scientific schools departments page title in different site versions.")
    public void checkScientificSchoolsDepartmentsPageTitle() {
        page(HomePage.class)
                .openPage()
                .clickOnScientificSchoolsDepartmentsLink(LINK_NUMBER_TWO)
                .checkScientificSchoolsDepartmentsPageTitle(SCIENTIFIC_SCHOOLS_DEPARTMENTS_TITLE_RU);
        checkUrl(SCIENTIFIC_SCHOOLS_DEPARTMENTS_URL_RU);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_TO_UKRAINIAN)
                .clickOnScientificSchoolsDepartmentsLink(LINK_NUMBER_TWO)
                .checkScientificSchoolsDepartmentsPageTitle(SCIENTIFIC_SCHOOLS_DEPARTMENTS_TITLE_UKR);
        checkUrl(SCIENTIFIC_SCHOOLS_DEPARTMENTS_URL_UKR);
    }
}