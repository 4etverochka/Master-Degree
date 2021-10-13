package app.core.driver;

import app.core.driver.driverfactory.WebDriverFactory;
import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;

public class WebDriverProvider {
    @Getter
    private WebDriver driver;

    private static WebDriverFactory webDriverFactory;

    private static class WebDriverProviderInit {
        static WebDriverProvider INSTANCE = new WebDriverProvider();
    }

    private WebDriverProvider() {
        webDriverFactory = new WebDriverFactory();
    }

    @SneakyThrows
    public synchronized void initDriver() {

        driver = webDriverFactory.newWebDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static WebDriverProvider getWebDriverProviderInstance() {
        return WebDriverProviderInit.INSTANCE;
    }
}
