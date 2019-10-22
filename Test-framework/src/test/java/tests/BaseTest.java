package tests;

import app.core.driver.WebDriverProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
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

    @AfterMethod
    public void tearDown() {
        getWebDriver().close();
    }

    @AfterMethod
    public void makeScreenshot() {
        screenshot("test-result");
        Path content = get(".\\build\\reports\\tests\\test-result.png");

        try (InputStream is = Files.newInputStream(content)) {
            addAttachment("Screenshot", is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
