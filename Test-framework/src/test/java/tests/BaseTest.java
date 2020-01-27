package tests;

import app.core.driver.WebDriverProvider;
import lombok.SneakyThrows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static io.qameta.allure.Allure.addAttachment;
import static java.nio.file.Paths.get;

public class BaseTest {
    private WebDriverProvider driverProvider;

    @BeforeMethod
    public void setUp() {
        driverProvider = driverProvider.getDriverStatusInstance();
        driverProvider.initDriver();
        setWebDriver(driverProvider.getDriver());
    }

    @SneakyThrows
    @AfterMethod
    public void tearDown() {
        screenshot("test-result");
        Path content = get(".\\build\\reports\\tests\\test-result.png");
        InputStream newScreenshot = Files.newInputStream(content);
        addAttachment("Screenshot", newScreenshot);
        newScreenshot.close();
        getWebDriver().close();
    }
}
