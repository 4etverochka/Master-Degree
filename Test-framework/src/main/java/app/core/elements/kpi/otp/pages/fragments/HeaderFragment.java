package app.core.elements.kpi.otp.pages.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeaderFragment {
    private SelenideElement title = $x("//h2[@class='post-title']");
    private SelenideElement search = $x("//input[@type='search']");
    private SelenideElement englishLanguage = $x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='en-US']");
    private SelenideElement russianLanguage = $x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='ru-RU']");
    private SelenideElement ukrainianLanguage = $x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='uk']");
    private SelenideElement facebookButton = $x("//a[contains(@class,'facebook')]");
    private SelenideElement twitterButton = $x("//a[contains(@class,'twitter')]");
    private SelenideElement linkKPIButton = $x("//a[contains(@class,'linkedin')]");
    private SelenideElement instagramButton = $x("//a[contains(@class,'instagram')]");
    private SelenideElement youTubeButton = $x("//a[contains(@class,'youtube')]");
}
