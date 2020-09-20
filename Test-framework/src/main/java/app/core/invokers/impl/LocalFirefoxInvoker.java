package app.core.invokers.impl;

import app.core.invokers.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static app.core.owner.BrowserOwner.BROWSER_CONFIG;


public class LocalFirefoxInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver().browserVersion(BROWSER_CONFIG.getVersion()).setup();
        return new FirefoxDriver();
    }
}
