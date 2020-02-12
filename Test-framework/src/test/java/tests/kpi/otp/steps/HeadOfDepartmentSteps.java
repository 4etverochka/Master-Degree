package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.HeadOfDepartmentPage;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class HeadOfDepartmentSteps extends HomePageSteps {
    HeadOfDepartmentPage headOfDepartmentPage;

    public HeadOfDepartmentSteps() {
        headOfDepartmentPage = new HeadOfDepartmentPage();
    }


    @Step("Check ru info on Head of department page.")
    public DepartmentTodaySteps checkRuInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleRu,
                                                                  String positionRu,
                                                                  String scientificDegreeRu,
                                                                  String scientificTitleRu) {
        log.info("Check ru info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentPage.getHeadOfDepartmentHeadline()
                        .shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleRu));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionRu));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeRu));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleRu));

                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return new DepartmentTodaySteps();
    }

    @Step("Check ukr info on Head of department page.")
    public DepartmentTodaySteps checkUkrInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleUkr,
                                                                   String positionUkr,
                                                                   String scientificDegreeUkr,
                                                                   String scientificTitleUkr) {
        log.info("Check ukr info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentPage.getHeadOfDepartmentHeadline()
                        .shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleUkr));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionUkr));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeUkr));

                headOfDepartmentPage.getHeadOfDepartmentInfo()
                        .get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleUkr));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return new DepartmentTodaySteps();
    }

    @Step("Check en info on Head of department page.")
    public DepartmentTodaySteps checkEnInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitleEn,
                                                                  String positionEn,
                                                                  String scientificDegreeEn,
                                                                  String scientificTitleEn) {
        log.info("Check en info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);

                headOfDepartmentPage.getHeadOfDepartmentHeadline()
                        .shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitleEn));

                headOfDepartmentPage.getHeadOfDepartmentEnInfo()
                        .get(0)
                        .shouldBe(visible)
                        .shouldHave(text(positionEn));

                headOfDepartmentPage.getHeadOfDepartmentEnInfo()
                        .get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegreeEn));

                headOfDepartmentPage.getHeadOfDepartmentEnInfo()
                        .get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitleEn));

                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return new DepartmentTodaySteps();
    }
}
