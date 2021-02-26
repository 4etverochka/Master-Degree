package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DepartmentTodayPage extends HomePage {
    private SelenideElement departmentTodayHeadline = $x("//article/h2");
    private SelenideElement headOfDepartmentLinkRu = $x("(//div[@id='content']//a)[1]");
    private SelenideElement headOfDepartmentLinkUkr = $x("(//div[@id='content']//a)[2]");
    private SelenideElement headOfDepartmentLinkEn = $x("//div[@id='content']//a");

    public DepartmentTodayPage checkValidResultOnDepartmentTodayPage(String departmentToday) {
        departmentTodayHeadline.shouldBe(visible)
                .shouldHave(text(departmentToday));
        return page(DepartmentTodayPage.class);
    }

    public DepartmentTodayPage changeLanguageToUkrainian(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        headerFragment.getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    public DepartmentTodayPage changeLanguageToEnglish(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        headerFragment.getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    public HeadOfDepartmentPage openHeadOfDepartmentPageInNewTab(boolean isEng, boolean isRu) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        String script = "return arguments[0].target='_blank'";
        if (isEng) {
            js.executeScript(script, headOfDepartmentLinkEn);
            headOfDepartmentLinkEn.should(visible).click();
        } else if (isRu){
            js.executeScript(script, headOfDepartmentLinkRu);
            headOfDepartmentLinkRu.should(visible).click();
        } else {
            js.executeScript(script, headOfDepartmentLinkUkr);
            headOfDepartmentLinkUkr.should(visible).click();
        }
        return page(HeadOfDepartmentPage.class);
    }
}