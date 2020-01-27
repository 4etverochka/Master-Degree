package app.core.driver;

import app.core.driver.driverfactory.WebDriverFactory;
import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverProvider {
    @Getter
    private WebDriver driver;

    private static WebDriverProvider webDriverProviderInstance;
    private static WebDriverFactory webDriverFactory;

    private WebDriverProvider() {
        webDriverFactory = new WebDriverFactory();
    }

    @SneakyThrows
    public void initDriver() {
        driver = webDriverFactory.newWebDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static WebDriverProvider getDriverStatusInstance() {
        if (webDriverProviderInstance == null) {
            webDriverProviderInstance = new WebDriverProvider();
        }
        return webDriverProviderInstance;
    }
}
