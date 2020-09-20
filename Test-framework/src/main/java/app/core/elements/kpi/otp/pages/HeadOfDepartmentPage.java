package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class HeadOfDepartmentPage extends HomePage {
    private SelenideElement headOfDepartmentHeadline = $x("//article/h2");
    private ElementsCollection headOfDepartmentInfo = $$x("//p/em");
    private ElementsCollection headOfDepartmentEnInfo = $$x("//span/em");

    public DepartmentTodayPage checkRuInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleRu,
                                                                 String positionRu,
                                                                 String scientificDegreeRu,
                                                                 String scientificTitleRu) {
        log.info("Check ru info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentHeadline.shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleRu));

                headOfDepartmentInfo.get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionRu));

                headOfDepartmentInfo.get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeRu));

                headOfDepartmentInfo.get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleRu));

                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(DepartmentTodayPage.class);
    }

    public DepartmentTodayPage checkUkrInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleUkr,
                                                                  String positionUkr,
                                                                  String scientificDegreeUkr,
                                                                  String scientificTitleUkr) {
        log.info("Check ukr info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentHeadline.shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleUkr));

                headOfDepartmentInfo.get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionUkr));

                headOfDepartmentInfo.get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeUkr));

                headOfDepartmentInfo.get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleUkr));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(DepartmentTodayPage.class);
    }

    public DepartmentTodayPage checkEnInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleEn,
                                                                 String positionEn,
                                                                 String scientificDegreeEn,
                                                                 String scientificTitleEn) {
        log.info("Check en info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentHeadline.shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleEn));

                headOfDepartmentInfo.get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionEn));

                headOfDepartmentInfo.get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeEn));

                headOfDepartmentInfo.get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleEn));

                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(DepartmentTodayPage.class);
    }
}
