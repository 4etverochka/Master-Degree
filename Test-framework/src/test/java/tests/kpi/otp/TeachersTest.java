package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class TeachersTest extends BaseTest {

    @Test(description = "Check valid teacher's full name.",
            dataProvider = "teacher_full_name",
            dataProviderClass = KpiDataProvider.class)
    public void checkValidTeachersFio(int teachersLinkNumber,
                                      int teacherFromLinkNumber,
                                      int changeLanguageLinkNumber,
                                      String fio_rus,
                                      String fio_ukr) {
        page(HomePage.class)
                .openHomePage()
                .clickOnTeachersLink(teachersLinkNumber)
                .clickOnTeacher(teacherFromLinkNumber)
                .checkTeachersFio(fio_rus)
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnTeachersLink(teachersLinkNumber)
                .clickOnTeacher(teacherFromLinkNumber)
                .checkTeachersFio(fio_ukr);
    }

    @Test(description = "Check teachers count on different site versions.",
            dataProvider = "teachers_count",
            dataProviderClass = KpiDataProvider.class)
    public void checkTeachersCountOnDifferentSiteVersions(int teachersLinkNumber,
                                                          int countOfTeachers,
                                                          int changeLanguageLinkNumber,
                                                          int teachersLinkNumberOnEngLocale) {
        page(HomePage.class)
                .openHomePage()
                .clickOnTeachersLink(teachersLinkNumber)
                .checkCountTeachers(countOfTeachers)
                .returnToHomePage()
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnTeachersLink(teachersLinkNumber)
                .checkCountTeachers(countOfTeachers)
                .returnToHomePage()
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .clickOnTeachersLink(teachersLinkNumberOnEngLocale)
                .checkCountTeachers(countOfTeachers);
    }
}
