package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class HomePageTest extends BaseTest {

    private static final int LINK_NUMBER_ZERO = NUMBER_ZERO.getValue();
    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final int LINK_NUMBER_TWO = NUMBER_TWO.getValue();
    private static final int LINK_NUMBER_THREE = NUMBER_THREE.getValue();
    private static final int LINK_NUMBER_FOUR = NUMBER_FOUR.getValue();
    private static final int LINK_NUMBER_FIVE = NUMBER_FIVE.getValue();
    private static final int LINK_NUMBER_SEVEN = NUMBER_SEVEN.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL = EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL.getValue();
    private static final String EXPECTED_EDUCATIONAL_DISCIPLINES_URL = EDUCATIONAL_DISCIPLINES_URL.getValue();
    private static final String EXPECTED_STUDENTS_TIMETABLE_URL = STUDENTS_TIMETABLE_URL.getValue();
    private static final String EXPECTED_GROUP_CURATORS_URL = GROUP_CURATORS_URL.getValue();
    private static final String EXPECTED_DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL = DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL.getValue();
    private static final String EXPECTED_FEEDBACK_URL = FEEDBACK_URL.getValue();
    private static final String EXPECTED_METHODOLOGICAL_MATERIALS_URL = METHODOLOGICAL_MATERIALS_URL.getValue();
    private static final String EXPECTED_ADMISSION_RULES_21_URL = ADMISSION_RULES_21_URL.getValue();
    private static final String EXPECTED_SELECTION_COMMITTEE_URL = SELECTION_COMMITTEE_URL.getValue();

    @Test(description = "Check copyright info on different languages.",
            dataProvider = "copyright_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkCopyrightInfoOnDifferentLanguages(String copyright, int changeLanguageLinkNumber) {
        page(HomePage.class)
                .openPage()
                .checkCopyrightInfo(copyright)
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .checkCopyrightInfo(copyright)
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .checkCopyrightInfo(copyright);
    }

    @Test(description = "Check redirection to social networks.",
            dataProvider = "social_networks_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkRedirectionToSocialNetworks(String facebook,
                                                 String twitter,
                                                 String kpiOfficialLink,
                                                 String instagram,
                                                 String youTube) {
        page(HomePage.class)
                .openPage()
                .clickOnFacebookButton()
                .checkPageIsOpenedInNewTab(facebook)
                .clickOnTwitterButton()
                .checkPageIsOpenedInNewTab(twitter)
                .clickOnLinkKPIButton()
                .checkPageIsOpenedInNewTab(kpiOfficialLink)
                .clickOnInstagramButton()
                .checkPageIsOpenedInNewTab(instagram)
                .clickOnYouTubeButton()
                .checkPageIsOpenedInNewTab(youTube);
    }

    @Test(description = "Check educational and professional program redirection.")
    public void checkEducationalAndProfessionalProgramRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEducationalAndProfessionalProgramLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL);
    }

    @Test(description = "Check educational disciplines redirection.")
    public void checkEducationalDisciplinesRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEducationalDisciplinesLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_EDUCATIONAL_DISCIPLINES_URL);
    }

    @Test(description = "Check students timetable redirection.")
    public void checkTimetableOfStudentsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnTimetableOfStudentsLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_STUDENTS_TIMETABLE_URL);
    }

    @Test(description = "Check bachelors work topics redirection.")
    public void checkBachelorsWorkTopicsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnBachelorsWorkTopicsLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL);
    }

    @Test(description = "Check group curators redirection.")
    public void checkGroupCuratorsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnGroupCuratorsLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_GROUP_CURATORS_URL);
    }

    @Test(description = "Check disciplines during the quarantine redirection.")
    public void checkDisciplinesDuringTheQuarantineRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnDisciplinesDuringTheQuarantineLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL);
    }

    @Test(description = "Check feedback redirection.")
    public void checkFeedbackRedirection() {
        page(HomePage.class)
                .openPage()
                .clickOnFeedbackLink(LINK_NUMBER_ZERO);
        checkUrl(EXPECTED_FEEDBACK_URL);
    }

    @Test(description = "Check Diploma spring Semester 2020 in different site versions.")
    public void checkDiplomaSpringSemester20() {
        page(HomePage.class)
                .openPage()
                .checkDiplomaSpringSemester20(LINK_NUMBER_ONE, LINK_NUMBER_FOUR)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkDiplomaSpringSemester20(LINK_NUMBER_ONE, LINK_NUMBER_FOUR);
    }

    @Test(description = "Check Diploma autumn Semester 2020 in different site versions.")
    public void checkDiplomaAutumnSemester20() {
        page(HomePage.class)
                .openPage()
                .checkDiplomaAutumnSemester20(LINK_NUMBER_ONE, LINK_NUMBER_FOUR)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkDiplomaAutumnSemester20(LINK_NUMBER_ONE, LINK_NUMBER_FOUR);
    }

    @Test(description = "Check Diploma spring Semester 2021 in different site versions.")
    public void checkDiplomaSpringSemester21() {
        page(HomePage.class)
                .openPage()
                .checkDiplomaSpringSemester21(LINK_NUMBER_ONE, LINK_NUMBER_FIVE)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkDiplomaSpringSemester21(LINK_NUMBER_ONE, LINK_NUMBER_FIVE);
    }

    @Test(description = "Check educational disciplines in different site versions.")
    public void checkEducationalDisciplines() {
        page(HomePage.class)
                .openPage()
                .checkEducationalDisciplines(LINK_NUMBER_ONE, LINK_NUMBER_SEVEN)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkEducationalDisciplines(LINK_NUMBER_ONE, LINK_NUMBER_SEVEN);
    }

    @Test(description = "Check methodological materials for diploma redirection.")
    public void checkMethodologicalMaterialsForDiplomaRedirection() {
        page(HomePage.class)
                .openPage()
                .clickMethodologicalMaterialsForDiplomaLink(LINK_NUMBER_ONE);
        checkUrl(EXPECTED_METHODOLOGICAL_MATERIALS_URL);
    }

    @Test(description = "Check ukrainian students programming olympiad archive in different site versions.")
    public void checkUkrainianStudentsProgrammingOlympiadArchive() {
        page(HomePage.class)
                .openPage()
                .checkUkrainianStudentsProgrammingOlympiadArchive(LINK_NUMBER_THREE, LINK_NUMBER_TWO)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkUkrainianStudentsProgrammingOlympiadArchive(LINK_NUMBER_THREE, LINK_NUMBER_TWO);
    }

    @Test(description = "Check international olympiad archive in different site versions.")
    public void checkInternationalOlympiadArchive() {
        page(HomePage.class)
                .openPage()
                .checkInternationalOlympiadArchive(LINK_NUMBER_THREE, LINK_NUMBER_THREE)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .checkInternationalOlympiadArchive(LINK_NUMBER_THREE, LINK_NUMBER_THREE);
    }

    @Test(description = "Check international olympiad archive in rus.")
    public void checkAdmissionRules21RedirectionInRus() {
        page(HomePage.class)
                .openPage()
                .clickOnAdmissionRules21Link(LINK_NUMBER_FIVE);
        checkUrl(EXPECTED_ADMISSION_RULES_21_URL);
    }

    @Test(description = "Check admission rules 2021 redirection in ukr.")
    public void checkAdmissionRules21RedirectionInUkr() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnAdmissionRules21Link(LINK_NUMBER_FIVE);
        checkUrl(EXPECTED_ADMISSION_RULES_21_URL);
    }

    @Test(description = "Check selection committee redirection in rus.")
    public void checkSelectionCommitteeRedirectionInRus() {
        page(HomePage.class)
                .openPage()
                .clickOnSelectionCommitteeLink(LINK_NUMBER_FIVE);
        checkUrl(EXPECTED_SELECTION_COMMITTEE_URL);
    }

    @Test(description = "Check selection committee redirection in ukr.")
    public void checkSelectionCommitteeRedirectionInUkr() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnSelectionCommitteeLink(LINK_NUMBER_FIVE);
        checkUrl(EXPECTED_SELECTION_COMMITTEE_URL);
    }
}