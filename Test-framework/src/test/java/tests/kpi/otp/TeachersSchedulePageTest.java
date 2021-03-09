package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_ONE;
import static app.core.test_data.KpiStringConstants.TEACHERS_SCHEDULE_TITLE;
import static app.core.test_data.KpiStringConstants.TEACHERS_SCHEDULE_URL;
import static com.codeborne.selenide.Selenide.page;

public class TeachersSchedulePageTest extends BaseTest {

    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final String TEACHERS_SCHEDULE_PAGE_TITLE = TEACHERS_SCHEDULE_TITLE.getValue();
    private static final String TEACHERS_SCHEDULE_PAGE_URL = TEACHERS_SCHEDULE_URL.getValue();

    @Test(description = "Check Teachers schedule page title.")
    public void checkTeachersSchedulePageTitle() {
        page(HomePage.class)
                .openPage()
                .clickOnTeachersScheduleLink(LINK_NUMBER_ONE)
                .checkTeachersSchedulePageTitle(TEACHERS_SCHEDULE_PAGE_TITLE);
        checkUrl(TEACHERS_SCHEDULE_PAGE_URL);
    }
}