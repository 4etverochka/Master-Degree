package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.helpers.MethodsHelper;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_ONE;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class HomePageTest extends BaseTest {

    private static final int LINK_NUMBER_ONE = NUMBER_ONE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT.getValue();
    private static final String EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL = EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL.getValue();
    private static final String EXPECTED_EDUCATIONAL_DISCIPLINES_URL = EDUCATIONAL_DISCIPLINES_URL.getValue();
    private static final String EXPECTED_STUDENTS_TIMETABLE_URL = STUDENTS_TIMETABLE_URL.getValue();
    private static final String EXPECTED_GROUP_CURATORS_URL = GROUP_CURATORS_URL.getValue();
    private static final String EXPECTED_DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL = DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL.getValue();

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
        MethodsHelper.checkUrl(EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL);
    }

    @Test(description = "Check educational disciplines redirection.")
    public void checkEducationalDisciplinesRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnEducationalDisciplinesLink(LINK_NUMBER_ONE);
        MethodsHelper.checkUrl(EXPECTED_EDUCATIONAL_DISCIPLINES_URL);
    }

    @Test(description = "Check students timetable redirection.")
    public void checkTimetableOfStudentsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnTimetableOfStudentsLink(LINK_NUMBER_ONE);
        MethodsHelper.checkUrl(EXPECTED_STUDENTS_TIMETABLE_URL);
    }

    @Test(description = "Check bachelors work topics redirection.")
    public void checkBachelorsWorkTopicsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnBachelorsWorkTopicsLink(LINK_NUMBER_ONE);
        MethodsHelper.checkUrl(EXPECTED_EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL);
    }

    @Test(description = "Check group curators redirection.")
    public void checkGroupCuratorsRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnGroupCuratorsLink(LINK_NUMBER_ONE);
        MethodsHelper.checkUrl(EXPECTED_GROUP_CURATORS_URL);
    }

    @Test(description = "Check disciplines during the quarantine redirection.")
    public void checkDisciplinesDuringTheQuarantineRedirection() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnDisciplinesDuringTheQuarantineLink(LINK_NUMBER_ONE);
        MethodsHelper.checkUrl(EXPECTED_DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL);
    }
}