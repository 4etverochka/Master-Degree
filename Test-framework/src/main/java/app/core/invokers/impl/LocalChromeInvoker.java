package app.core.invokers.impl;

import app.core.invokers.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static app.core.owner.BrowserOwner.BROWSER_CONFIG;

public class LocalChromeInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver().version(BROWSER_CONFIG.getVersion()).setup();
        return new ChromeDriver();
    }
}
