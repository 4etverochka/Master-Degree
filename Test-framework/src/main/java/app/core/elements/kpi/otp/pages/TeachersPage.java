package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.page;

@Log4j2
public class TeachersPage extends HomePage{
    private ElementsCollection teachers = $$x("//div[@class='sc_team_member_inner']");

    public TeachersPage clickOnTeacher(int number) {
        log.info("Click on " + number + " teacher.");
        teachers.get(number)
                .shouldBe(visible)
                .click();
        return page(TeachersPage.class);
    }

    @Step("Check count teachers.")
    public TeachersPage checkCountTeachers(int expectedCount) {
        log.info("Check count teachers.");
        teachers.shouldHaveSize(expectedCount);
        return page(TeachersPage.class);
    }

    @Step("Check teacher's full name.")
    public HomePage checkTeachersFio(String expectedFio) {
        log.info("Check teacher's full name.");
       headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedFio));
        return page(HomePage.class);
    }
}
