package app.core.elements.ebay.com.pages;


import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginPage {
    private SelenideElement userNameFeld = $x("//input[@id='userid']");
    private SelenideElement passwordField = $x("//input[@id='pass']");

    private SelenideElement signInButton = $x("//button[@id='sgnBt']");

    private SelenideElement loginWarning = $x("//p[@id='errf']");

    private SelenideElement securityMessage = $x("//div[@class='bbk-desc']/span");
}
