package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;

@Getter
public class TeachersPage {
    private ElementsCollection teachers = $$x("//div[@class='sc_team_member_inner']");
    private HeaderFragment headerFragment;

    public TeachersPage() {
        headerFragment = new HeaderFragment();
    }
}
