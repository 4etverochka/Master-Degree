package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class EducationalScheduleProcessTest extends BaseTest {
    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String SCHEDULE_OF_THE_EDUCATIONAL_PROCESS_RU = EDUCATIONAL_PROCESS_SCHEDULE_RU.getValue();
    private static final String SCHEDULE_OF_THE_EDUCATIONAL_PROCESS_UKR = EDUCATIONAL_PROCESS_SCHEDULE_UKR.getValue();
    private static final String EXTRAMURAL_STUDY_SCHEDULE_RU = EXTRAMURAL_STUDY_SCHEDULE_LINK_RU.getValue();
    private static final String EXTRAMURAL_STUDY_SCHEDULE_UA = EXTRAMURAL_STUDY_SCHEDULE_LINK_UA.getValue();

    @Test(description = "Check daytime schedule.")
    public void checkDaytimeScheduleDownloaded() {
        page(HomePage.class)
                .openPage()
                .clickOnEducationalScheduleProcessLink(LINK_NUMBER_ONE)
                .checkEducationalScheduleProcessTitle(SCHEDULE_OF_THE_EDUCATIONAL_PROCESS_RU)
                .checkFileDaytimeStudyFormDownloaded();
    }

    @Test(description = "Check extramural schedule redirection in rus version.")
    public void checkExtramuralScheduleRedirectionInRusVersion() {
        page(HomePage.class)
                .openPage()
                .clickOnEducationalScheduleProcessLink(LINK_NUMBER_ONE)
                .checkEducationalScheduleProcessTitle(SCHEDULE_OF_THE_EDUCATIONAL_PROCESS_RU)
                .clickExtramuralStudyScheduleLink();
        checkUrl(EXTRAMURAL_STUDY_SCHEDULE_RU);
    }

    @Test(description = "Check extramural schedule redirection in ukr version.")
    public void checkExtramuralScheduleRedirectionInUkrVersion() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEducationalScheduleProcessLink(LINK_NUMBER_ONE)
                .checkEducationalScheduleProcessTitle(SCHEDULE_OF_THE_EDUCATIONAL_PROCESS_UKR)
                .clickExtramuralStudyScheduleLink();
        checkUrl(EXTRAMURAL_STUDY_SCHEDULE_UA);
    }
}