package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.TeachersPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;

@Log4j2
public class TeachersPageSteps extends HomePageSteps{
    TeachersPage teachersPage;

    public TeachersPageSteps() {
        teachersPage = new TeachersPage();
    }

    @Step("Click on {number} teacher.")
    public TeachersPageSteps clickOnTeacher(int number) {
        log.info("Click on " + number + " teacher.");
        teachersPage.getTeachers()
                .get(number)
                .shouldBe(visible)
                .click();
        return new TeachersPageSteps();
    }

    @Step("Check count teachers.")
    public TeachersPageSteps checkCountTeachers(int expectedCount) {
        log.info("Check count teachers.");
        teachersPage.getTeachers().shouldHaveSize(expectedCount);
        return this;
    }

    @Step("Check teacher's fio.")
    public HomePageSteps checkTeachersFio(String expectedFio) {
        log.info("Check teacher's fio.");
        teachersPage.getHeaderFragment()
                .getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedFio));
        return new HomePageSteps();
    }
}
