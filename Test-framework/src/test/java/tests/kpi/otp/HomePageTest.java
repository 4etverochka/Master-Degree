package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class HomePageTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check copyright info on different languages.",
            dataProvider = "copyright_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkCopyrightInfoOnDifferentLanguages(String copyright,
                                                       int changeLanguageLinkNumber) {
        homePageSteps.openPage()
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
        homePageSteps.openPage()
                .clickOnFacebookButton()
                .checkFacebookPageIsOpened(facebook)
                .clickOnTwitterButton()
                .checkTwitterPageIsOpened(twitter)
                .clickOnLinkKPIButton()
                .checkLinkKPIPageIsOpened(kpiOfficialLink)
                .clickOnInstagramButton()
                .checkInstagramPageIsOpened(instagram)
                .clickOnYouTubeButton()
                .checkYouTubePageIsOpened(youTube);
    }
}
