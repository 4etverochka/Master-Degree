package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class DepartmentTodayPage extends HomePage {
    private SelenideElement departmentTodayHeadline = $x("//article/h2");
    private SelenideElement headOfDepartmentLink = $x("(//div[@id='content']//p//a)[2]");
    private SelenideElement headOfDepartmentLinkEn = $x("//div[@id='content']//a");

    @Step
    public DepartmentTodayPage checkValidResultOnDepartmentTodayPage(String departmentToday) {
        log.info("Department Today page shows valid info.");
        departmentTodayHeadline.shouldBe(visible)
                .shouldHave(text(departmentToday));
        return page(DepartmentTodayPage.class);
    }

    @Step
    public DepartmentTodayPage changeLanguageToUkrainian(int linkNumber) {
        log.info("Change language to Ukrainian.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        headerFragment.getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    @Step
    public DepartmentTodayPage changeLanguageToEnglish(int linkNumber) {
        log.info("Change language to English.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        headerFragment.getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    @Step
    public HeadOfDepartmentPage openHeadOfDepartmentPageInNewTab(boolean isEng) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        String script = "return arguments[0].target='_blank'";
        if (isEng) {
            log.info("Open Head of Department page on English locale in new tab.");
            js.executeScript(script, headOfDepartmentLinkEn);
            headOfDepartmentLinkEn.should(visible).click();
        } else {
            log.info("Open Head of Department page on Russian locale in new tab.");
            js.executeScript(script, headOfDepartmentLink);
            headOfDepartmentLink.should(visible).click();
        }
        return page(HeadOfDepartmentPage.class);
    }
}
