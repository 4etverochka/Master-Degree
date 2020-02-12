package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.DepartmentTodayPage;
import app.core.elements.kpi.otp.pages.HomePage;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class DepartmentTodaySteps extends HomePageSteps {
    DepartmentTodayPage departmentTodayPage;
    HomePage homePage;

    public DepartmentTodaySteps() {
        departmentTodayPage = new DepartmentTodayPage();
        homePage = new HomePage();
    }

    @Step("Department Today page shows valid info.")
    public DepartmentTodaySteps checkValidResultOnDepartmentTodayPage(String departmentToday) {
        log.info("Department Today page shows valid info.");
        departmentTodayPage.getDepartmentTodayHeadline()
                .shouldBe(visible)
                .shouldHave(text(departmentToday));
        return new DepartmentTodaySteps();
    }

    @Step("Change language to Ukrainian.")
    public DepartmentTodaySteps changeLanguageToUkrainian(int linkNumber) {
        log.info("Change language to Ukrainian.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber))
                .perform();
        homePage.getHeaderFragment()
                .getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Change language to English.")
    public DepartmentTodaySteps changeLanguageToEnglish(int linkNumber) {
        log.info("Change language to English.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        homePage.getHeaderFragment()
                .getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Open Head of Department page in new tab.")
    public HeadOfDepartmentSteps openHeadOfDepartmentPageInNewTab() {
        log.info("Open Head of Department page in new tab.");
        WebElement link = WebDriverRunner.getWebDriver().findElement(departmentTodayPage.getHeadOfDepartmentLink());
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        String script = "return arguments[0].target='_blank'";
        Object result = js.executeScript(script, link);
        link.click();
        return new HeadOfDepartmentSteps();
    }

    @Step("Open Head of Department page En in new tab.")
    public HeadOfDepartmentSteps openHeadOfDepartmentPageInNewTabEn() {
        log.info("Open Head of Department page En in new tab.");
        WebElement link = WebDriverRunner.getWebDriver().findElement(departmentTodayPage.getHeadOfDepartmentLinkEn());
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        String script = "return arguments[0].target='_blank'";
        Object result = js.executeScript(script, link);
        link.click();
        return new HeadOfDepartmentSteps();
    }
}
