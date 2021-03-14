package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class ITSquareOfUniversityPageTest extends BaseTest {

    private static final int LINK_NUMBER_FOUR = NUMBER_FOUR.getValue();
    private static final int LINK_NUMBER_SEVEN = NUMBER_SEVEN.getValue();
    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final String EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_RUS = IT_SQUARE_OF_UNIVERSITY_TITLE_RUS.getValue();
    private static final String EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_UKR = IT_SQUARE_OF_UNIVERSITY_TITLE_UKR.getValue();
    private static final String EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_ENG = IT_SQUARE_OF_UNIVERSITY_TITLE_ENG.getValue();
    private static final String EXPECTED_UNIVERSITY_IT_SQUARE_URL_RUS = IT_SQUARE_OF_UNIVERSITY_URL_RUS.getValue();
    private static final String EXPECTED_UNIVERSITY_IT_SQUARE_URL_UKR = IT_SQUARE_OF_UNIVERSITY_URL_UKR.getValue();
    private static final String EXPECTED_UNIVERSITY_IT_SQUARE_URL_ENG = IT_SQUARE_OF_UNIVERSITY_URL_ENG.getValue();

    @Test(description = "Check IT Square of university page in eng version.")
    public void checkITSquareOfUniversityPageEng() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(LINK_NUMBER_EIGHT)
                .clickOnITSquareOfUniversityPageLinkEng(LINK_NUMBER_FOUR)
                .checkITSquareOfUniversityPageTitle(EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_ENG);
        checkUrl(EXPECTED_UNIVERSITY_IT_SQUARE_URL_ENG);
    }

    @Test(description = "Check IT Square of university page in different site versions.")
    public void checkITSquareOfUniversityPage() {
        page(HomePage.class)
                .openPage()
                .clickOnITSquareOfUniversityPageLink(LINK_NUMBER_SEVEN)
                .checkITSquareOfUniversityPageTitle(EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_RUS);
        checkUrl(EXPECTED_UNIVERSITY_IT_SQUARE_URL_RUS );
        page(HomePage.class)
                .changeLanguageToUkrainian(LINK_NUMBER_EIGHT)
                .clickOnITSquareOfUniversityPageLink(LINK_NUMBER_SEVEN)
                .checkITSquareOfUniversityPageTitle(EXPECTED_IT_SQUARE_OF_UNIVERSITY_TITLE_UKR);
        checkUrl(EXPECTED_UNIVERSITY_IT_SQUARE_URL_UKR);
    }
}