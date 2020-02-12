package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HomePage {
    private HeaderFragment headerFragment;
    private ElementsCollection headerLinks = $$x("//nav[@id='site-navigation']//ul[@class='menu']/li/a");
    private ElementsCollection aboutUsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[1]/li/a");
    private SelenideElement departmentTodayEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement logo = $x("//img[@id='sc_logo']");
    private SelenideElement copyright = $x("//div[contains(@class,'left')]");
    private SelenideElement contactUs = $x("//div[@id='footer-callout']//a");
    public static final String HOME_PAGE = "http://web.kpi.kharkov.ua/otp/ru/";

    public HomePage() {
        headerFragment = new HeaderFragment();
    }
}
