package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class HomePageTest extends BaseTest {

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
}
