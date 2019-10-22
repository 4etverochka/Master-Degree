package app.core.driver;

import app.core.driver.driverfactory.WebDriverFactory;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverProvider {
    private static WebDriverProvider webDriverProviderInstance;
    private static WebDriverFactory webDriverFactory;

    @Getter
    private WebDriver driver;

    private WebDriverProvider() {
        webDriverFactory = new WebDriverFactory();
    }

    public void initDriver() {
        try {
            driver = webDriverFactory.newWebDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
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
