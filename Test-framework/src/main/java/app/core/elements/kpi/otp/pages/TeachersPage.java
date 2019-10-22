package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class TeachersPage {
    private ElementsCollection teachers=$$x("//div[@class='sc_team_member_inner']");

    private SelenideElement logo=$x("//img[@id='sc_logo']");
}
