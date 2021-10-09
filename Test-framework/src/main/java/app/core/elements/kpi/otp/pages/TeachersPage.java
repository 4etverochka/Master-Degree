package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TeachersPage extends HomePage {
    private ElementsCollection teachers = $$x("//div[@class='sc_team_member_inner']");
    private ElementsCollection teachersButton = $$x("//div[@class='sc_team_member_inner']/div/a");
    private SelenideElement currentTeacherTitle = $x("//h2[@class='post-title']");

    public TeachersPage clickOnTeacher(int number) {
        teachers.get(number)
                .shouldBe(visible)
                .hover();
        teachersButton.get(number)
                .click();
        return page(TeachersPage.class);
    }

    public TeachersPage checkCountTeachers(int expectedCount) {
        teachers.shouldHaveSize(expectedCount);
        return page(TeachersPage.class);
    }

    public HomePage checkTeachersFio(String expectedFio) {
        currentTeacherTitle
                .shouldBe(visible)
                .shouldHave(text(expectedFio));
        return page(HomePage.class);
    }
}
