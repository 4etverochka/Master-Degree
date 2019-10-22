package app.core.owner;

import app.core.enumerations.SupportedBrowsers;
import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.Sources;

@Sources("file:src/main/resources/properties/browser.properties")
public interface Browsers extends Config {
    @Key("browser")
    @ConverterClass(SupportedBrowsersConverter.class)
    SupportedBrowsers getBrowser();

    @Key("version")
    String getVersion();
}
