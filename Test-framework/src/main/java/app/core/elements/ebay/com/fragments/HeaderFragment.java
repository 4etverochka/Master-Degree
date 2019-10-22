package app.core.elements.ebay.com.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeaderFragment {
    private SelenideElement loggedUserName = $x("//button[@id='gh-ug']");
    private SelenideElement cart = $x("//li[@id='gh-cart']");
}
