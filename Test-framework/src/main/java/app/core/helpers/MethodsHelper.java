package app.core.helpers;

import com.codeborne.selenide.WebDriverRunner;

import static org.testng.AssertJUnit.assertTrue;

public class MethodsHelper {
    public static void checkUrl(String expectedUrlPart) {
        String currentUrl = WebDriverRunner.url();
        assertTrue("Urls are not equal", currentUrl.contains(expectedUrlPart));
    }
}