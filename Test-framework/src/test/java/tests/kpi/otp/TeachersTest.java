package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class TeachersTest extends BaseTest {
    HomePageSteps homePageSteps=new HomePageSteps();

    @Test(description = "Check valid teacher's fio.", dataProvider = "teacher_fio", dataProviderClass = KpiDataProvider.class)
    public void checkValidTeachersFio(int teachersLinkNumber, int teacherFromLinkNumber, String fio){
        homePageSteps.openPage()
                .clickOnTeachersLink(teachersLinkNumber)
                .clickOnTeacher(teacherFromLinkNumber)
                .checkTeachersFio(fio);
    }

    @Test(description = "Check teachers count on different site versions.", dataProvider = "teachers_count", dataProviderClass = KpiDataProvider.class)
    public void checkTeachersCountOnDifferentSiteVersions(int teachersLinkNumber, int countOfTeachers, int changeLanguageLinkNumber, int teachersLinkNumberOnEngLocale){
        homePageSteps.openPage()
                .clickOnTeachersLink(teachersLinkNumber)
                .checkCountTeachers(countOfTeachers)
                .returnToHomePage()
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnTeachersLink(teachersLinkNumber)
                .checkCountTeachers(countOfTeachers)
                .returnToHomePage()
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .clickOnTeachersLink(teachersLinkNumberOnEngLocale)
                .checkCountTeachers(12);
    }
}
