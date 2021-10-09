package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.GAMES_3D_PAGE_TITLE;
import static app.core.test_data.KpiStringConstants.GAMES_3D_PAGE_URL;
import static com.codeborne.selenide.Selenide.page;

public class Games3DPageTest extends BaseTest {
    private static final int LINK_NUMBER_FOUR = NUMBER_FOUR.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();
    private static final String EXPECTED_GAMES_3D_PAGE_TITLE = GAMES_3D_PAGE_TITLE.getValue();
    private static final String EXPECTED_GAMES_3D_PAGE_URL = GAMES_3D_PAGE_URL.getValue();

    @Test(description = "Check games 3D page redirection in rus version.")
    public void checkITKidsSchoolPageRU() {
        page(HomePage.class)
                .openPage()
                .clickOnGames3DPageLink(LINK_NUMBER_FOUR)
                .checkGames3DPageTitle(EXPECTED_GAMES_3D_PAGE_TITLE);
        checkUrl(EXPECTED_GAMES_3D_PAGE_URL);
    }

    @Test(description = "Check games 3D page redirection in ukr version.")
    public void checkITKidsSchoolPageUkr() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnGames3DPageLink(LINK_NUMBER_FOUR)
                .checkGames3DPageTitle(EXPECTED_GAMES_3D_PAGE_TITLE);
        checkUrl(EXPECTED_GAMES_3D_PAGE_URL);
    }
}