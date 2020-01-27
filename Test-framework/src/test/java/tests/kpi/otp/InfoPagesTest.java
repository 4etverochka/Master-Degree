package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class InfoPagesTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check employment page info on different languages.",
            dataProvider = "employment_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkEmploymentPageInfoOnDifferentLanguages(String title_ukr,
                                                            String title_rus,
                                                            String title_eng,
                                                            String partners_ukr,
                                                            String partners_rus,
                                                            String partners_eng,
                                                            String roomsInfo_ukr,
                                                            String roomsInfo_rus,
                                                            String epam_logo,
                                                            String nix_logo,
                                                            String soft_serve_logo,
                                                            String insart_logo,
                                                            String global_logic_logo,
                                                            int employmentLinkNumber,
                                                            int changeLanguageLinkNumber
    ) {
        homePageSteps.openPage()
                .clickOnEmploymentLink(employmentLinkNumber)
                .checkEmploymentPageTitle(title_rus)
                .checkPartnersTitle(partners_rus,false)
                .checkRoomsInfo(roomsInfo_rus)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4)
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnEmploymentLink(employmentLinkNumber)
                .checkEmploymentPageTitle(title_ukr)
                .checkPartnersTitle(partners_ukr,false)
                .checkRoomsInfo(roomsInfo_ukr)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4)
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .clickOnEmploymentLink(employmentLinkNumber - 2)
                .checkEmploymentPageTitle(title_eng)
                .checkPartnersTitle(partners_eng,true)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4);
    }

    @Test(description = "Check contact page info on different languages.",
            dataProvider = "employment_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkContactPageInfoOnDifferentLanguages(String title_ukr,
                                                            String title_rus,
                                                            String title_eng,
                                                            String partners_ukr,
                                                            String partners_rus,
                                                            String partners_eng,
                                                            String roomsInfo_ukr,
                                                            String roomsInfo_rus,
                                                            String epam_logo,
                                                            String nix_logo,
                                                            String soft_serve_logo,
                                                            String insart_logo,
                                                            String global_logic_logo,
                                                            int employmentLinkNumber,
                                                            int changeLanguageLinkNumber
    ) {
        homePageSteps.openPage()
                .clickOnEmploymentLink(employmentLinkNumber)
                .checkEmploymentPageTitle(title_rus)
                .checkPartnersTitle(partners_rus,false)
                .checkRoomsInfo(roomsInfo_rus)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4)
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnEmploymentLink(employmentLinkNumber)
                .checkEmploymentPageTitle(title_ukr)
                .checkPartnersTitle(partners_ukr,false)
                .checkRoomsInfo(roomsInfo_ukr)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4)
                .changeLanguageToEnglish(changeLanguageLinkNumber)
                .clickOnEmploymentLink(employmentLinkNumber - 2)
                .checkEmploymentPageTitle(title_eng)
                .checkPartnersTitle(partners_eng,true)
                .checkPartnerLogo(epam_logo, 0)
                .checkPartnerLogo(nix_logo, 1)
                .checkPartnerLogo(global_logic_logo, 2)
                .checkPartnerLogo(soft_serve_logo, 3)
                .checkPartnerLogo(insart_logo, 4);
    }
}
