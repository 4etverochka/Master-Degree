package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class ConferencesAndPublishingActivitiesTest extends BaseTest {

    private static final int LINK_NUMBER_TWO = NUMBER_TWO.getValue();
    private static final int CHANGE_LANGUAGE_TO_UKRAINIAN = NUMBER_SEVEN.getValue();
    private static final String CONFERENCES_AND_PUBLISHING_ACTIVITIES_TITLE_RU = CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_TITLE_RU.getValue();
    private static final String CONFERENCES_AND_PUBLISHING_ACTIVITIES_TITLE_UKR = CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_TITLE_UKR.getValue();
    private static final String CONFERENCES_AND_PUBLISHING_ACTIVITIES_URL_RU = CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_URL_RU.getValue();
    private static final String CONFERENCES_AND_PUBLISHING_ACTIVITIES_URL_UKR = CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_URL_UKR.getValue();

    @Test(description = "Check scientific schools departments page title in different site versions.")
    public void checkScientificSchoolsDepartmentsPageTitle() {
        page(HomePage.class)
                .openPage()
                .clickOnConferencesAndPublishingActivitiesLink(LINK_NUMBER_TWO)
                .checkConferencesAndPublishingActivitiesTitle(CONFERENCES_AND_PUBLISHING_ACTIVITIES_TITLE_RU);
        checkUrl(CONFERENCES_AND_PUBLISHING_ACTIVITIES_URL_RU);
        page(HomePage.class)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_TO_UKRAINIAN)
                .clickOnConferencesAndPublishingActivitiesLink(LINK_NUMBER_TWO)
                .checkConferencesAndPublishingActivitiesTitle(CONFERENCES_AND_PUBLISHING_ACTIVITIES_TITLE_UKR);
        checkUrl(CONFERENCES_AND_PUBLISHING_ACTIVITIES_URL_UKR);
    }
}