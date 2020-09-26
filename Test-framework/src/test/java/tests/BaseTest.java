package tests;

import app.core.driver.WebDriverProvider;
import lombok.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static io.qameta.allure.Allure.addAttachment;
import static java.nio.file.Paths.get;

public class BaseTest {
    private static final String SCREENSHOT_FOLDER = ".\\build\\reports\\tests\\test-result.png";
    private static final String SCREENSHOT_NAME = "test-result";
    private static final String SCREENSHOT_PROPERTY = "Screenshot";
    private WebDriverProvider driverProvider;
    private Path content;

    @BeforeClass
    public void setUp() {
        driverProvider = driverProvider.getDriverStatusInstance();
        driverProvider.initDriver();
        setWebDriver(driverProvider.getDriver());
    }

    @SneakyThrows
    @AfterClass
    public void tearDown() {
        screenshot(SCREENSHOT_NAME);
        content = get(SCREENSHOT_FOLDER);
        @Cleanup InputStream newScreenshot = Files.newInputStream(content);
        addAttachment(SCREENSHOT_PROPERTY, newScreenshot);
        getWebDriver().quit();
    }
}
