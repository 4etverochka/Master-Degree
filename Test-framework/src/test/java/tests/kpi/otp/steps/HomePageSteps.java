package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.HomePage;

import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.interactions.Actions;

import static app.core.elements.kpi.otp.pages.HomePage.HOME_PAGE;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Open home page.")
    public HomePageSteps openPage() {
        log.info("Open home page.");
        open(HOME_PAGE);
        homePage = new HomePage();
        return this;
    }

    @Step("Click on 'Teachers' link.")
    public TeachersPageSteps clickOnTeachersLink(int linkNumber) {
        log.info("Click on 'Teachers' link.");
        homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return new TeachersPageSteps();
    }

    @Step("Click on 'Employment' link.")
    public EmploymentPageSteps clickOnEmploymentLink(int linkNumber) {
        log.info("Click on 'Employment' link.");
        homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return new EmploymentPageSteps();
    }

    @Step("Return to home page.")
    public HomePageSteps returnToHomePage() {
        log.info("Return to home page.");
        homePage.getLogo()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Change language to English.")
    public HomePageSteps changeLanguageToEnglish(int linkNumber) {
        log.info("Change language to English.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();

        homePage.getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Change language to Russian.")
    public HomePageSteps changeLanguageToRussian(int linkNumber) {
        log.info("Change language to Russian.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber))
                .perform();
        homePage.getRussianLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Change language to Ukrainian.")
    public HomePageSteps changeLanguageToUkrainian(int linkNumber) {
        log.info("Change language to Ukrainian.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber))
                .perform();
        homePage.getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }
}
