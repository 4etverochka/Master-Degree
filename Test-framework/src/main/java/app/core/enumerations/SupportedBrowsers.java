package app.core.enumerations;

import app.core.invokers.WebDriverInvoker;
import app.core.invokers.impl.LocalChromeInvoker;
import app.core.invokers.impl.LocalFirefoxInvoker;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker());

    private final WebDriverInvoker invoker;

    SupportedBrowsers(WebDriverInvoker invoker) {
        this.invoker = invoker;
    }

    public WebDriverInvoker getWebDriver() {
        return invoker;
    }
}
