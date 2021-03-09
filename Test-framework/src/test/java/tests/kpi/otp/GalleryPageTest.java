package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.helpers.MethodsHelper.checkUrl;
import static app.core.test_data.KpiIntConstants.NUMBER_EIGHT;
import static app.core.test_data.KpiIntConstants.NUMBER_THREE;
import static app.core.test_data.KpiStringConstants.GALLERY_PAGE_TITLE;
import static app.core.test_data.KpiStringConstants.GALLERY_PAGE_URL;
import static com.codeborne.selenide.Selenide.page;

public class GalleryPageTest extends BaseTest {

    private static final int LINK_NUMBER_EIGHT = NUMBER_EIGHT.getValue();
    private static final int LINK_NUMBER_THREE = NUMBER_THREE.getValue();
    private static final String GALLERY_TITLE = GALLERY_PAGE_TITLE.getValue();
    private static final String GALLERY_URL = GALLERY_PAGE_URL.getValue();

    @Test(description = "Check Gallery page.")
    public void checkGalleryPage() {
        page(HomePage.class)
                .openPage()
                .changeLanguageToEnglish(LINK_NUMBER_EIGHT)
                .clickOnGalleryLinkInEnVersion(LINK_NUMBER_THREE)
                .checkGalleryPageTitle(GALLERY_TITLE);
        checkUrl(GALLERY_URL);
    }
}