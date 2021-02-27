package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.helpers.MethodsHelper;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.IT_SQUARE_OF_UNIVERSITY_TITLE;
import static app.core.test_data.KpiStringConstants.IT_SQUARE_OF_UNIVERSITY_URL;
import static com.codeborne.selenide.Selenide.page;

public class ITSquareOfUniversityPageTest extends BaseTest {

    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final int LINK_NUMBER_FOUR = NUMBER_FOUR.getValue();
    private static final String UNIVERSITY_IT_SQUARE_TITLE = IT_SQUARE_OF_UNIVERSITY_TITLE.getValue();
    private static final String UNIVERSITY_IT_SQUARE_URL = IT_SQUARE_OF_UNIVERSITY_URL.getValue();

    @Test(description = "Check IT Square of university page.")
    public void checkITSquareOfUniversityPage() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(LINK_NUMBER_EIGHT)
                .clickOnITSquareOfUniversityLink(LINK_NUMBER_FOUR)
                .checkITSquareOfUniversityPageTitle(UNIVERSITY_IT_SQUARE_TITLE);
        MethodsHelper.checkUrl(UNIVERSITY_IT_SQUARE_URL);
    }
}