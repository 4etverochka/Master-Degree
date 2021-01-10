package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.page;

@Log4j2
public class TeachersPage extends HomePage {
    private ElementsCollection teachers = $$x("//div[@class='sc_team_member_inner']");

    public TeachersPage clickOnTeacher(int number) {
        teachers.get(number)
                .shouldBe(visible)
                .click();
        return page(TeachersPage.class);
    }

    public TeachersPage checkCountTeachers(int expectedCount) {
        teachers.shouldHaveSize(expectedCount);
        return page(TeachersPage.class);
    }

    public HomePage checkTeachersFio(String expectedFio) {
        headerFragment.getTitle()
                .shouldBe(visible)
                .shouldHave(text(expectedFio));
        return page(HomePage.class);
    }
}
