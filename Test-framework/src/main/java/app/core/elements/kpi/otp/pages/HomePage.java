package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HomePage {
    private ElementsCollection headerLinks=$$x("//nav[@id='site-navigation']//ul[@class='menu']/li/a");
    private SelenideElement logo=$x("//img[@id='sc_logo']");
    private SelenideElement englishLanguage=$x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='en-US']");
    private SelenideElement russianLanguage=$x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='ru-RU']");
    private SelenideElement ukrainianLanguage=$x("//nav[@id='site-navigation']//ul[@class='menu']/li//a[@lang='uk']");
    public static final String HOME_PAGE = "http://web.kpi.kharkov.ua/otp/ru/";
}
