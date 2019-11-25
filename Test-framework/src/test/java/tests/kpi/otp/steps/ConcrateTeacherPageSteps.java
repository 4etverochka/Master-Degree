package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.ConcrateTeacherPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Log4j2
public class ConcrateTeacherPageSteps {
    private ConcrateTeacherPage concrateTeacherPage;

    public ConcrateTeacherPageSteps() {
        concrateTeacherPage = new ConcrateTeacherPage();
    }

    @Step("Check teacher's fio.")
    public ConcrateTeacherPageSteps checkTeachersFio(String expectedFio){
        log.info("Check teacher's fio.");
        assertThat("Invalid fio!",concrateTeacherPage.getFio().shouldBe(visible).getText(),equalTo(expectedFio));
        return this;
    }
}
