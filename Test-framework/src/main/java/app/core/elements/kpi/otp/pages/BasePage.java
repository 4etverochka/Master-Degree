package app.core.elements.kpi.otp.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

@Log4j2
public abstract class BasePage {
    protected static final String HOME_PAGE = "http://web.kpi.kharkov.ua/otp/ru/";

    @Step
    public HomePage openHomePage() {
        log.info("Open home page.");
        open(HOME_PAGE);
        return page(HomePage.class);
    }

    @Step
    public HomePage openPage(String page) {
        log.info("Open page.");
        open(page);
        return page(HomePage.class);
    }
}
