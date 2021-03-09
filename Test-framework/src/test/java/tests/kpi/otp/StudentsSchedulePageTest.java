package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_ONE;
import static app.core.test_data.KpiStringConstants.STUDENTS_SCHEDULE_RUS;
import static app.core.test_data.KpiStringConstants.STUDENTS_SCHEDULE_UKR;
import static com.codeborne.selenide.Selenide.page;

public class StudentsSchedulePageTest extends BaseTest {

    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final String STUDENTS_SCHEDULE_IN_RUS = STUDENTS_SCHEDULE_RUS.getValue();
    private static final String STUDENTS_SCHEDULE_IN_UKR = STUDENTS_SCHEDULE_UKR.getValue();

    @Test(description = "Check Students schedule page title on different site versions.")
    public void checkStudentsSchedulePageTitle() {
        page(HomePage.class)
                .openPage()
                .clickOnStudentsScheduleLink(LINK_NUMBER_ONE)
                .checkStudentsSchedulePageTitle(STUDENTS_SCHEDULE_IN_RUS)
                .changeLanguageToUkrainian(LINK_NUMBER_EIGHT)
                .clickOnStudentsScheduleLink(LINK_NUMBER_ONE)
                .checkStudentsSchedulePageTitle(STUDENTS_SCHEDULE_IN_UKR);
    }
}