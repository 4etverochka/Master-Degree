package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HeadOfDepartmentPage extends HomePage {
    private SelenideElement headOfDepartmentHeadline = $x("//article/h2");
    private ElementsCollection headOfDepartmentInfo = $$x("//p//em");

    public DepartmentTodayPage checkInfoOnHeadOfDepartmentPage(String headOfDepartmentPageTitle,
                                                               String position,
                                                               String scientificDegree,
                                                               String scientificTitle) {
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