package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_SIX;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class InfoPagesTest extends BaseTest {

    private static final String TITLE_IN_UKR = TITLE_UKR.getValue();
    private static final String TITLE_IN_RUS = TITLE_RUS.getValue();
    private static final String TITLE_IN_ENG = TITLE_ENG.getValue();
    private static final String PARTNERS_IN_UKR = PARTNERS_UKR.getValue();
    private static final String PARTNERS_IN_RUS = PARTNERS_RUS.getValue();
    private static final String PARTNERS_IN_ENG = PARTNERS_ENG.getValue();
    private static final String INFO_IN_UKR = INFO_UKR.getValue();
    private static final String INFO_IN_RUS = INFO_RUS.getValue();
    private static final String EPAM = EPAM_LOGO.getValue();
    private static final String NIX = NIX_LOGO.getValue();
    private static final String SOFT_SERVE = SOFT_SERVE_LOGO.getValue();
    private static final String INSART = INSART_LOGO.getValue();
    private static final String GLOBAL_LOGIC = GLOBAL_LOGIC_LOGO.getValue();
    private static final int CHANGE_EMPLOYMENT_LINK_NUMBER = NUMBER_SIX.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT.getValue();

    @Test(description = "Check employment page info on different languages.")
    public void checkEmploymentPageInfoOnDifferentLanguages() {
        page(HomePage.class)
                .openPage()
                .clickOnEmploymentLink(CHANGE_EMPLOYMENT_LINK_NUMBER)
                .checkEmploymentPageTitle(TITLE_IN_RUS)
                .checkPartnersTitle(PARTNERS_IN_RUS, false)
                .checkRoomsInfo(INFO_IN_RUS)
                .checkPartnerLogo(EPAM, 0)
                .checkPartnerLogo(NIX, 1)
                .checkPartnerLogo(GLOBAL_LOGIC, 2)
                .checkPartnerLogo(SOFT_SERVE, 3)
                .checkPartnerLogo(INSART, 4)
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER )
                .clickOnEmploymentLink(CHANGE_EMPLOYMENT_LINK_NUMBER)
                .checkEmploymentPageTitle(TITLE_IN_UKR)
                .checkPartnersTitle(PARTNERS_IN_UKR, false)
                .checkRoomsInfo(INFO_IN_UKR)
                .checkPartnerLogo(EPAM, 0)
                .checkPartnerLogo(NIX, 1)
                .checkPartnerLogo(GLOBAL_LOGIC, 2)
                .checkPartnerLogo(SOFT_SERVE, 3)
                .checkPartnerLogo(INSART, 4)
                .changeLanguageToEnglish(CHANGE_LANGUAGE_LINK_NUMBER )
                .clickOnEmploymentLink(CHANGE_EMPLOYMENT_LINK_NUMBER - 2)
                .checkEmploymentPageTitle(TITLE_IN_ENG)
                .checkPartnersTitle(PARTNERS_IN_ENG, true)
                .checkPartnerLogo(EPAM, 0)
                .checkPartnerLogo(NIX, 1)
                .checkPartnerLogo(GLOBAL_LOGIC, 2)
                .checkPartnerLogo(SOFT_SERVE, 3)
                .checkPartnerLogo(INSART, 4);
    }
}