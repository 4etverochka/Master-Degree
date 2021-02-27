package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.TEACHER_FIO_RUS;
import static app.core.test_data.KpiStringConstants.TEACHER_FIO_UKR;
import static com.codeborne.selenide.Selenide.page;

public class TeachersTest extends BaseTest {

    private static final int LINK_NUMBER_TWO = NUMBER_TWO.getValue();
    private static final int LINK_NUMBER_FOUR = NUMBER_FOUR.getValue();
    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final int TEACHERS_COUNT = COUNT_OF_TEACHERS.getValue();
    private static final int TEACHERS_COUNT_ENG_VERSION = COUNT_OF_TEACHERS_ENG.getValue();
    private static final int EXPECTED_TEACHER_FROM_LIST_NUMBER = TEACHER_FROM_LIST_NUMBER.getValue();
    private static final String TEACHER_FIO_IN_RUS = TEACHER_FIO_RUS.getValue();
    private static final String TEACHER_FIO_IN_UKR = TEACHER_FIO_UKR.getValue();

    @Test(description = "Check valid teacher's full name.")
    public void checkValidTeachersFio() {
        page(HomePage.class)
                .openPage()
                .clickOnTeachersLink(LINK_NUMBER_FOUR)
                .clickOnTeacher(EXPECTED_TEACHER_FROM_LIST_NUMBER)
                .checkTeachersFio(TEACHER_FIO_IN_RUS)
                .changeLanguageToUkrainian(LINK_NUMBER_EIGHT)
                .clickOnTeachersLink(LINK_NUMBER_FOUR)
                .clickOnTeacher(EXPECTED_TEACHER_FROM_LIST_NUMBER)
                .checkTeachersFio(TEACHER_FIO_IN_UKR);
    }

    @Test(description = "Check teachers count on different site versions.")
    public void checkTeachersCountOnDifferentSiteVersions() {
        page(HomePage.class)
                .openPage()
                .clickOnTeachersLink(LINK_NUMBER_FOUR)
                .checkCountTeachers(TEACHERS_COUNT)
                .returnToHomePage()
                .changeLanguageToUkrainian(LINK_NUMBER_EIGHT)
                .clickOnTeachersLink(LINK_NUMBER_FOUR)
                .checkCountTeachers(TEACHERS_COUNT)
                .returnToHomePage()
                .changeLanguageToEnglish(LINK_NUMBER_EIGHT)
                .clickOnTeachersLink(LINK_NUMBER_TWO)
                .checkCountTeachers(TEACHERS_COUNT_ENG_VERSION);
    }
}