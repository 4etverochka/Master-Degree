package app.core.elements.kpi.otp.pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public abstract class BasePage {
    private static final String HOME_PAGE = "http://web.kpi.kharkov.ua/otp/ru/";

    public HomePage openPage() {
        open(HOME_PAGE);
        return page(HomePage.class);
    }

    public HomePage openPage(String page) {
        open(page);
        return page(HomePage.class);
    }
}
