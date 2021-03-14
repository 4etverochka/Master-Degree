package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class ScotoLogicInnovativeLaboratoryPageTest extends BaseTest {

    private static final int LINK_NUMBER_SEVEN= NUMBER_SEVEN.getValue();
    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final String EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_RUS = GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_RUS.getValue();
    private static final String EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_UKR = GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_UKR.getValue();
    private static final String EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_URL = GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_URL.getValue();

    @Test(description = "Check GlobalLogic Innovative Laboratory page in different site versions.")
    public void checkGlobalLogicInnovativeLaboratoryPage() {
        page(HomePage.class)
                .openPage()
                .clickOnScotoLogicInnovativeLaboratoryPageLink(LINK_NUMBER_SEVEN)
                .checkGlobalLogicInnovativeLaboratoryPageTitle(EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_RUS);
        checkUrl(EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_URL);
        page(HomePage.class)
                .changeLanguageToUkrainian(LINK_NUMBER_EIGHT)
                .clickOnScotoLogicInnovativeLaboratoryPageLink(LINK_NUMBER_SEVEN)
                .checkGlobalLogicInnovativeLaboratoryPageTitle(EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_UKR);
        checkUrl(EXPECTED_GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_URL);
    }
}