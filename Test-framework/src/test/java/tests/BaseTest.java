package tests;

import app.core.driver.WebDriverProvider;
import app.core.listeners.AllureSelenideListener;
import app.core.listeners.TestResultsListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

@Listeners(TestResultsListener.class)
public class BaseTest {
    private WebDriverProvider driverProvider;

    @BeforeClass
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenideListener());
        driverProvider = driverProvider.getWebDriverProviderInstance();
        driverProvider.initDriver();
        setWebDriver(driverProvider.getDriver());
    }

    @AfterClass
    public void tearDown() {
        getWebDriver().quit();
    }
}
