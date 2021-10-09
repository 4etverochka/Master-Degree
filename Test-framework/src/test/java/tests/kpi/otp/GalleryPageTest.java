package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.*;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class GalleryPageTest extends BaseTest {
    private static final int LINK_NUMBER_SIX = NUMBER_SIX.getValue();
    private static final int LINK_NUMBER_SEVEN = NUMBER_SEVEN.getValue();
    private static final int LINK_NUMBER_THREE = NUMBER_THREE.getValue();
    private static final String EXPECTED_GALLERY_TITLE_ENG = GALLERY_PAGE_TITLE_ENG.getValue();
    private static final String EXPECTED_GALLERY_TITLE = GALLERY_PAGE_TITLE.getValue();
    private static final String EXPECTED_GALLERY_URL_RUS = GALLERY_PAGE_URL_RUS.getValue();
    private static final String EXPECTED_GALLERY_PAGE_URL_UKR = GALLERY_PAGE_URL_UKR.getValue();
    private static final String EXPECTED_GALLERY_PAGE_URL_ENG = GALLERY_PAGE_URL_ENG.getValue();

    @Test(description = "Check Gallery page in eng version.")
    public void checkGalleryPageInEngVersion() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(LINK_NUMBER_SEVEN)
                .clickOnGalleryLinkInEnVersion(LINK_NUMBER_THREE)
                .checkGalleryPageTitle(EXPECTED_GALLERY_TITLE_ENG);
        checkUrl(EXPECTED_GALLERY_PAGE_URL_ENG);
    }

    @Test(description = "Check Gallery page in different site versions.")
    public void checkGalleryPageInRusVersion() {
        page(HomePage.class)
                .openPage()
                .clickOnGalleryPageLink(LINK_NUMBER_SIX)
                .checkGalleryPageTitle(EXPECTED_GALLERY_TITLE);
        checkUrl(EXPECTED_GALLERY_URL_RUS);
        page(HomePage.class)
                .changeLanguageToUkrainian(LINK_NUMBER_SEVEN)
                .clickOnGalleryPageLink(LINK_NUMBER_SIX)
                .checkGalleryPageTitle(EXPECTED_GALLERY_TITLE);
        checkUrl(EXPECTED_GALLERY_PAGE_URL_UKR);
    }
}