package app.core.driver.driverfactory;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static app.core.owner.BrowserOwner.BROWSER_CONFIG;

public class WebDriverFactory {
    public WebDriver newWebDriver() throws MalformedURLException {
        return BROWSER_CONFIG.getBrowser().getWebDriver().invokeWebDriver();
    }
}
