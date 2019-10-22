package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.TeachersPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Log4j2
public class TeachersPageSteps {
    TeachersPage teachersPage;

    public TeachersPageSteps() {
        teachersPage = new TeachersPage();
    }

    @Step("Click on {number} teacher.")
    public ConcrateTeacherPageSteps clickOnTeacher(int number) {
        log.info("Click on "+number+" teacher.");
        teachersPage.getTeachers()
                .get(number)
                .shouldBe(visible)
                .click();

        return new ConcrateTeacherPageSteps();
    }

    @Step("Check count teachers.")
    public TeachersPageSteps checkCountTeachers(int expectedCount) {
        log.info("Check count teachers.");
        assertThat("Invalid teachers count!",teachersPage.getTeachers().size(), equalTo(expectedCount));

        return this;
    }

    @Step("Return to home page.")
    public HomePageSteps returnToHomePage(){
        log.info("Return to home page.");
        teachersPage.getLogo()
                .click();

        return new HomePageSteps();
    }
}
