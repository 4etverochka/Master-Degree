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

    @Step
    public DepartmentTodayPage checkInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitle,
                                                               String position,
                                                               String scientificDegree,
                                                               String scientificTitle) {
        log.info("Check ru info on Head of department page.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver()
                        .switchTo()
                        .window(windowHandle);
                headOfDepartmentHeadline.shouldBe(visible)
                        .shouldHave(text(headOfDepartmentPageTitle));
                headOfDepartmentInfo.get(0)
                        .shouldBe(visible)
                        .shouldHave(text(position));
                headOfDepartmentInfo.get(1)
                        .shouldBe(visible)
                        .shouldHave(text(scientificDegree));
                headOfDepartmentInfo.get(2)
                        .shouldBe(visible)
                        .shouldHave(text(scientificTitle));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver()
                        .switchTo()
                        .window(parentWindow);
            }
        }
        return page(DepartmentTodayPage.class);
    }
}
