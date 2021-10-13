package app.core.invokers.impl;

import app.core.invokers.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static app.core.owner.BrowserOwner.BROWSER_CONFIG;

public class LocalChromeInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        WebDriverManager.chromedriver().browserVersion(BROWSER_CONFIG.getVersion()).setup();
        return new ChromeDriver(options);
    }
}
